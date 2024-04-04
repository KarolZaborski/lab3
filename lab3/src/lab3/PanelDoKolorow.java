package lab3;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDoKolorow extends JPanel implements ActionListener {

	JButton p1 = new JButton("Przycik");
	WyborKolorow ch = new WyborKolorow();
	Color color;
	
	
	public PanelDoKolorow() {
		// TODO Auto-generated constructor stub
		
		this.add(p1);
		p1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		color = ch.getColor();
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	

	

}
