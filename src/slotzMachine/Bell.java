package slotzMachine;

public class Bell extends Sprite{
	public Bell(int x, int y) {
		super(x,y);
		String string = "bell";
		final int multiplier = 2;
		bell();
	}
	
	public void bell() {
		loadImage("sdfgch");
		getImageDimensions();
	}

}
