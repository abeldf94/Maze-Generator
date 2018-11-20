package matrix;

import cell.MazeCell;
import cell.Point;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 17 nov. 2018
 *
 *		Matrix for manage maze cells in 2D space. Allow fast access with primitive array.
 */
public class Matrix {
	private Integer columns; // Matrix's columns
	private Integer rows; // Matrix's rows
	private MazeCell[][] matrix; // The matrix itself 
	
	/**
	 * Instantiates a new matrix with a size.
	 *
	 * @param columns the matrix's columns
	 * @param rows the matrix's rows
	 */
	public Matrix(Integer columns, Integer rows) {
		this.columns = columns;
		this.rows = rows;
		matrix = new MazeCell[columns][rows];
	}
	
	/**
	 * Sets a cell in a position.
	 *
	 * @param point the 2D point
	 * @param cell the cell
	 */
	public void setElement(Point<Integer> point, MazeCell cell) {
		matrix[point.getX()][point.getY()] = cell;
	}
	
	/**
	 * Gets the cell at the specified point.
	 *
	 * @param point the 2D point
	 * @return the cell in that point
	 */
	public MazeCell getElement(Integer x, Integer y) {
		if (x >= 0 && x < getColumns() && y >= 0 && y < getRows())
			return matrix[x][y];
		else
			return null;
	}
	
	/**
	 * Resize matrix and delete previous data.
	 *
	 * @param columns the matrix's columns
	 * @param rows the matrix's rows
	 */
	public void resize(Integer columns, Integer rows) {
		setColumns(columns);
		setRows(rows);
		matrix = new MazeCell[columns][rows];
	}
	
	/**
	 * Size of the matrix.
	 *
	 * @return the size
	 */
	public Integer size() {
		return columns * rows;
	}

	/**
	 * Gets the columns size.
	 *
	 * @return the columns size
	 */
	public Integer getColumns() {
		return columns;
	}

	/**
	 * Sets the new columns size.
	 *
	 * @param columns the size number
	 */
	private void setColumns(Integer columns) {
		this.columns = columns;
	}

	/**
	 * Gets the rows size.
	 *
	 * @return the rows size
	 */
	public Integer getRows() {
		return rows;
	}

	/**
	 * Sets the new rows size.
	 *
	 * @param rows the size number
	 */
	private void setRows(Integer rows) {
		this.rows = rows;
	}
}
