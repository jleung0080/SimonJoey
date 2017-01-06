package Simon;

import java.awt.Color;

import javax.swing.Action;

import guiPractice.component.Clickable;

public interface ButtonInterfaceJoey extends Clickable{
	void setColor(Color c);
	void setX(int x);
	void setY(int y);
	void setAction(Action a);
	void highlight();
	void dim();
}
