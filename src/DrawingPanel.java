import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	private Color myBlue = new Color(177, 196, 212);
	public DrawingPanel() {
		//setBackground(Color.WHITE);
		
	}
	
	public void paintComponent(Graphics g) {
		//g.setColor(Color.RED);
		
		//Triangle 
		g.setColor(myBlue);
		g.drawLine(320,20, 320, 450);
		//g.drawLine(320, 450, 100, 450);
		g.drawLine(100, 450, 320, 20);
						
		
		//AM
	    Graphics2D g2 = (Graphics2D) g;
	    g2.setStroke(new BasicStroke(4));
		g2.setColor(Color.red);
		g2.drawLine(163,330,240,180);
		g2.drawLine(240,180,240,330);
		g2.drawLine(240,180,280,260);
		g2.drawLine(280,260,320,180);
		g2.drawLine(320,180,320,330);
		g2.drawLine(200,260,240,260);
		
		//Rectangle 
		g.setColor(Color.cyan);
		g.fillRect(110,375,210,25);
		g.setColor(Color.MAGENTA);
		g.fillRect(60,400,260,25);
		g.setColor(Color.YELLOW);
		g.fillRect(80,425,240,25);

		
		//Text
		
		g.setColor(Color.black);
		g.setFont(new Font("Courier", Font.PLAIN, 36)); 
		g.drawString("Designs",163, 375);
		

		}	
	public Dimension getPreferredSize() {
		return new Dimension(500, 500);
	}
}
