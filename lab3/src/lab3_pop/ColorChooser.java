package lab3_pop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChooser extends JFrame implements ChangeListener{
	Color color;
	JColorChooser ch;
	
	public ColorChooser() throws HeadlessException {
		// TODO Auto-generated constructor stub
		this.setSize(500, 600);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		ch = new JColorChooser();
		this.add(ch, BorderLayout.CENTER);
	
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		color = ch.getColor();
		
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void run(){
		this.setVisible(true);
	}
	



}
