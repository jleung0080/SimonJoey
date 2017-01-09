package Simon;

import guiPractice8.GUIApplication;

public class SimonGameJoey extends GUIApplication {

	public SimonGameJoey() {
		// TODO Auto-generated constructor stub
	}

	public SimonGameJoey(int i, int j) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		SimonScreenJoey ssj = new SimonScreenJoey(getWidth(), getHeight());
		setScreen(ssj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimonGameJoey game = new SimonGameJoey();
		Thread app = new Thread(game);
		app.start();
	}

}
