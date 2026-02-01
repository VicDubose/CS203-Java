/**
 * 
 */
package lab06;

/**
 * @author Tyrone
 *
 */
public class Calculator {
	private static double num1;
	private static double num2;
	public Calculator(double a, double b) {
		this.setNum1(a);
		this.setNum2(b);
	}
	public int get_first_number() {
		return (int) this.getNum1();
	}
	public int get_second_number()
	{
		return (int) this.getNum2();
	}
public int add(){
	return (int) (getNum1()+getNum2());	
	}
public int sub() {
	return (int) (getNum1()-getNum2());
}
public int div() {
	return (int) (getNum1()/getNum2());
}
public double Square_R() {
	return Math.sqrt(getNum1()+getNum2());
}
public static double getNum1() {
	return num1;
}
public void setNum1(double num1) {
	this.num1 = num1;
}
public static double getNum2() {
	return num2;
}
public void setNum2(double num2) {
	this.num2 = num2;
}

}
