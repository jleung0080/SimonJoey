package Simon;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import guiPractice.component.Action;

import guiPractice.component.Component;


public class Button extends Component implements ButtonInterfaceJoey{

	private Color c;
	private Color currentColor;
	private boolean highlight;
	private Action action;
	
	public Button() {
		super(0, 0, 50, 50);
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
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(currentColor != null) g.setColor(currentColor);
		else g.setColor(Color.gray);
		g.fillOval(0, 0, getWidth(), getHeight());
		g.setColor(Color.black);
		g.drawOval(0, 0, getWidth()-1, getHeight()-1);
		if(highlight){
			g.setColor(Color.white);
			Polygon p = new Polygon();
			
			int s = (int)(5/8.0 * getWidth());
			int t = (int)(1.0/5*getHeight())+4;
			p.addPoint(s-4, t-4);
			p.addPoint(s+7, t-2);
			p.addPoint(s+10, t);
			p.addPoint(s+14, t+10);
			p.addPoint(s+12, t+14);
			p.addPoint(s+8, t+3);
			g.fill(p);
		}
	}

	@Override
	public void setAction(Action action) {
		this.action = action;;
	}

}
