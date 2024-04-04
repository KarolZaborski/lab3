package lab3;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class WyborKolorow extends JPanel implements ChangeListener{
	JColorChooser ch = new JColorChooser();
	Color color = new Color(0);
	
	public WyborKolorow() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		this.add(ch);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		color = ch.getColor();
	}
	
	public void stworzGUI() {
		JFrame okienko = new JFrame();
		okienko.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		okienko.setSize(640, 350);
		okienko.add(this);
		okienko.setVisible(true);
		
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
