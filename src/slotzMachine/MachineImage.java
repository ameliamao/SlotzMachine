package slotzMachine;

public class MachineImage extends Sprite{

	public MachineImage(int x, int y) {
		super(x,y);
		String string = "machineImage";
		cherry();
	}
	public void cherry() {
		loadImage("./res/slotzMachine.png");
		getImageDimensions();
	}
}
