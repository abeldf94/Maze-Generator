package board;

import cell.MazeCell;
import cell.Point;
import matrix.Matrix;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 17 nov. 2018
 *
 *		Grid that contains the maze and initialize it with the cells
 */
public class MazeGrid {
	
	private Point<Integer> start; // Contain the position of the maze cell where game starts
	private Point<Integer> end; // Contain the position of the maze cell where game ends
	
	private final Integer CELL_SIZE = 20; // Size in pixels (size x size for 2D)
	private Integer width; // Number of columns
	private Integer height; // Number of rows
	private Matrix grid; // Grid of cells

	/**
	 * Instantiates a new maze grid.
	 *
	 * @param start the start point
	 * @param end the end point
	 * @param maze the maze matrix
	 */
	public MazeGrid(Point<Integer> start, Point<Integer> end, Matrix maze) {
		super();
		this.start = start;
		this.end = end;
		this.grid = maze;
		width = maze.getColumns();
		height = maze.getRows();
		initializeGrid();
	}
	
	/**
	 * Initialize the grid with maze cells.
	 */
	public void initializeGrid() {
		for(int x = 0; x < width; x++) {
			for(int y = 0; y < height; y++) {
				grid.setElement(new Point<Integer>(x, y), new MazeCell(x, y));
			}
		}
	}

	/**
	 * Gets the start point for the maze.
	 *
	 * @return the start
	 */
	public Point<Integer> getStart() {
		return start;
	}

	/**
	 * Gets the end point for the maze.
	 *
	 * @return the end
	 */
	public Point<Integer> getEnd() {
		return end;
	}
	
	/**
	 * Gets the grid with the maze.
	 *
	 * @return the grid
	 */
	public Matrix getGrid() {
		return grid;
	}

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * Gets the cell size in pixels.
	 *
	 * @return the cell size
	 */
	public Integer getCELL_SIZE() {
		return CELL_SIZE;
	}
}
