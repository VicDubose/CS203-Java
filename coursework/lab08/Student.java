/**
 * 
 */
package lab08;

/**
 * @author Tyrone
 *
 */
public class Student {
	
	private String Name;
	private String lastName;
	private int exam1,exam2,finalExam;
	private double finalGrade;
	private String letterGrade;
	public Student(String Name,int exam1,int exam2,int finalExam, String letterGrade)
	{
		this.setName(Name);
		String[] lastName = Name.split(" ");
	    String lastNameStr = lastName[lastName.length-1];
	    this.setLastName(lastNameStr);
	    this.setExam1(exam1);
	    this.setExam1(exam2);
	    this.setFinalExam(finalExam);
	    this.setFinalGrade(.25*exam1+.25*exam2+.5*finalExam);
	    if( this.finalGrade <= 50) {
	    	this.setLetterGrade("F");	
	    }
	    else if(this.finalGrade> 50 && this.finalGrade < 60) {
	    		this.setLetterGrade("D");
	    }
	    else if(this.finalGrade> 70 && this.finalGrade < 80) {
	    	this.setLetterGrade("C");
	    }
	    else if(this.finalGrade> 80 && this.finalGrade < 90) {
	    	this.setLetterGrade("B");
	    }
	    else if(this.finalGrade> 90 && this.finalGrade < 120) {
	    	this.setLetterGrade("A");
	    }
	}
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
		// TODO Auto-generated method stub
		
	}
	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
		// TODO Auto-generated method stub
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.Name = name;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the exam2
	 */
	public int getExam2() {
		return exam2;
	}
	/**
	 * @param exam2 the exam2 to set
	 */
	public void setExam2(int exam2) {
		this.exam2 = exam2;
	}
	/**
	 * @return the exam1
	 */
	public int getExam1() {
		return exam1;
	}
	/**
	 * @param exam1 the exam1 to set
	 */
	public void setExam1(int exam1) {
		this.exam1 = exam1;
	}
	/**
	 * @return the finalGrade
	 */
	public double getFinalExam(){
     return finalExam;
	}
	/**
	 * @param finalExam the finalExam to set
	 */
	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}
	/**
	 * @return the letterGrade
	 */
	public String  getLetterGrade() {
	return letterGrade;
	}

}