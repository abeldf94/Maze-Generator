package mazegenerator;

/**
 * @author Abel Delgado Falcón (<a href="mailto:alu0100792218@ull.edu.es">)
 * @version 1.0 
 * @date 17 nov. 2018
 *
 *		Main class for put the main method separated from program.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			MazeGeneratorController controller = new MazeGeneratorController();
			controller.enableGUI();
			controller.generateMaze();
		}catch (Exception error) {
			System.err.println(error.getMessage());
			error.printStackTrace();
		}
	}

}
