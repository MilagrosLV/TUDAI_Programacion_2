package com.javacodejunkie;

import javax.swing.SwingUtilities;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run(){ //Soibreescribo el método run() de la clase anónima
				/*Creo una instancia de la clase MainWindow 
				 */
				//Tutorial 1
				/*MainWindow main = new MainWindow();
				main.show();*/
				
				//Tutorial 2
				//No la mejor práctica para crear un JFrame, sin encapsulamiento al hacerlo con herencia directa de la clase JFrame
				JFrameOne f1 = new JFrameOne();
				
				
				//Mejor práctica --> ENCAPSULAMIENTO. Usa composición
				JFrameTwo f2 = new JFrameTwo();
				
			}
		});

	}

}
