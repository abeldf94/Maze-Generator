package cell;

import cell.walls.Walls;

/**
 * The Class AbstractCell.
 *
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0
 * @date 17 nov. 2018
 * 
 * 		Abstract representation of a cell that can be placed in a grid 2D.
 */
public abstract class AbstractCell extends Walls {
	
	/** The visited. */
	private Boolean visited; // Was cell visited?
	
	/** The x. */
	private Integer x; // X position represents the column in the maze
	
	/** The y. */
	private Integer y; // Y position represents the row in the maze
	
	/**
	 * Instantiates a new abstract cell.
	 *
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public AbstractCell(Integer x, Integer y) {
		this.x = x;
		this.y = y;
		visited = false;
	}

	/**
	 * Return an object that represent a 2D point.
	 *
	 * @return the location of the point
	 */
	public abstract Point<Integer> getLocation();

	/**
	 * Checks if is visited.
	 *
	 * @return the boolean true or false
	 */
	public Boolean isVisited() {
		return visited;
	}
	
	/**
	 * Sets the cell as visited or not.
	 *
	 * @param visited the boolean true or false
	 */
	public void setVisited(Boolean visited) {
		this.visited = visited;
	}

	/**
	 * Gets the x coordinate of the cell.
	 *
	 * @return the x position 
	 */
	public Integer getX() {
		return x;
	}

	/**
	 * Gets the y coordinate of the cell.
	 *
	 * @return the y position 
	 */
	public Integer getY() {
		return y;
	}
	
}
