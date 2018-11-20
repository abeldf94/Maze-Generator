package cell;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 17 nov. 2018
 *
 *		Represent a position x and y for 2D spaces.
 */
public class Point<Type> {
	
	private Type x; // X location in 2D space
	private Type y; // Y location in 2D space
	
	/**
	 * Instantiates a new point 2D.
	 *
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public Point(Type x, Type y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Gets the x coordinate.
	 *
	 * @return the x coordinate
	 */
	public Type getX() {
		return x;
	}

	/**
	 * Gets the y coordinate.
	 *
	 * @return the y coordinate
	 */
	public Type getY() {
		return y;
	}
}
