package Simon;

import guiPractice8.GUIApplication;

public class SimonGameJoey extends GUIApplication {

	public SimonGameJoey() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		SimonScreenJoey ssj = new SimonScreenJoey(getWidth(), getHeight());
		setScreen(ssj);
	}

	public static void main(String[] args) {
		SimonGameJoey game = new SimonGameJoey();
		Thread app = new Thread(game);
		app.start();
	}

}
