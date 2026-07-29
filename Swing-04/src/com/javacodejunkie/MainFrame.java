package com.javacodejunkie;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame {

	private JFrame f;
	
	public MainFrame() {
		initialize();
	}
	
	//Métodos
	public void initialize() {
		 f = new JFrame();
		 
		 f.setTitle("BorderPane Demo");
		 f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 f.setSize(800, 500);
		 f.setLocationRelativeTo(null);
		 
		 //Usar BorderLayout sin las gaps entre componentes
		 f.setLayout(new BorderLayout(10, 10));
		 
		 //hago botones
		 JButton bn = new JButton("NORTH");
		 JButton bs = new JButton("SOUTH");
		 JButton bw = new JButton("WEST");
		 JButton be = new JButton("EAST");
		 JButton bc = new JButton("CENTER");
		 //Color de botón fondo y letra 
		 bn.setBackground(Color.MAGENTA);
		 bs.setBackground(Color.BLACK);
		 bw.setBackground(Color.DARK_GRAY);
		 be.setBackground(Color.LIGHT_GRAY);
		 bc.setBackground(Color.PINK);
		 
		 bn.setForeground(Color.WHITE);
		 bs.setForeground(Color.WHITE);
		 bw.setForeground(Color.WHITE);
		 be.setForeground(Color.WHITE);
		 bc.setForeground(Color.WHITE);
		 
		 //Agregar botón al layout
		 f.add(bn, BorderLayout.NORTH);
		 f.add(bs, BorderLayout.SOUTH);
		 f.add(bw, BorderLayout.WEST);
		 f.add(be, BorderLayout.EAST);
		 f.add(bc, BorderLayout.CENTER);

		 
		 
	}
	
	public void show() {
		this.f.setVisible(true);
	}
}
