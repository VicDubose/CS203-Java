/**
 * 
 */
package hw1;

import java.util.Scanner;

public class grader {
		public static void main(String[]args) {
			Scanner scanner=new Scanner (System.in);
			System.out.print("Enter Average Homework: ");
			int Att = scanner.nextInt();
			System.out.print("Enter Average Exam grade: ");
			int Avg_exams = scanner.nextInt();
			System.out.print("Enter Attendance: ");
			int Avg_Hw = scanner.nextInt();
			scanner.close();
			Greader(Avg_Hw ,Avg_exams,Att);
		}
		public static void Greader(int Att, int Avg_exams, int Avg_Hw) {
			if(Att>=20){
				if(Avg_Hw>=70 && Avg_exams>=70) {
					if(Avg_Hw>=85 || Avg_exams>=85) 
						System.out.println(" PASS ");
					
				}else {
					System.out.println("FAIL");	
				}
			}else {
				System.out.println("FAIL");
			}
		}
	}

