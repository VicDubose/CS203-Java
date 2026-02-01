/**
 * 
 */
package hw3;

/**
 * @author Tyrone
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class employeeTester {
	public static void main(String args[]) {
		ArrayList<Employee> totalEmployeeArr = new ArrayList<Employee>();
		ArrayList<Employee> employeeArr = new ArrayList<Employee>();
		ArrayList<Administrator> administratorArr = new ArrayList<Administrator>();
		ArrayList<Doctor> doctorArr = new ArrayList<Doctor>();
		ArrayList<Janitor> janitorArr = new ArrayList<Janitor>();
		ArrayList<Nurse> nurseArr = new ArrayList<Nurse>();
		ArrayList<Receptionist> receptionistArr = new ArrayList<Receptionist>();
		ArrayList<Surgeon> surgeonArr = new ArrayList<Surgeon>();
		try {
			File f = new File("C:\\Users\\jdubo\\Downloads\\uabEmployee.txt");
			Scanner in = new Scanner(f);
			while (in.hasNextLine()) {
				String line = in.nextLine();
				String[] lineArr = line.split(" ");
				char strToCharTotal = lineArr[0].charAt(0);
				Employee totalEmployee = new Employee(strToCharTotal, lineArr[1], Integer.parseInt(lineArr[2]));
				totalEmployeeArr.add(totalEmployee);
				if (lineArr[0].equals("E")) {
					char strToChar = lineArr[0].charAt(0);
					Employee employee = new Employee(strToChar, lineArr[1], Integer.parseInt(lineArr[2]));
					employeeArr.add(employee);
				} else if (lineArr[0].equals("D")) {
					char strToChar = lineArr[0].charAt(0);
					Doctor doctor = new Doctor(strToChar, lineArr[1], Integer.parseInt(lineArr[2]), lineArr[3]);
					doctorArr.add(doctor);
				} else if (lineArr[0].equals("N")) {
					char strToChar = lineArr[0].charAt(0);
					Nurse nurse = new Nurse(strToChar, lineArr[1], Integer.parseInt(lineArr[2]),
							Integer.parseInt(lineArr[3]));
					nurseArr.add(nurse);
				} else if (lineArr[0].equals("A")) {
					char strToChar = lineArr[0].charAt(0);
					Administrator administrator = new Administrator(strToChar, lineArr[1], Integer.parseInt(lineArr[2]),
							lineArr[3]);
					administratorArr.add(administrator);
				} else if (lineArr[0].equals("R")) {
					char strToChar = lineArr[0].charAt(0);
					char strToChar2 = lineArr[4].charAt(0);
					Receptionist receptionist = new Receptionist(strToChar, lineArr[1], Integer.parseInt(lineArr[2]),
							lineArr[3], strToChar2);
					receptionistArr.add(receptionist);
				} else if (lineArr[0].equals("J")) {
					char strToChar = lineArr[0].charAt(0);
					char strToChar2 = lineArr[4].charAt(0);
					Janitor janitor = new Janitor(strToChar, lineArr[1], Integer.parseInt(lineArr[2]), lineArr[3],
							strToChar2);
					janitorArr.add(janitor);
				} else if (lineArr[0].equals("S")) {
					char strToChar = lineArr[0].charAt(0);
					char strToChar2 = lineArr[4].charAt(0);
					Surgeon surgeon = new Surgeon(strToChar, lineArr[1], Integer.parseInt(lineArr[2]), lineArr[3],
							strToChar2);
					surgeonArr.add(surgeon);
				}

			}
			in.close();
		} catch (FileNotFoundException fnfE) {
			System.out.println(fnfE);
		}
		while (true) {
			// UI
			Scanner userIn = new Scanner(System.in);
			System.out.println("##############################################");
			System.out.println("     Welcome to the UAB employee system");
			System.out.println("##############################################");
			System.out.println("Enter 1 to display the employee list");
			System.out.println("Enter 2 to add/remove from the employee list");
			System.out.println("Enter 3 to update the employee list");
			System.out.println("Enter 4 to terminate program");
			System.out.println("Note: The employee list must be manually updated");
			System.out.println("      in order for changes to be saved.");
			
			int choice = userIn.nextInt();
			if (choice == 1) {
				System.out.println("");
				int totalEmployees = employeeArr.size() + doctorArr.size() + surgeonArr.size() + nurseArr.size()
						+ administratorArr.size() + receptionistArr.size() + janitorArr.size();
				System.out.println("Total number of employees: " + totalEmployees);
				System.out.println("");
				System.out.println("Hospital Employees: " + employeeArr.size());
				for (Employee i : employeeArr) {
					System.out.println("Name: " + i.getName() + " BlazerID: " + i.getBlazerID());
				}
				System.out.println("");
				System.out.println("Doctors: " + doctorArr.size());
				for (Doctor i : doctorArr) {
					System.out.println("Name: " + i.getName() + " BlazerID: " + i.getBlazerID() + " Specialty: "
							+ i.getSpecialty());
				}
				System.out.println("");
				System.out.println("Surgeons: " + surgeonArr.size());
				for (Surgeon i : surgeonArr) {
					System.out.println("Name: " + i.getName() + " BlazerID: " + i.getBlazerID() + " Specialty: "
							+ i.getSpecialty() + " Operating: " + i.getOperating());
				}
				System.out.println("");
				System.out.println("Nursess: " + nurseArr.size());
				for (Nurse i : nurseArr) {
					System.out.println("Name: " + i.getName() + " BlazerID: " + i.getBlazerID()
							+ " Number of patients: " + i.getNumPatients());
				}
				System.out.println("");
				System.out.println("Administrators: " + administratorArr.size());
				for (Administrator i : administratorArr) {
					System.out.println("Name: " + i.getName() + " BlazerID: " + i.getBlazerID() + " Department: "
							+ i.getDepartment());
				}
				System.out.println("");
				System.out.println("Receptionists: " + receptionistArr.size());
				for (Receptionist i : receptionistArr) {
					System.out.println("Name: " + i.getName() + " BlazerID: " + i.getBlazerID() + " Department: "
							+ i.getDepartment() + " Answering: " + i.getAnswering());
				}
				System.out.println("");
				System.out.println("Janitors: " + janitorArr.size());
				for (Janitor i : janitorArr) {
					System.out.println("Name: " + i.getName() + " BlazerID: " + i.getBlazerID() + " Department: "
							+ i.getDepartment() + " Sweeping: " + i.getSweeping());
				}
				System.out.println("");

			} else if (choice == 2) {
				while (true) {
					System.out.println("Available functions:");
					System.out.println("Enter 1 to add an employee");
					System.out.println("Enter 2 to remove an employee");
					System.out.println("Enter 3 to go to main menu");
					
					int addRemove = userIn.nextInt();
					if (addRemove == 1) {
						while (true) {
							System.out.println("Please enter the employee code of the new employee");
							String addEmployeeCode = userIn.next();
							char strToChar = addEmployeeCode.charAt(0);
							System.out.println("Please enter the name of the new employee");
							String addName = userIn.next();
							System.out.println("Please enter the blazerID of the new employee");
							int addBlazerID = userIn.nextInt();
							if (addEmployeeCode.equals("E")) {
								Employee employee = new Employee(strToChar, addName, addBlazerID);
								employeeArr.add(employee);
							} else if (addEmployeeCode.equals("A")) {
								System.out.println("Please enter the department of the new Administrator");
								String addDepartment = userIn.next();
								Administrator administrator = new Administrator(strToChar, addName, addBlazerID,
										addDepartment);
								administratorArr.add(administrator);
							} else if (addEmployeeCode.equals("D")) {
								System.out.println("Please enter the department of the new Administrator");
								String addSpecialty = userIn.next();
								Doctor doctor = new Doctor(strToChar, addName, addBlazerID, addSpecialty);
								doctorArr.add(doctor);
							} else if (addEmployeeCode.equals("J")) {
								System.out.println("Please enter the department of the new Janitor");
								String addDepartment = userIn.next();
								System.out.println("Please enter whether the new Janitor is sweeping (Y/N)");
								String addSweeping = userIn.next();
								char strToChar1 = addSweeping.charAt(0);
								Janitor janitor = new Janitor(strToChar, addName, addBlazerID, addDepartment,
										strToChar1);
								janitorArr.add(janitor);
							} else if (addEmployeeCode.equals("N")) {
								System.out.println(
										"Please enter the number of patients the new Nurse will be caring for");
								int addNumPatients = userIn.nextInt();
								Nurse nurse = new Nurse(strToChar, addName, addBlazerID, addNumPatients);
								nurseArr.add(nurse);
							} else if (addEmployeeCode.equals("R")) {
								System.out.println("Please enter the department of the the new Receptionist");
								String addDepartment = userIn.next();
								System.out.println(
										"Please enter whether the new Receptionist is answering the phone (Y/N)");
								String addAnswering = userIn.next();
								char strToChar1 = addAnswering.charAt(0);
								Receptionist receptionist = new Receptionist(strToChar, addName, addBlazerID,
										addDepartment, strToChar1);
								receptionistArr.add(receptionist);
							} else if (addEmployeeCode.equals("S")) {
								System.out.println("Please enter the specialty of the the new Surgeon");
								String addSpecialty = userIn.next();
								System.out.println("Please enter whether the new Surgeon is operating (Y/N)");
								String addOperating = userIn.next();
								char strToChar1 = addOperating.charAt(0);
								Surgeon surgeon = new Surgeon(strToChar, addName, addBlazerID, addSpecialty,
										strToChar1);
								surgeonArr.add(surgeon);
							}
							break;
						}
						break;

					} else if (addRemove == 2) {
						while (true) {
							System.out.println("Please enter the blazerID of the employee to be removed:");
							int removeBlazerID = userIn.nextInt();
							System.out.println("Please enter the employee code of the employee to be removed:");
							String removeEmployeeCode = userIn.next();
							char strToChar = removeEmployeeCode.charAt(0);
							int count = 0;
							int actual = 0;
							if (removeEmployeeCode.equals("A")) {
								for (Administrator i : administratorArr) {
									count++;
									if (i.getBlazerID() == removeBlazerID) {
										actual = count;
									}
								}
								administratorArr.remove(actual-1);
							} else if (removeEmployeeCode.equals("E")) {
								for (Employee i : employeeArr) {
									count++;
									if (i.getBlazerID() == removeBlazerID) {
										actual = count;
									}
								}
								employeeArr.remove(actual-1);
							} else if (removeEmployeeCode.equals("D")) {
								for (Doctor i : doctorArr) {
									count++;
									if (i.getBlazerID() == removeBlazerID) {
										actual = count;
									}
								}
								doctorArr.remove(actual-1);
							} else if (removeEmployeeCode.equals("J")) {
								for (Janitor i : janitorArr) {
									count++;
									if (i.getBlazerID() == removeBlazerID) {
										actual = count;
									}
								}
								janitorArr.remove(actual-1);
							} else if (removeEmployeeCode.equals("N")) {
								for (Nurse i : nurseArr) {
									count++;
									if (i.getBlazerID() == removeBlazerID) {
										actual = count;
									}
								}
								nurseArr.remove(actual-1);
							} else if (removeEmployeeCode.equals("R")) {
								for (Receptionist i : receptionistArr) {
									count++;
									if (i.getBlazerID() == removeBlazerID) {
										actual = count;
									}
								}
								receptionistArr.remove(actual-1);
							} else if (removeEmployeeCode.equals("S")) {
								for (Surgeon i : surgeonArr) {
									count++;
									if (i.getBlazerID() == removeBlazerID) {
										actual = count;
									}
								}
								surgeonArr.remove(actual-1);
							} else {
								System.out.println("Invalid input");
								continue;
							}
							for (Employee i : totalEmployeeArr) {
								count++;
								if (i.getBlazerID() == removeBlazerID && i.getEmployeeCode() == strToChar) {
									actual = count;
								}
							}
							totalEmployeeArr.remove(actual-3);
							break;
						}
					} else if(addRemove == 3) { 
					break;
					} else {
						System.out.println("Invalid input");
						continue;
					}
					
				}
			} else if (choice == 3) {
				try {
					File outputFile = new File("uabEmployee.txt");
					PrintWriter p = new PrintWriter(outputFile);
					for (Employee i : employeeArr) {
						p.println(i.getEmployeeCode() + " " + i.getName() + " " + i.getBlazerID());
					}
					for (Doctor i : doctorArr) {
						p.println(i.getEmployeeCode() + " " + i.getName() + " " + i.getBlazerID() + " "
								+ i.getSpecialty());
					}
					for (Administrator i : administratorArr) {
						p.println(i.getEmployeeCode() + " " + i.getName() + " " + i.getBlazerID() + " "
								+ i.getDepartment());
					}
					for (Janitor i : janitorArr) {
						p.println(i.getEmployeeCode() + " " + i.getName() + " " + i.getBlazerID() + " "
								+ i.getDepartment() + " " + i.getSweeping());
					}
					for (Nurse i : nurseArr) {
						p.println(i.getEmployeeCode() + " " + i.getName() + " " + i.getBlazerID() + " "
								+ i.getNumPatients());
					}
					for (Receptionist i : receptionistArr) {
						p.println(i.getEmployeeCode() + " " + i.getName() + " " + i.getBlazerID() + " "
								+ i.getDepartment() + " " + i.getAnswering());
					}
					for (Surgeon i : surgeonArr) {
						p.println(i.getEmployeeCode() + " " + i.getName() + " " + i.getBlazerID() + " "
								+ i.getSpecialty() + " " + i.getOperating());
					}
					p.close();
				} catch (FileNotFoundException fnfE) {
					System.out.println(fnfE);
				}
			} else if (choice == 4) {
				System.exit(0);
			} else {
				System.out.println("Invalid input");
				continue;
			}

		}
	}
}

