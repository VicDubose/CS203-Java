/**
 * 
 */
package hw3;

/**
 * @author Tyrone
 *
 */
	public class Nurse extends Employee{
		private int numPatients;
		public Nurse(char employeeCode, String name, int blazerID, int numPatients) {
			super(employeeCode, name, blazerID);
			this.setNumPatients(numPatients);
		}
		public int getNumPatients() {
			return numPatients;
		}
		public void setNumPatients(int numPatients) {
			this.numPatients = numPatients;
		}

	}

