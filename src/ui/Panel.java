package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import board.MazeGrid;
import cell.MazeCell;
import cell.Point;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 17 nov. 2018
 *
 *		Panel that prints the maze using graphics.
 */
public class Panel extends JPanel {

	/** The serial UID. */
	private static final long serialVersionUID = 1L;
	private MazeGrid maze; // The maze itself
	private MazeCell current; // Current cell for highlight

	/**
	 * Instantiates a new panel.
	 *
	 * @param maze the maze
	 */
	public Panel(MazeGrid maze) {
		this.maze = maze;
		setPreferredSize(new Dimension(maze.getWidth() * maze.getCELL_SIZE(), maze.getHeight() * maze.getCELL_SIZE()));
	}

	@Override
	protected void paintComponent(Graphics graphic) {
		super.paintComponent(graphic);

		Point<Integer> start = maze.getStart();
		Point<Integer> end = maze.getEnd();

		Integer pixels = maze.getCELL_SIZE();

		Integer startX = 0;
		Integer startY = 0;
		Integer endX = startX + pixels;
		Integer endY = startY + pixels;

		for (int y = 0; y < maze.getHeight(); y++) {
			startX = 0;
			endX = startX + pixels;
			for (int x = 0; x < maze.getWidth(); x++) {				
				MazeCell cell = maze.getGrid().getElement(x, y);
				
				if (cell.isVisited()) {
					Color backup = graphic.getColor();
					graphic.setColor(Color.PINK);
					graphic.fillRect(startX, startY, pixels, pixels);
					graphic.setColor(backup);
				}
				
				if (current != null && current.getX() == cell.getX() && current.getY() == cell.getY()) {
					Color backup = graphic.getColor();
					graphic.setColor(Color.MAGENTA);
					graphic.fillRect(startX, startY, pixels, pixels);
					graphic.setColor(backup);
				}

				if (cell.hasNorthWall()) {
					graphic.drawLine(startX, startY, endX, startY);
				}
				if (cell.hasSouthWall()) {
					graphic.drawLine(startX, endY, endX, endY);
				}
				if (cell.hasEastWall()) {
					graphic.drawLine(endX, startY, endX, endY);
				}
				if (cell.hasWesthWall()) {
					graphic.drawLine(startX, startY, startX, endY);
				}
				
				// Draw end and start points
				if (x == start.getX() && y == start.getY()) {
					Color backup = graphic.getColor();
					graphic.setColor(Color.GREEN);
					graphic.fillRect(startX, startY, pixels, pixels);
					graphic.setColor(backup);
				} else if (x == end.getX() && y == end.getY()) {
					Color backup = graphic.getColor();
					graphic.setColor(Color.RED);
					graphic.fillRect(startX, startY, pixels, pixels);
					graphic.setColor(backup);
				}
				startX += pixels; 
				endX += pixels;
			}
			startY += pixels;
			endY += pixels;
		}
	}
	
	/**
	 * Sets the current cell.
	 *
	 * @param current the new current cell
	 */
	public void setCurrent(MazeCell current) {
		this.current = current;
	}
}
