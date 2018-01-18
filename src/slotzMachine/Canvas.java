package slotzMachine;


import java.awt.EventQueue;

import javax.swing.JFrame;

public class Canvas extends JFrame{

	public Canvas() {
		initUI();
	}
	
	private void initUI() {
		add(new Machine());
		setResizable(false);
		pack();
		
		setTitle("Slotz Machine");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Canvas vas = new Canvas();
				vas.setVisible(true);
			}
		});
	}
}
