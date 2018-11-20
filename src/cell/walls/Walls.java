package cell.walls;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 17 nov. 2018
 *
 *		Abstract implementation for elements with four walls in 2D environments.
 */
public abstract class Walls {
	
	public Boolean north; // North wall
	public Boolean south; // South wall
	public Boolean east; // East wall
	public Boolean west; // West wall
	
	/**
	 * Instantiates a new square walls.
	 */
	public Walls() {
		north = true;
		south = true;
		east = true;
		west = true;
	}
	
	/**
	 * Checks for north wall.
	 *
	 * @return the boolean true or false
	 */
	public Boolean hasNorthWall() {
		return north;
	}
	
	/**
	 * Checks for south wall.
	 *
	 * @return the boolean true or false
	 */
	public Boolean hasSouthWall() {
		return south;
	}
	
	/**
	 * Checks for east wall.
	 *
	 * @return the boolean true or false
	 */
	public Boolean hasEastWall() {
		return east;
	}
	
	/**
	 * Checks for westh wall.
	 *
	 * @return the boolean true or false
	 */
	public Boolean hasWesthWall() {
		return west;
	}

	/**
	 * Change the status of the north wall.
	 *
	 * @param north the new north wall
	 */
	public void setNorth(Boolean north) {
		this.north = north;
	}

	/**
	 * Change the status of the south wall.
	 *
	 * @param south the new south wall
	 */
	public void setSouth(Boolean south) {
		this.south = south;
	}

	/**
	 * Change the status of the east wall.
	 *
	 * @param east the new east wall
	 */
	public void setEast(Boolean east) {
		this.east = east;
	}

	/**
	 * Change the status of the west wall.
	 *
	 * @param west the new west wall
	 */
	public void setWest(Boolean west) {
		this.west = west;
	}	
}
