//Anthony Nguyen, 05/10/2025, Assignment 9
//The purpose of this program is to demonstrate Java try/catch capabilities
//within usage of accessing lists.

import java.util.*;//accepts ArrayList and Scanner

public class arrayFinder {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		//15 elements
		cars.add("Volvo");
		cars.add("Hyundai");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Audi");
		cars.add("Cadillac");
		cars.add("Toyota");
		cars.add("Chevrolet");
		cars.add("Tesla");
		cars.add("Honda");
		cars.add("Acura");
		cars.add("Buick");
		cars.add("Jaguar");
		cars.add("Chrysler");
		cars.add("Kia");
		
		for (String car:cars){//for each
			System.out.print(car + " ");
		}
		
		Scanner scanner = new Scanner(System.in);
		String input;
		boolean validInput = false;//trigger for input loop
		int element = 0;
		
		//use for validating input
		while(!validInput){
			System.out.println("\nWhich element would you like to see again?");
			System.out.println("INPUT A NUMBER: ");
			//use string input for safer progam flow
			input = scanner.nextLine();
			try {
				element = Integer.parseInt(input);
				//only intergers 0 and above are allowed
				if((element < 0)){
					System.out.println("INVALID INPUT");
				}else{
					validInput = true;
				}
			} catch (Exception e) {
				System.out.println("INVALID INPUT");
			}
		}//traps the user until they provide a non-negative int
		
		try {
			//if number is within arraylist bounds
			int num = element; //bring INT into int
			System.out.println("Element at index " + num + ": " + cars.get(num));
		} catch (Exception e) {
			//if out of bounds
			System.out.println("OUT OF BOUNDS");
		}
		
	}
}