/**
 * 
 */
package hw2;


import javax.swing.JFrame;



/**
 * @author Tyrone
 *my name is Tyrone Dubose & my blazer id is Tyr1jr1.
 */
public class CrazyShapesTester {
	public static void main(String[] args) {
	JFrame frame= new JFrame();
	//Frame size. 
	int WIDTH = 600;
	int HEIGHT = 600;
	frame.setSize(WIDTH,HEIGHT);
	frame.setTitle("HomeWork 2 by:Tyr1jr1");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	//Create graph object and add to frame. 
	crazyShapes s = new crazyShapes();
	frame.add(s);
	//Must-have at end of Main method. 
	frame.setVisible(true);
	}

}