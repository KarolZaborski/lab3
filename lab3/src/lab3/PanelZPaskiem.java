package lab3;

import javax.swing.BoundedRangeModel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class PanelZPaskiem extends JPanel{
	JSlider pasek = new JSlider();
;	public PanelZPaskiem() {
		super();
		// TODO Auto-generated constructor stub
		pasek.setMajorTickSpacing(20);
		pasek.setMinorTickSpacing(1);
		pasek.setPaintLabels(true);
		pasek.setPaintTicks(true);
		
		this.add(pasek);
	}


}
