/**
 * 
 */
package hw1;

import java.util.Scanner;

/**
 * @author Tyrone
 *
 */
public class introtojava {
	public static void main(String[]args) {
		Scanner scanner=new Scanner (System.in);
		System.out.print("Enter n2: ");
		int n2 = scanner.nextInt();
		scanner.close();
		introToJava(n2);
	}
	private static void introToJava(int n2) {
		if(n2%3==0) {
			System.out.println("CS");
			System.exit(0);
		}
		if(n2%7==0) {
			System.out.println("UAB");
			System.exit(0);
		}
		if(n2%7==0 && n2%3==0) {
			System.out.println("UAB CS 203");
			System.exit(0);
		}
		if(n2%2==1) {
			System.out.println("Go Blazers");
			System.exit(0);
		}else {
			System.out.println(java.lang.Math.pow(n2, 3));
			System.exit(0);
		}
		
	}

}

