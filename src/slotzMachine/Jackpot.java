package slotzMachine;

public class Jackpot extends Sprite{
	public Jackpot(int x, int y) {
		super(x,y);
		String string = "jackpot";
		final int multiplier = 10000;
		jackpot();
	}
	
	public void jackpot() {
		loadImage("sdfgch");
		getImageDimensions();
	}

}
