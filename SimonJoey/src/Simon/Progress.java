package Simon;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Progress implements ProgressInterfaceJoey {

	private boolean gameOver;
	private String round;
	
	@Override
	public void gameOver() {
		gameOver = true;
		update();
	}

	@Override
	public void setRound(int x) {
		round = "Round: " + x;
		update();
	}

	@Override
	public void setSequenceSize(int x) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
