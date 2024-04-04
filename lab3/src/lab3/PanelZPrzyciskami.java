package lab3;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelZPrzyciskami extends JPanel{
	JRadioButton p1 = new JRadioButton("przycisk 1");
	JRadioButton p2 = new JRadioButton("przycisk 2");
	JRadioButton p3 = new JRadioButton("przycisk 3");
	
	
	
	public PanelZPrzyciskami() {
		super();
		
		this.setLayout(new GridLayout(3, 1));
		this.add(p1);
		this.add(p2);
		this.add(p3);
		
		ButtonGroup g = new ButtonGroup();
		g.add(p1);
		g.add(p2);
		g.add(p3);
		
		
		// TODO Auto-generated constructor stub
	}

	public PanelZPrzyciskami(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
		this.setLayout(new GridLayout(3, 1));
		this.add(p1);
		this.add(p2);
		this.add(p3);
		
		ButtonGroup g = new ButtonGroup();
		g.add(p1);
		g.add(p2);
		g.add(p3);
	}
	
}
