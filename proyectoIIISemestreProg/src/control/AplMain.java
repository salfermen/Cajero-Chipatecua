package control;

import view.*;

public class AplMain {
	public static void main(String[] args) {
		Controller controller = new Controller();
		ViewConsole viewConsole = new ViewConsole(controller);
		viewConsole.mostrarMenu();
	}
}
