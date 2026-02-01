/**
 * 
 */
package lab03;

/**
 * @author Tyrone
 *
 */
public class UABPerson {
	private String name;
	private String gender;
	private int age;
	private String blazerID;

		public UABPerson(String name, int age, String gender, String blazerID) {
		// TODO Auto-generated constructor stub

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.blazerID = blazerID;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		public void setGender(String gender) {
			this.gender=gender;
		}
		public String getGender() {
			return gender;
		}
		public void setBlazerID(String blazerID) {
			this.blazerID=blazerID;
		}
		public String getBlazerID() {
			return blazerID;
		}
		public String toString() {
			String out = String.format(" %s is : %d years old.", 
								this.getName(), this.getAge());
			return out;
		}
}