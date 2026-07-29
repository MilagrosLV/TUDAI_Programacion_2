package com.javacodejunkie;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
//import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	private JFrame f;
	
	public MainFrame() {
		initialize();
	}
	
	public void initialize() {
		f = new JFrame();
		
		this.f.setLayout(new BorderLayout(10, 5));
		
		this.f.setTitle("Java Swing JPanel Demo");
		this.f.setSize(800, 500);
		this.f.setLocationRelativeTo(null);
		this.f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		
		//Establecer disposición de los paneles
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
			//Cambiar color de fondo
			panel.setBackground(Color.PINK);
			//Crear componente botón y agregarlo al panel
			Button button1 = new Button("Botón 1");
			panel.add(button1);
			Button button2 = new Button("Botón 2");
			panel.add(button2);
			Button button3 = new Button("Botón 3");
			panel.add(button3);
			
		//Setear el tamaño preferible, no es obligatorio, a veces es mejor dejarselo al layout manager
			//panel.setPreferredSize(new Dimension(250, 250));
			
		//Agrego el panel a la disposición del frame
			f.add(panel, BorderLayout.CENTER);
			//f.add(panel, BorderLayout.NORTH);
			//f.add(panel, BorderLayout.SOUTH);
			//f.add(panel, BorderLayout.EAST);
			//f.add(panel, BorderLayout.WEST);
		
		this.f.setVisible(true);
		
	}

}
