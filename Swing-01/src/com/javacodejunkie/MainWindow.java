package com.javacodejunkie;

import javax.swing.JFrame;

public class MainWindow {
	//Creo atributo de tipo JFrame, es el contenedor superior o ventana
	private JFrame window;
	
	public MainWindow() {
		//Creo instancia de JFrame
		window = new JFrame();
			//Uso metodos de la clase JFrame
				//Seteo el titulo de la ventana
				window.setTitle("Hello World!");
				
				//Seteo lo que va a pasar cuando se preciona la X de lado superior derecho, para cerrar la ventana
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
				//Esteblezco tamaño de ventana (ancho, altura)
				window.setSize(800, 500);
				
				//Centro la ventana al centro de la pantalla, se pone en null
				window.setLocationRelativeTo(null);
				
		
	}
	public void show() {
		window.setVisible(true);
	}
	
}
