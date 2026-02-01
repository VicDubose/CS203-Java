/**
 * 
 */
package lab08;

import java.util.Scanner;

/**
 * @author Tyrone
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lab08 {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Student>studentArr = new ArrayList<Student>();
		try {
			File f = new File("C:\\Users\\Tyrone\\Downloads\\studentList.txt");
			Scanner in = new Scanner(f);
			while(in.hasNextLine()) {
				String line = in.nextLine();
				String [] lineArr = line.split(",");
				Student student= new Student(lineArr[0],Integer.parseInt(lineArr[1]), Integer.parseInt(lineArr[2]), Integer.parseInt(lineArr[3]), line);
				studentArr.add(student);
			}
			in.close();
			
		
		}catch(FileNotFoundException fnfE) {
			System.out.println(fnfE);
	}
		try {
			File outputFile = new File("C:\\Users\\Tyrone\\Downloads\\StudentGrades.txt");
			PrintWriter p = new PrintWriter(outputFile);
			for(Student i :studentArr) {
				p.println(i.getName()+" recieved grade of: "+i.getLetterGrade());
			}
			p.close();
}catch (FileNotFoundException fnfE) {
	System.out.println(fnfE);
}}}


	
	
		