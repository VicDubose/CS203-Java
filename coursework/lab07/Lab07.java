/**
 * 
 */
package lab07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Tyrone
 *
 */
public class Lab07 {
	public static void main(String[]args) {
	List <Integer> sums = new ArrayList<>();
	try {
		File f=new File("C:\\Users\\Tyrone\\Downloads\\tester.txt");
		Scanner in = new Scanner(f);
		while(in.hasNextLine()) {
			int sum =0;
			String line=in.nextLine();//"1,2,3"
			String[]lineArray = line.split(",");
			int lineArrayLen = lineArray.length;
			int[]numArray= new int[lineArrayLen];
			for(int i=0;i<lineArrayLen;i++) {
				numArray[i]=Integer.parseInt(lineArray[i]);
			}
			for(int i =0;i<lineArrayLen;i++) {
				sum =sum+numArray[i];
			}
			sums.add(sum);
			System.out.println(sum);
			
		}
		in.close();
	}catch(FileNotFoundException fnfE) {
		System.out.print(fnfE);
	}
	try {
		File outputFile = new File("C:\\Users\\Tyrone\\Downloads\\NewFile.txt");
		PrintWriter p1= new PrintWriter(outputFile);
		p1.println("The Sums are ");
		for(int i=0;i<sums.size();i++) {
			p1.println(sums.get(i));
		}
		p1.close();
		
	}catch(FileNotFoundException fnfE) {
		System.out.println(fnfE);
	}
	}
	
}
//	public static void main (String[]args) throws IOException {
//		File file= new File("C:\\Users\\Tyrone\\Downloads\\tester.txt");
//		Scanner	scanner = new Scanner(file);
//		String newFile ="" ;
//		int total =0;
//		while(scanner.hasNextLine()) {
//		    newFile=newFile.concat(scanner.nextLine()+"\n");  

		    
//	}
//		FileWriter writer= new FileWriter("C:\\Users\\Tyrone\\Downloads\\NewFile.txt");
//		writer.write(newFile);
//		Scanner	scan = new Scanner(newFile);
//		int numTimes= scan.nextInt();
//		scan.nextLine();
//		for(int i=0;i< numTimes; i++) {
//			int sum=0;
//			int count = 0;
//			Scanner split= new Scanner(scan.nextLine());
//			while(split.hasNextLine()) {
//				sum+=split.nextInt();
//				count++;
//	writer.close();
//	scanner.close();
//}}

