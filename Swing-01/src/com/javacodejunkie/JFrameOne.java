package com.javacodejunkie;

import javax.swing.JFrame;

public class JFrameOne extends JFrame {
	
	public JFrameOne() {
		initialize();
	}
	
	public void initialize() {
		this.setTitle("JFrameOne");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500, 400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

}
