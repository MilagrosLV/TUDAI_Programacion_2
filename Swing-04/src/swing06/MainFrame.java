package swing06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	private JFrame f;
	private JPanel p;
	
	public MainFrame() {
		initialize();
	}
	
	//Métodos
	public void initialize() {
		 f = new JFrame();
		 f.setTitle("GridLayout Demo");
		 
		 f.setLayout(new BorderLayout());
		 f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 f.setSize(800, 500);
		 f.setLocationRelativeTo(null);
	
		 //GRID
		 p = new JPanel(new GridLayout());
		 //Fondo COLOR
		 p.setBackground(Color.PINK);
		 
		 //Iterar botones
		 for(int i=1; i<= 5; i++) {
			 JButton b = new JButton("Button "+i);
			 p.add(b);
		 }

		 f.add(p);
		 
		 f.pack();
		 //SHOW
		 f.setVisible(true);
	}
}
