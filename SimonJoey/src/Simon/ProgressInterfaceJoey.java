package Simon;

import java.awt.Graphics2D;

import guiPractice.component.Visible;

public interface ProgressInterfaceJoey extends Visible {
	
	void gameOver();
	void setRound(int x);
	void setSequenceSize(int x);
	void update(Graphics2D g);
	
}
