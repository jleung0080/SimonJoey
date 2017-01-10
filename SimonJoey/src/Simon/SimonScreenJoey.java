package Simon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiPractice.component.Action;
import guiPractice.component.ClickableScreen;
import guiPractice.component.TextLabel;
import guiPractice.component.Visible;

public class SimonScreenJoey extends ClickableScreen implements Runnable{
	private TextLabel label;
	private ButtonInterfaceJoey[] buttons;
	private ProgressInterfaceJoey progress;
	private ArrayList<MoveInterfaceJoey> sequence;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;


	public SimonScreenJoey(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		int numberOfButtons = 4;
		buttons = new ButtonInterfaceJoey[numberOfButtons];
		Color[] colors = {Color.magenta, Color.blue, Color.red, Color.green};
		for(int i = 0; i<numberOfButtons;i++){
			final ButtonInterfaceJoey b = getAButton();
			b.setColor(colors[i]);
			b.setX((int)(Math.cos(.25+(i*.5))*10));
			b.setY((int)(Math.sin(.25+(i*.5))*10));
			b.setAction(new Action(){
				public void act(){
					if(acceptingInput){
						Thread blink = new Thread(new Runnable(){
							public void run(){
								b.highlight();
								try {
									Thread.sleep(800);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								b.dim();
							}
						});
						blink.start();
						
						
						
						if(acceptingInput && sequence.get(sequenceIndex).getButton() == b) sequenceIndex++;
						else if(acceptingInput){
							progress.gameOver();
							return;
						}
						if(sequenceIndex == sequence.size()){
							Thread nextRound = new Thread(SimonScreenJoey.this);
							nextRound.start();
						}
					}
				}});
			viewObjects.add(b);
		}
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceJoey>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}




	private MoveInterfaceJoey randomMove() {
		int pick = (int)(Math.random()*buttons.length);
		while(pick == lastSelectedButton){
			pick = (int)(Math.random()*buttons.length);
		}
		lastSelectedButton = pick;
		//code that randomly selects a ButtonInterfaceX
		return new Move(buttons[pick]);
	}


//	private MoveInterfaceJoey getMove(ButtonInterfaceJoey buttonInterfaceJoey) {
//		// TODO Auto-generated method stub
//		return new Move(buttonInterfaceJoey);
//	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	 */
	private ProgressInterfaceJoey getProgress() {
		return new Progress();
	}

	private void addButtons() {}

	private ButtonInterfaceJoey getAButton() {
		return new Button();
	}

	@Override
	public void run() {
		label.setText("");
		nextRound();
	}

	private void playSequence(){
		ButtonInterfaceJoey b = null;
		for(int i =0;i<sequence.size();i++){
			if(b != null){
				b.dim();
			}
			b = sequence.get(i).getButton();
			b.highlight();
			int sleepTime =2500;
			for(int j=0;j<roundNumber;j++){
				if((int)(sleepTime-250)>0){
					sleepTime-=250;
				}
			}
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}


	private void nextRound() {
		acceptingInput = false;
		roundNumber++;
		progress.setRound(roundNumber);
		sequence.add(randomMove());
		progress.setSequenceSize(sequence.size());
		changeText("Simon's turn");
		label.setText("");
		playSequence();
		changeText("Your Turn");
		label.setText("");
		acceptingInput = true;
		sequenceIndex=0;
	}

	private void changeText(String string) {
		// TODO Auto-generated method stub
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
