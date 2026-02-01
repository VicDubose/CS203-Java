/**
 * 
 */
package hw2;


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


/**
 * @author Tyrone
 * my name is Tyrone Dubose & my blazer id is Tyr1jr1.
 *
 */
@SuppressWarnings("unused")
public class crazyShapes extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  private int MovePentagon() {
			Random choice= new Random();
			double number = 0;
			
			for (int counter=1;counter==1;counter++) {
				number=choice.nextInt(25);
			}
			return (int) number;
		}
	private int RandomObject(){
			Random Object= new Random();
			double Pick = 0;
			
			for (int counter=1;counter==1;counter++) {
				Pick=1+Object.nextInt(5);
			}
			return (int) Pick;
	}
	private double RandomSelect(double R, double G, double B) {
		Random choice= new Random();
		double number = 0;
		
		for (int counter=1;counter<=3;counter++) {
			number=1+choice.nextInt(255);
		}
		return number;
	}
    private double RandomTriangle() {
		Random choice= new Random();
		double number = 0;
		
		for (int counter=1;counter<=3;counter++) {
			number=50+choice.nextInt(100);
		}
		return number;
	}
	public void paintComponent(Graphics g) {
		    int diameter = 200;
			int[] position = {(int) RandomSelect(0,0,0),(int) RandomSelect(0,0,0)};
			int[] xP = {155,100,200};
			int[] yP = {(int) RandomTriangle(),200,200};
			int[]PenX= {(int)MovePentagon()+250,(int)MovePentagon()+350,(int)MovePentagon()+300,(int)MovePentagon()+200,(int)MovePentagon()+150};
			int[]PenY= {(int)MovePentagon()+100,(int)MovePentagon()+200,(int)MovePentagon()+300,(int)MovePentagon()+300,(int)MovePentagon()+200};
			Graphics2D g2 = (Graphics2D)g;
			Rectangle2D.Double a = new Rectangle2D.Double(RandomSelect(0,0,0), RandomSelect(0,0,0), 200, 200);
			Ellipse2D.Double b = new Ellipse2D.Double(position[0], position[1], diameter, diameter);
			Polygon c = new Polygon(xP, yP, 3);
			Rectangle2D.Double d = new Rectangle2D.Double((int) RandomSelect(0,0,0),(int) RandomSelect(0,0,0), 200, 100);
			Polygon e = new Polygon(PenX,PenY,PenX.length);
			g2.setColor(new Color((int) RandomSelect(0,0,0),(int) RandomSelect(0,0,0),(int) RandomSelect(0,0,0), diameter));
			if (RandomObject()==(1)){
				g2.fill(a);
			    return;
			}
			if(RandomObject()==(2)) {
				g2.fill(b);
				return;
			}
			if(RandomObject()==(3)) {
				g2.fill(c);
				return;
			}
			if(RandomObject()==(4)) {
			g2.fill(d);
				return;
			}
			if(RandomObject()==(5)) {
				g2.fill(e);
				return;
			}
	}
}