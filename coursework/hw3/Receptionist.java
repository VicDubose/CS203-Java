/**
 * 
 */
package hw3;

/**
 * @author Tyrone
 *
 */
public class Receptionist extends Employee{
	private String department;
	private char answering;
	public Receptionist(char employeeCode, String name, int blazerID, String department, char answering) {
		super(employeeCode, name, blazerID);
		this.setDepartment(department);
		this.setAnswering(answering);
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public char getAnswering() {
		return answering;
	}
	public void setAnswering(char answering) {
		this.answering = answering;
	}
}

