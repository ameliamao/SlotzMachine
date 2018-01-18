package slotzMachine;

public class Cherry extends Sprite{
	public Cherry(int x, int y) {
		super(x,y);
		String string = "cherry";
		final int multiplier = 1;
		cherry();
	}
	public void cherry() {
		loadImage("./res/cherry.png");
		getImageDimensions();
	}

}
