/**
 * 
 */
package hw1;

import java.util.Scanner;

/**
 * @author Tyrone
 *
 */
public class cubeOfOdd {
	public class cubeofOdd {
		public static void main(String[]args) {
			Scanner scanner=new Scanner (System.in);
			System.out.print("Enter n1:");
			int n1 = scanner.nextInt();
			scanner.close();
			cubeOfOdd(n1);
		}
		private static void cubeOfOdd(int n1) {
			for(int i=0; i<n1; i++) {
				if(i%2==1) {
					System.out.println(java.lang.Math.pow(i, 3));
				}
			}
		}
	}


}
