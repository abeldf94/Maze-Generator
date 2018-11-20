package algorithm;

import board.MazeGrid;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 17 nov. 2018
 *
 *		Abstract definition for implement a generation algorithm. It will need at 
 *		least the elements that this class has.
 */
public abstract class MazeAlgorithm {
	
	private MazeGrid maze; // The maze
	private Integer columns; // The columns
	private Integer rows; // The rows
	
	/**
	 * Instantiates a new maze algorithm.
	 *
	 * @param maze the maze itself
	 * @param columns the size of columns
	 * @param rows the size of rows
	 */
	public MazeAlgorithm(MazeGrid maze, Integer columns, Integer rows) {
		super();
		this.maze = maze;
		this.columns = columns;
		this.rows = rows;
	}

	/**
	 * All the algorithms must have a start function for it.
	 */
	public abstract void computeAlgorithm();

	/**
	 * Gets the maze.
	 *
	 * @return the maze
	 */
	public MazeGrid getMaze() {
		return maze;
	}

	/**
	 * Gets the size of columns.
	 *
	 * @return the columns size
	 */
	public Integer getColumns() {
		return columns;
	}

	/**
	 * Gets the size of  rows.
	 *
	 * @return the rows size
	 */
	public Integer getRows() {
		return rows;
	}
	
}
