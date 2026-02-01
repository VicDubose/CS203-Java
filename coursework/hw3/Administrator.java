/**
 * 
 */
package hw3;

/**
 * @author Tyrone
 *
 */
public class Administrator extends Employee{
	private String department;
	public Administrator(char employeeCode, String name, int blazerID, String department) {
		super(employeeCode, name, blazerID);
		this.setDepartment(department);
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
