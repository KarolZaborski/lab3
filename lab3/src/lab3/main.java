package lab3;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame okno = new Okno();
		
		
		PanelZPrzyciskami pan1 = new PanelZPrzyciskami();
		okno.add(pan1, BorderLayout.WEST);
		PanelDoKolorow pan2 = new PanelDoKolorow();
		okno.add(pan2, BorderLayout.SOUTH);
		PanelZPaskiem pan3 = new PanelZPaskiem();
		okno.add(pan3, BorderLayout.NORTH);
		
		
		okno.setVisible(true);
	}

}
