package slotzMachine;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Machine extends JPanel implements ActionListener{
	
	private Bar1 bar1;
	private Bar2 bar2;
	private Bar3 bar3;
	private Pull pull;
	private Bell bell;
	private Cherry cherry;
	private Jackpot jackpot;
	private Seven seven;
	
	public Machine() {
	}
	
	public static int randNumGenerate(int num) {
		int newNum;
		newNum = (int) (Math.random()*num);
		return newNum;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}
	
	private void draw(Graphics g) {
		g.drawImage(img, x, y, observer);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
