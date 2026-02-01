package lab02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;




import java.util.ArrayList;

public class Lab02_file_handling {
	/**
	 * Write one string to outputFileName file. 
	 * @param s one string. 
	 * @param outputFileName output file name. 
	 */
	public static void fileWriter(String s, String outputFileName) {
//		public static void fileWriter(String s) {  //To write to known file name. 
//			String outputFileName = "output.txt";
		try {
			PrintWriter p = new PrintWriter (new File(outputFileName));
			p.print(s);
			p.close();
			System.out.println("File is updated. ");  //comment out later. 
		
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
			int n;
			try {
				String inputFileName = "inputFile.txt";
				int total = 0;
				int count = 0;
				ArrayList<Integer> numberList = new ArrayList<>();
				Scanner scan = new Scanner (new File(inputFileName));
				while (scan.hasNext()) {
//				while (scan.hasNextLine()) {   //These are used to scan entire line. 
//					String nextLine = scan.nextLine ();
					// String[] s = nextLine.trim().split(" ");
					
					n = scan.nextInt();
					numberList.add(n);
					total += n;
					count ++;
					}
				scan.close();
				System.out.println(numberList);
				System.out.printf("Count: + %d\n", count);
				System.out.printf("Total : %d \n", total);
				
				//This is for file write testing
				fileWriter("this is first line\n", "output.txt");
				}
			catch(FileNotFoundException fnfE) {
				System.out.println (fnfE);}
	}
}
