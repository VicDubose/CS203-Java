/**
 * 
 */
package hw3;

/**
 * @author Tyrone
 *
 */
public class Surgeon extends Employee{
	private String specialty;
	private char operating;
	public Surgeon(char employeeCode, String name, int blazerID, String specialty, char operating) {
		super(employeeCode, name, blazerID);
		this.setSpecialty(specialty);
		this.setOperating(operating);
		
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public char getOperating() {
		return operating;
	}
	public void setOperating(char operating) {
		this.operating = operating;
	}
}