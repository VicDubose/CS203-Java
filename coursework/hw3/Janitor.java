/**
 * 
 */
package hw3;

/**
 * @author Tyrone
 *
 */

	public class Janitor extends Employee{
		private String department;
		private char sweeping;
		public Janitor(char employeeCode, String name, int blazerID, String department, char sweeping) {
			super(employeeCode, name, blazerID);
			this.setDepartment(department);
			this.setSweeping(sweeping);
			
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public char getSweeping() {
			return sweeping;
		}
		public void setSweeping(char sweeping) {
			this.sweeping = sweeping;
		}
	}

