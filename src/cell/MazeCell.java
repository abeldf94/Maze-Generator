package cell;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 17 nov. 2018
 *
 *		A cell representation for a maze grid. It has a location in 2D spaces.
 */
public class MazeCell extends AbstractCell {

	/**
	 * Instantiates a new maze cell.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public MazeCell(Integer x, Integer y) {
		super(x, y);
	}

	@Override
	public Point<Integer> getLocation() {
		return new Point<Integer>(getX(), getY());
	}
}
