package Simon;

import guiPractice8.component.Visible;

public interface ProgressInterfaceJoey extends Visible {

	void setRound(int roundNumber);
	
	void setSequenceSize(int sequenceNumber);
		
	void gameOver();
}
