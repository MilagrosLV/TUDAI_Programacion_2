package com.javacodejunkie;

import javax.swing.JFrame;

public class JFrameTwo {
	private JFrame f;
	
	public JFrameTwo() {
		initialize();
	}
	
	public void initialize() {
		f = new JFrame();
		
		this.f.setTitle("JFrameTwo");
		this.f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.f.setSize(500, 400);
		this.f.setVisible(true);
		this.f.setLocationRelativeTo(null);
		this.f.setResizable(false);
	}
}
