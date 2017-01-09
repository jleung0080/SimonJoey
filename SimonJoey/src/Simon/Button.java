package Simon;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import guiPractice.component.Action;

import guiPractice.component.Component;


public class Button extends Component implements ButtonInterfaceJoey{

	private Color c;
	private Color currentColor;
	private boolean highlight;
	private Action action;
	
	public Button(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void setColor(Color c) {
		this.c = c;
		currentColor = c;
		update();
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void highlight() {
		if(c!=null){
			currentColor = c;
		}
		highlight = true;
		update();
	}

	@Override
	public void dim() {
		currentColor = Color.lightGray;
		highlight = false;
		update();
	}

	@Override
	public void act() {
		action.act();
	}

	@Override
	public boolean isHovered(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
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
	public void update(Graphics2D arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAction(Action action) {
		this.action = action;;
	}

}
