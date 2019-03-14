import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	private Color myBlue = new Color(177, 196, 212);
	private Color myRed = new Color(219, 52, 52);
	public DrawingPanel() {
		//setBackground(Color.WHITE);
		
	}
	
	public void paintComponent(Graphics g) {
	
		
		//Triangle 
		Graphics2D g3 = (Graphics2D) g;
	    g3.setStroke(new BasicStroke(2));
		g3.setColor(myBlue);
		g3.drawLine(320,20, 320, 450);
		//g.drawLine(320, 450, 100, 450);
		g3.drawLine(100, 450, 320, 20);
						
		
		//AM
	    Graphics2D g2 = (Graphics2D) g;
	    g2.setStroke(new BasicStroke(5));
		g2.setColor(myRed);
		g2.drawLine(163,330,240,180);
		g2.drawLine(240,180,240,330);
		g2.drawLine(240,180,280,260);
		g2.drawLine(280,260,320,180);
		g2.drawLine(320,180,320,330);
		g2.drawLine(200,260,240,260);
		
		//Rectangle 
		g.setColor(new Color(76, 239, 255));
		g.fillRect(110,375,210,25);
		g.setColor(new Color(255, 22, 184));
		g.fillRect(60,400,260,25);
		g.setColor(new Color(255, 246, 9));
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
