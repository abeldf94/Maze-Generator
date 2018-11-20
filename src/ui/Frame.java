package ui;

import javax.swing.JFrame;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 17 nov. 2018
 *
 *		Custom frame for a simpler GUI
 */
public class Frame extends JFrame{

	/** The serial UID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new frame.
	 */
	public Frame() {
		setTitle("Maze generator");
		setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
	}
}
