package algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

import algorithm.MazeAlgorithm;
import board.MazeGrid;
import cell.MazeCell;
import cell.Point;
import ui.Panel;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 18 nov. 2018
 *
 *		Depth-first search algorithm of maze generation implemented using backtracking
 */
public class RecursiveBacktracker extends MazeAlgorithm {
	
	private Panel panel; // The panel for repaint on every step of the algorithm;
	
	/**
	 * Instantiates a new recursive backtracker.
	 *
	 * @param maze the maze
	 * @param columns the columns
	 * @param rows the rows
	 * @param panel the panel
	 */
	public RecursiveBacktracker(MazeGrid maze, Integer columns, Integer rows, Panel panel) {
		super(maze, columns, rows);
		this.panel = panel;
	}

	/**
	 * Algorithm from the Wikipedia
	 * 
	 * 1. Make the initial cell the current cell and mark it as visited 
	 * 2. While there are unvisited cells 
	 * 		1. If the current cell has any neighbors which have not been visited 
	 * 			1. Choose randomly one of the unvisited neighbors 
	 * 			2. Push the current cell to the stack 
	 * 			3. Remove the wall between the current cell and the chosen cell 
	 * 			4. Make the chosen cell the current cell and mark it as visited
	 * 
	 * 		2. Else if stack is not empty 
	 * 			1. Pop a cell from the stack 
	 * 			2. Make it the current cell
	 */

	@Override
	public void computeAlgorithm() {
		Point<Integer> start = getMaze().getStart();
		Stack<MazeCell> stack = new Stack<>();
		// Make the initial cell the current cell and mark it as visited
		MazeCell current = getMaze().getGrid().getElement(start.getX(), start.getY());
		current.setVisited(true);
		
		Integer visitedCells = 1; // Start cell was visited already
		Integer amountCells = getMaze().getGrid().getColumns() * getMaze().getGrid().getRows();
		while (visitedCells < amountCells) {
			try { Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();} // Slow algorithm for visualization
			// If the current cell has any neighbors which have not been visited 
			List<MazeCell> neighbors = findNeighbors(current.getX(), current.getY());
			// Choose randomly one of the unvisited neighbors
			MazeCell next = chooseRandom(neighbors);
			
			if (next != null) { // This mean that a neighbor exists and is not visited
				// Push the current cell to the stack 
				stack.push(current);
				// Remove the wall between the current cell and the chosen cell
				removeWalls(current, next);
				// Make the chosen cell the current cell and mark it as visited
				current = next;
				current.setVisited(true);
				visitedCells++;
			} else if (!stack.isEmpty()){
				current = stack.pop();
			}
			panel.setCurrent(current);
			panel.repaint();
		}
		panel.setCurrent(null);
		panel.repaint();
	}
	
	/**
	 * Removes the walls between the current and next cells.
	 *
	 * @param current the current cell
	 * @param next the next cell
	 */
	private void removeWalls(MazeCell current, MazeCell next) {
		if (!current.getX().equals(next.getX())) {
			Integer dif = current.getX() - next.getX();
			if (dif == 1) { 
				current.setWest(false);
				next.setEast(false);
			} else if (dif == -1) {
				current.setEast(false);
				next.setWest(false);
			}	
		}else if (!current.getY().equals(next.getY())) {
			Integer dif = current.getY() - next.getY();
			if (dif == 1) {
				current.setNorth(false);
				next.setSouth(false);
			} else if (dif == -1) {
				current.setSouth(false);
				next.setNorth(false);
			}	
		} else {
			System.out.println("no se ha borrado :L");
		}
	}
	
	/**
	 * Find the neighbors of the current cell.
	 *
	 * @param x the x position of the current cell
	 * @param y the y position of the current cell
	 * @return the list with the available neighbors
	 */
	private List<MazeCell> findNeighbors(Integer x, Integer y) {
		
		List<MazeCell> neighbors = new ArrayList<MazeCell>();
		
		MazeCell north = getMaze().getGrid().getElement(x, y - 1);
		MazeCell south = getMaze().getGrid().getElement(x, y + 1);
		MazeCell east = getMaze().getGrid().getElement(x + 1, y);
		MazeCell west = getMaze().getGrid().getElement(x - 1, y);
		
		if (north != null && !north.isVisited())
			neighbors.add(north);
		
		if (south != null && !south.isVisited())
			neighbors.add(south);
		
		if (east != null && !east.isVisited())
			neighbors.add(east);
		
		if (west != null && !west.isVisited())
			neighbors.add(west);
		
		return neighbors;
	}
	
	/**
	 * Choose a random neighbor from the list.
	 *
	 * @param neighbors the neighbors
	 * @return the maze cell
	 */
	private MazeCell chooseRandom(List<MazeCell> neighbors) {
		return (neighbors.size() > 0) ? neighbors.get(new Random().nextInt(neighbors.size())) : null;
	}

}
