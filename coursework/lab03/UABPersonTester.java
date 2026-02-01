/**
 * 
 */
package lab03;

/**
 * @author Tyrone
 *
 */
public class UABPersonTester {
	public static void  main (String[] args) {
	    UABPerson uabperson1= new UABPerson("bob", 20, "Male","B012673");
	    UABPerson uabperson2= new UABPerson("Sarrah", 25, "Female"," B022437");
		System.out.println("Hi my name is "+ uabperson1.getName());
        System.out.println(" my Age is  "+ uabperson1.getAge());
        System.out.println("and my gender is  "+ uabperson1.getGender());
        System.out.println("also my BlazerID # is  "+ uabperson1.getBlazerID());
        System.out.println("Hi my name is "+ uabperson2.getName());
        System.out.println(" my Age is  "+ uabperson2.getAge());
        System.out.println("and my gender is  "+ uabperson2.getGender());
        System.out.println("also my BlazerID # is  "+ uabperson2.getBlazerID());
		String name =uabperson1.getName(); 
		String name1=uabperson2.getName();
		System.out.println("if the result is true the user has a palandrome if not it will return false: "+ checkPalindrome(name));
		System.out.println("if the result is true the user has a palandrome if not it will return false: "+checkPalindrome(name1));
		System.out.println( uabperson1.toString());
		System.out.println( uabperson2.toString());
		System.out.println((uabperson1.getName())+" is "+yearsUntilRetirement(uabperson1.getAge())+" years from retirement.");
		System.out.println((uabperson2.getName())+" is "+yearsUntilRetirement(uabperson2.getAge())+" years from retirement.");
	}

public static boolean checkPalindrome(String name) {
	// TODO Auto-generated method stub
	boolean result= true;
		char[] charArray=name.toCharArray();
		int arrLength= charArray.length;
		for(int i=0; i<arrLength/2;i++) {
			if (charArray[i]==charArray[arrLength-1-i]) {
				continue;
			}else
			{
				result=false;
				break;
			}
		}
		
		return result;
	}
public static int yearsUntilRetirement(int age) {  
	int Retire=65-age;
	return Retire;
	//TODO 
	}
}

