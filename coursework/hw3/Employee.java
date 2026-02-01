/**
 * 
 */
package hw3;

/**
 * @author Tyrone
 *
 */
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Employee{
	private char employeeCode;
	private String name;
	private int blazerID;
	public Employee(char employeeCode, String name, int blazerID) {
		this.setEmployeeCode(employeeCode);
		this.setName(name);
		this.setBlazerID(blazerID);
	}
	public char getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(char employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBlazerID() {
		return blazerID;
	}
	public void setBlazerID(int blazerID) {
		this.blazerID = blazerID;
	}
}
