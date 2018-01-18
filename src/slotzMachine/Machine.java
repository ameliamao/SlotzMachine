package slotzMachine;

import java.awt.Color;
import java.awt.Dimension;
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
	private Cherry cherry = new Cherry(200, 200);
	private Jackpot jackpot;
	private Seven seven;
	private MachineImage mach = new MachineImage(0,0);
	
	public Machine() {
		initMachine();
	}
	
	private void initMachine() {
		setFocusable(true);
		setBackground(Color.BLACK);
		
		setPreferredSize(new Dimension(750, 500));
		
		
	}
	
	public static int randNumGenerate(int num) {
		int newNum;
		newNum = (int) (Math.random()*num);
		return newNum;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
		
	}
	
	private void draw(Graphics g) {
		g.drawImage(mach.getImage(), mach.getX(), mach.getY(), this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	


}
