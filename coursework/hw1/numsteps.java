/**
 * 
 */
package hw1;

import java.util.Scanner;

/**
 * @author Tyrone
 *
 */
	public class numsteps {
		public static void main(String[]args) {
			Scanner scanner=new Scanner (System.in);
			System.out.print("Enter n: ");
			int n = scanner.nextInt();
			scanner.close();
			numSteps(n);
		}
		private static void numSteps(int n) {
			int count=3;
			for(int i=0; i<n; i++) {
				count++;
				if (n%2==1) {
					n=n-1;
				}
				if(n%2==0) {
					n=n/2;
					
				}
					}
			System.out.println(count);
		}
			
	}

