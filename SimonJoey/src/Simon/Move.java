package Simon;

public class Move implements MoveInterfaceJoey{

	private ButtonInterfaceJoey button;
	
	public Move(ButtonInterfaceJoey button){
		this.button = button;
	}
	
	public ButtonInterfaceJoey getButton() {
		return button;
	}

}
