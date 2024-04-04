package lab3_pop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Okno extends JFrame {
	JSlider slider;
	JPanel lewo;
	JPanel gora;
	JPanel dol;
	JPanel srodek;
	JPanel prawo;
	
	Color cur_color;
	
	public Okno() throws HeadlessException {
		// TODO Auto-generated constructor stub
		this.setSize(800, 640);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lewo = new Lewypan();
		this.add(lewo, BorderLayout.LINE_START);
		
		dol = new Dolnypan(); 
		this.add(dol, BorderLayout.PAGE_END);
		
		srodek = new Srodkowypan();
		this.add(srodek, BorderLayout.CENTER);
		
		gora = new JPanel();
		JButton draw = new JButton("Rysuj");
		draw.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		slider = new JSlider(3, 30, 4);
		slider.setMajorTickSpacing(3);
		slider.setMinorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		gora.add(slider);
		gora.add(draw);
		this.add(gora, BorderLayout.PAGE_START);
		
		
		prawo =  new JPanel();
		this.add(prawo, BorderLayout.LINE_END);
		
		this.setVisible(true);
	}
	
	public class Lewypan extends JPanel{
		JRadioButton p1;
		JRadioButton p2;
		JRadioButton p3;
		
		public Lewypan() {
			super();
			// TODO Auto-generated constructor stub
			p1 = new JRadioButton("Przycisk1");
			p2 = new JRadioButton("Przycisk2");
			p3 = new JRadioButton("Przycisk3");
			
			ButtonGroup g = new ButtonGroup();
			g.add(p1);
			g.add(p2);
			g.add(p3);
			
			
			this.setLayout(new GridLayout(3, 1));
			this.add(p1);
			this.add(p2);
			this.add(p3);
		}
		
	}
	
	public class ColorChooser extends JFrame {
		Color color = new Color(0);
		JColorChooser ch;
		JButton ok = new JButton("OK");
		
		public ColorChooser() throws HeadlessException {
			// TODO Auto-generated constructor stub
			this.setSize(500, 600);
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			ch = new JColorChooser();
			this.add(ch, BorderLayout.CENTER);
			
			ok.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					color = ch.getColor();
					srodek.setBackground(color);
				}
			});
			JPanel pan = new JPanel();
			pan.add(ok);
			this.add(pan, BorderLayout.PAGE_END);
		
		}
		
		public void run(){
			this.setVisible(true);
		}
	}
	
	public class Dolnypan extends JPanel{
		JButton p1;
		ColorChooser c = new ColorChooser();
		
		public Dolnypan() {
			super();
			// TODO Auto-generated constructor stub
			p1 = new JButton("Wybierz kolor");
			p1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					c.run();
								
				}
			});
			
			
			this.add(p1);
		}
		
	}
	
	public class Srodkowypan extends JPanel{

		public Srodkowypan() {
			super();
			// TODO Auto-generated constructor stub
			
		}

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
		}

		
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Okno okno = new Okno();
	}

}
