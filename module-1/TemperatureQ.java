//Anthony Nguyen, Assignment M1.3
//The purpose of the program is to demonstrate the basic input and
//output capabilities of Java.

import java.util.Scanner;//required for input

class TemperatureQ {
	public static void main(String[] args) {//key line for main program
		
		Scanner scanner = new Scanner(System.in);//key line for establishing instance of input
		
		System.out.println("This program will calculate energy based on you inputs.");
		
		//input all fields
		System.out.println("Input the starting temperature (in Celsius):");
		double temp_init = scanner.nextDouble();
		
		System.out.println("Input the ending temperature (in Celsius):");
		double temp_final = scanner.nextDouble();
		
		System.out.println("Input the mass of water in kg:");
		double water_Mass = scanner.nextDouble();
		
		//type match through the entire equation
		double jQules = water_Mass * (temp_final - temp_init) * 4184;
		//avoid using single letter variable names
		
		//format to make it slightly easier to read
		String formatted_temp_init = String.format("%.2f", temp_init);
		String formatted_temp_final = String.format("%.2f", temp_final);
		String formatted_water_Mass = String.format("%.2f", water_Mass);
		String formatted_jQules = String.format("%.2f", jQules);
		
		//output the equation result, and everything the user inputted
		System.out.println("It takes " + formatted_jQules + " to heat " + formatted_water_Mass + "kg of water from " + formatted_temp_init + (char)176 + "C to " + formatted_temp_final + (char)176 + "C.");
	}
}