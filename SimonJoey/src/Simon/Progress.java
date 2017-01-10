package Simon;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import guiPractice8.component.Component;

public class Progress extends Component implements ProgressInterfaceJoey {

	private boolean gameOver;
	private String round;
	private String sequence;
	private static final int WIDTH = 125;
	private static final int HEIGHT = 85;
	
	public Progress(){
		super(60,60, WIDTH, HEIGHT);
	}
	
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
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		FontMetrics fm = g.getFontMetrics();
		if(gameOver){
			g.setColor(Color.red);
			g.fillRect(0, 0, WIDTH, HEIGHT);
			g.setColor(Color.black);
			String go = "Game Over!";
			g.drawString(go, (WIDTH - fm.stringWidth(go))/2, 20);
			g.drawString(sequence, (WIDTH - fm.stringWidth(sequence))/2, 40);
			

		}else{
			g.setColor(Color.orange);
			g.fillRect(0, 0, WIDTH, HEIGHT);
			g.setColor(Color.black);
			if(round !=null && sequence != null){

				g.drawString(round, (getWidth() - fm.stringWidth(round))/2, 20);
				g.drawString(sequence, (getWidth() - fm.stringWidth(sequence))/2, 40);
			}
		}
	}
}
