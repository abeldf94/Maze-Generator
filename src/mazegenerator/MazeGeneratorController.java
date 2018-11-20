package mazegenerator;

import java.awt.BorderLayout;

import algorithm.backtracking.RecursiveBacktracker;
import board.MazeGrid;
import cell.Point;
import matrix.Matrix;
import ui.Frame;
import ui.Panel;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 17 nov. 2018
 *
 *		Controller of the program, it initialize the GUI and starts the algorithm
 *		that generates the maze. Simpler MVC pattern.
 */
public class MazeGeneratorController {
	
	private Frame frame; // The frame
	private Panel panel; // The panel
	private MazeGrid maze; // The maze
	
	/**
	 * Instantiates a new maze controller.
	 */
	public MazeGeneratorController() {
		
		maze = new MazeGrid(new Point<Integer>(0,0), new Point<Integer>(39, 29), new Matrix(40, 40));
		maze.initializeGrid();
		
		frame = new Frame();
		panel = new Panel(maze);
		frame.add(panel, BorderLayout.CENTER);
	}
	
	/**
	 * Enable the GUI.
	 */
	public void enableGUI() {
		getFrame().pack();
		getFrame().setLocationRelativeTo(null); // Centers the window
		getFrame().setVisible(true);
	}
	
	/**
	 * Generate the maze paths.
	 */
	public void generateMaze() {
		RecursiveBacktracker generator = new RecursiveBacktracker(maze, maze.getWidth(), maze.getHeight(), panel);
		generator.computeAlgorithm();
	}

	/**
	 * Gets the frame.
	 *
	 * @return the frame
	 */
	public Frame getFrame() {
		return frame;
	}
}
