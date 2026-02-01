/**
 * 
 */
package lab05;

//my name is Victor Tyrone Dubose & My Blazer ID is Tyr1jr1
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.*;
import java.nio.charset.Charset;
import java.util.Random;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

@SuppressWarnings("unused")
public class Lab05 extends JComponent {
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g) {
			Graphics2D g2 =(Graphics2D)g;
			int[]xP= {230,400,570};
			int[]yP= {250,100,250};
			Rectangle2D.Double h = new Rectangle2D.Double(0, 450, 800, 300);
			g2.setColor(Color.green);
			g2.fill(h);
			Rectangle2D.Double a = new Rectangle2D.Double(0, 0, 800, 500);
			g2.setColor(Color.blue);
			g2.fill(a);
			Rectangle2D.Double p = new Rectangle2D.Double(250, 250, 300, 300);
			g2.setColor(Color.gray);
			g2.fill(p);
			Rectangle2D.Double P = new Rectangle2D.Double(300, 450, 60, 60);
			g2.setColor(Color.black);
			g2.fill(P);
			Rectangle2D.Double y = new Rectangle2D.Double(465, 480, 60, 60);
			g2.setColor(Color.cyan);
			g2.fill(y);
			Rectangle2D.Double H = new Rectangle2D.Double(630, 570, 60, 80);
			g2.setColor(Color.black);
			g2.fill(H);
			Ellipse2D.Double A = new Ellipse2D.Double(600, 480, 100, 100);
			g2.setColor(Color.BLUE);
			g2.fill(A);
			Polygon tri = new Polygon(xP, yP, 3);
			g2.setColor(Color.red);
			g2.fill(tri);

			
		}
}
