/**
 * 
 */
package hw3;

/**
 * @author Tyrone
 *
 */

	public class Doctor extends Employee{
		private String specialty;
		public Doctor(char employeeCode, String name, int blazerID, String specialty) {
			super(employeeCode, name, blazerID);
			this.setSpecialty(specialty);
		}
		public String getSpecialty() {
			return specialty;
		}
		public void setSpecialty(String specialty) {
			this.specialty = specialty;
		}
	}

