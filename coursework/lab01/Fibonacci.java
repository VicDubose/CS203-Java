package lab01;

import java.util.Scanner;

/**
 * @author Tyrone
 *
 */
public class Fibonacci {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
         int n=scanner.nextInt();
         scanner.close();
         Numbers(n);
    }
    public static void Numbers(int n) {
    	System.out.println("n: "+n);
    	int a=0;
    	int b=1;
    	int sum=0;
    	int count=1;
    	while(count<=n) {
    		System.out.println(sum+" ");
    		count ++;
    		a=b;
    		b=sum;
    		sum=a+b;
    	}
    }
}
