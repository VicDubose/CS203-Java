package lab02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab02_solution {

	public static int max(int[] a) {
		/**
		 * Input: int array. 
		 * Output: max number in the int array.  
		 */
	
		int max = a[0];
		for (int i=1;i<a.length; i++)
			{
			if (a[i]>max) {max = a[i];}
			}
		return max;
		}

	public static int min(int[] a) {
		/**
		 * Input: int array. 
		 * Output: min number in the int array.  
		 */
		int min = a[0];
		for (int i=1;i<a.length; i++)
			{
			if (a[i]<min) {min = a[i];}
			}
		return min;
		}
	
	public static int average(int[] a) {
		/**
		 * Input: int array. 
		 * Output: int. Average of all numbers in int array. Output data type as int per demo. 
		 */

		int sum = 0;
		for (int i = 0;i<a.length;i++)
		{
			sum+=a[i];
			}
		return sum/a.length;
	}
	
	public static int[] numberList(String inputFileName) {
		/**
		 * Input: inputFile.txt containing int numbers. 
		 * Purpose: read input file and copy all numbers in the file and create int array.  
		 * Output: Int list. 
		 * 
		 */
		ArrayList<Integer> number = new ArrayList<Integer>();  // First, create ArrayList because # of integer (arr.length) is unknown. 

		try {
			Scanner scan = new Scanner (new File(inputFileName));
			while (scan.hasNextLine()) {
				String nextLine = scan.nextLine ();
				int nextNumber = Integer.parseInt (nextLine);
				System.out.println ("Next number: " + nextNumber);
				number.add(nextNumber);
			}
			scan.close();	
		}
		
		catch(FileNotFoundException fnfE) {
			System.out.println (fnfE);}
				
		int[] numberList = new int [number.size()];  // convert arraylist to array for easier calculation. 
		for (int i=0;i<number.size();i++)
		{numberList[i] = number.get(i);}   
		return numberList;
	}
	
	public static void fileAnalyze(String inputFileName, String outputFileName) {
		/**
		 * Input: inputFile.txt containing int number only. 
		 * Output: create outputFile.txt containg total entries of number, min, max and mean of all int number appended at end of the file.  
		 */
		
		outputFileName = "outputFile.txt";	 // You may comment out this line so it can write .txt file with other names. 
		inputFileName = "inputFile.txt";	// You may comment out this line so it can read .txt file with other names.
		int[] numberList = numberList(inputFileName);
		try {
			PrintWriter p = new PrintWriter (new File(outputFileName));
			for (int i = 0;i<numberList.length;i++)
			{
			p.println(numberList[i]);
			}
			p.println("**********");
			p.printf("There are %d numbers in this file.\n", numberList.length);
			p.printf("The minimum number is %d \n", min(numberList));		
			p.printf("The maximum number is %d \n", max(numberList));
			p.printf("The average is %d \n", average(numberList));
			p.close();
			System.out.println("**********");
			System.out.printf("There are %d numbers in this file.\n", numberList.length);
			System.out.printf("The minimum number is %d \n", min(numberList));		
			System.out.printf("The maximum number is %d \n", max(numberList));
			System.out.printf("The average is %d \n", average(numberList));			
			System.out.println("End of file processing.");
		
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	//Sec2days
	public static int day(int n) {
		int DAY = 24*60*60; //each day has 24*60*60 seconds. 
		return n/DAY;
	}
	
	public static int hour(int n) {
		int DAY = 24*60*60; //each day has 24*60*60 seconds. 
		int HOUR = 60*60;  // each hour has 3600 seconds.	
		return n%DAY/HOUR;
		}
	
	public static int minute(int n) {
		int HOUR = 60*60;  // each hour has 3600 seconds.
		return n%HOUR/60;
	}
	
	public static int second(int n) {
		int HOUR = 60*60;  // each hour has 3600 seconds.		
		return n%HOUR%60;
	}
	
	public static String sec2Days(int n) {
		return String.format("%1d:%02d:%02d:%02d",day(n),hour(n),minute(n),second(n));
	}	
	
	
	//Consonant counts
	/**
	 * Input: String s. 
	 * Output: Int. Report the number of consonants in the given string. 
	 * y and Y are not consonants. 
	 */
	public static int consonantCount(String s) {
		s = s.toLowerCase();	// change to lower case letters. 
		s = s.replaceAll("[^a-z]", "");  // remove all non-alphabetic letters. 
		s = s.replaceAll("[^aeiouy]", "b"); // change all consonants to one arbitrary non-vowel letter (b in this case).  
		s = s.replaceAll("[^b]", "");		//remove all vowels. 
		return s.length();
	}
		
	
	public static void main(String[] args) {
		System.out.println("============================File Analyzer======================");
		String outputFileName = "outputFile.txt";	
		String inputFileName = "inputFile.txt";	
		fileAnalyze (inputFileName, outputFileName);
		
		System.out.println("============================Sec2days======================");
		System.out.printf ("n2=750000 output is %s \n", sec2Days(750000));
		System.out.printf ("n2=1234 output is %s \n", sec2Days(1234));			
		System.out.printf ("n2=200000 output is %s \n", sec2Days(200000));
		
		String sentence1 = "abra cadabra"; //all three lines for testing. 
		String sentence2 = "how many consonants?";
		String sentence3 = "This is Lab2, folks.";
		
		System.out.println("============================consonant count======================");
		System.out.printf("Number of consonant letters of string (%s) is: %s \n", sentence1, consonantCount(sentence1));
		System.out.printf("Number of consonant letters of string (%s) is: %s \n", sentence2, consonantCount(sentence2));
		System.out.printf("Number of consonant letters of string (%s) is: %s \n", sentence3, consonantCount(sentence3));
		
		
		
		}

}
