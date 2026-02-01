/**
 * 
 */
package hw1;

import java.util.Scanner;

/**
 * @author Tyrone
 *
 */
	public class printjava {
		public static void main(String [] args) {
			Scanner scanner=new Scanner (System.in);
			System.out.print("Enter n3: ");
			int n3 = scanner.nextInt();
			scanner.close();
			printJAVA(n3);
		}
		private static void printJAVA(int n3) {
			int counting=0;	
			for(int i1=0; i1<=n3; i1++) {
					if (counting==8||counting==1||counting==2||counting==4)
						System.out.print("JAVA");
					if (counting==0||counting==n3+1||counting==n3||counting==3||counting==6||counting==5||counting==7||counting==9)
						System.out.print(counting);
						counting++;
			}
		}
	}

