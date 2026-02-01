/**
 * 
 */
package lab05;

import javax.swing.JFrame;

/**
 * @author Tyrone
 *
 */
public class Lab05Tester {
	public static void main(String[] args) {
		JFrame f= new JFrame();
		//Frame size. 
		int WIDTH = 600;
		int HEIGHT = 800;
		f.setSize(WIDTH,HEIGHT);
		f.setTitle("CS 203 lab 5 by :Tyr1jr1");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//Create graph object and add to frame. 
		Lab05 s = new Lab05();
		f.add(s);
		//Must-have at end of Main method. 
		f.setVisible(true);
	}

}
