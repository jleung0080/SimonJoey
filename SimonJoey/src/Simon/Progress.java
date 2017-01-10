package Simon;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Progress implements ProgressInterfaceJoey {

	private boolean gameOver;
	private String round;
	private String sequence;
	
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
		sequence = "Sequence length "+ x;
		update();
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
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		FontMetrics fm = g.getFontMetrics();
		if(gameOver){
			g.setColor(new Color(255,55,90));
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.white);
			String go = "GAME OVER!";
			g.drawString(go, (getWidth() - fm.stringWidth(go))/2, 20);
			g.drawString(sequence, (getWidth() - fm.stringWidth(sequence))/2, 40);

		}else{
			g.setColor(new Color(220,255,230));
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.black);
			g.drawRect(0, 0, getWidth()-1, getHeight()-1);
			if(round !=null && sequence != null){

				g.drawString(round, (getWidth() - fm.stringWidth(round))/2, 20);
				g.drawString(sequence, (getWidth() - fm.stringWidth(sequence))/2, 40);
			}
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
