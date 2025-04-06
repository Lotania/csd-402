//Anthony Nguyen, Assignment M4, 04/05/2025
//The purpose of this program is to demonstrate basic array
//and method oveloading features of Java.

public class overloadme {
	public static void main(String[] args) {
		//the main program will initialize and run the arrays through the methods

		short[] array = {23,435,634,2,6,68,9,65,170,32};
		int[] arary = {32,4,5,10,67,8,654,3};
		long[] rayar = {9876543872345365L,987654435653234567L,989875675468667765L,9986766454545454L,12322343246543432L};
		double[] yaarr = {123.456,789.012,345.678,901.234,567.890};
		
		//print out by method, the contents of the array and averages
		short one = average(array);
		System.out.println("\nThe average of the short array is " + one + ".\n");
		
		int two = average(arary);
		System.out.println("\nThe average of the int array is " + two + ".\n");
		
		long three = average(rayar);
		System.out.println("\nThe average of the long array is " + three + ".\n");
		
		double four = average(yaarr);
		System.out.println("\nThe average of the double array is " + four + ".\n");
	}
	
	public static short average(short[] array){
		
		short sum=0;//initialize 0 as a precaution
		
		System.out.println("Contents of the array: ");
		String comma = ""; //empty string for first item in array
		
		for(short num : array){
			System.out.print(comma + num);
			comma = ", "; //after first item print, add comma and space
			sum += num;
		}
		//send the result back to the main program
		return (short) (sum / array.length);
		//in java, dividing always yields an int. therefore, the entire operation must be manually cast
	}
	
	public static int average(int[] array){
		
		int sum=0;
		
		System.out.println("Contents of the array: ");
		String comma = "";
		for(int num : array){
			System.out.print(comma + num);
			comma = ", "; 
			sum += num;
		}
		
		return sum / array.length;
		//no need to cast
	}
	
	public static long average(long[] array){
		
		long sum=0;
		
		System.out.println("Contents of the array: ");
		String comma = "";
		for(long num : array){
			System.out.print(comma + num);
			comma = ", "; 
			sum += num;
		}

		return (long) (sum / array.length);
	}
	
	public static double average(double[] array){
		
		double sum=0;
		
		System.out.println("Contents of the array: ");
		String comma = "";
		for(double num : array){
			System.out.print(comma + num);
			comma = ", "; 
			sum += num;
		}
		
		return (double) (sum / array.length);
	}
	
}