package lab02;


import java.util.Arrays;
import java.util.List;

public class Lab02_helpers_methods {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);
		System.out.println(numbers);
		System.out.println("Max: " + max(numbers));
		System.out.println("Min: " + min(numbers));		
		System.out.println("Mean: " + mean(numbers));
		
		//More advanced ways to calculate sum: 
		int sum = numbers.stream().mapToInt(i -> i).sum();
		
		//Another method: 
		Integer sum_using_reduce = numbers.stream().reduce(0, (a,b)->a+b);
		
		
		System.out.println("Sum using mapToInt: " + sum);
		System.out.println("Sum using stream.reduce: " + sum_using_reduce);
		
		
		System.out.println("=======================================");
		int n = 123456;
		for (int i = n;i>=1;i /= 10) {
			System.out.printf("n= %-8d : Answer: ",i);
			System.out.println(Arrays.toString(int_array_converter(i)));

		}
	}
	
	public static int min(List<Integer> numberList) {
		int min = numberList.get(0);
		for (Integer n: numberList) {
			min = n<min?n:min;
			
		}
		return min;
	}
	
	public static int max(List<Integer> numberList) {
		int max = numberList.get(0);
		for (Integer n: numberList) {
			if (n > max)
				max = n;
			
		}
		return max;
	}
	
	public static int mean(List<Integer> numberList) {
		int sum = 0;
		for (Integer n: numberList) {
			sum += n;
		}
		return sum/numberList.size();
	}
	
	/**
	 * Convert int n = 1234 to int[] {1,2,3,4}
	 * @param n
	 * @return
	 */
	public static int[] int_array_converter(int n) {
		int[] output = new int[4];
		int i = 3;
		int temp;
		while (i>=1 && n != 0) {
			temp = n%10;
			n = n/10;
			output[i] = temp;
			i--;
		}
		output[i] = n;
		return output;
	}
}
