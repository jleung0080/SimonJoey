package Simon;

import java.awt.Color;

<<<<<<< HEAD
import guiPractice8.component.Action;
import guiPractice8.component.Clickable;
=======
import javax.swing.Action;

import guiPractice.component.Clickable;

>>>>>>> branch 'master' of https://github.com/jleung0080/SimonJoey.git

public interface ButtonInterfaceJoey extends Clickable{
	void setColor(Color c);
	void setX(int x);
	void setY(int y);
	void setAction(Action a);
	void highlight();
	void dim();
}
