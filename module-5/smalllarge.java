//Anthony Nguyen, Assignment 5, 04-13-2025
//This program demonstrates basic Java 2d array iteration and data analyzing
//by comparing largest and smallest values.

public class smalllarge {

	//writing the methods first
	public static int [ ] locateLargest (double [ ][ ] arrayParam){
		//row and col store location of target value
		int row = 0;
		int col = 0;
		
		//double largest = 0; cannot do this - what if all numbers in the array are negative?
		
		double largest = arrayParam[0][0];//use 1st value for comparison
		
		for (int i = 0; i < arrayParam.length; i++) {//iterate through rows
			for (int j = 0; j < arrayParam[i].length; j++) {//iterate through columns
				if (arrayParam[i][j] > largest){
					//replaces 3 values if criteria met
					largest = arrayParam[i][j];
					row = i;
					col = j;
				}
			}
		}
		int array [] = {row,col};//accept values to return to main
		System.out.println("Largest number in the array: " + largest); //print result
		
		return array;
		
	}
	public static int [ ] locateLargest (int [ ][ ] arrayParam){
		int row = 0;
		int col = 0;
		//int largest = 0; cannot do this - what if all numbers in the array are negative?
		int largest = arrayParam[0][0];
		
		for (int i = 0; i < arrayParam.length; i++) {
			for (int j = 0; j < arrayParam[i].length; j++) {
				if (arrayParam[i][j] > largest){
					largest = arrayParam[i][j];
					row = i;
					col = j;
				}
			}
		}
		int array [] = {row,col};
		System.out.println("Largest number in the array: " + largest);
		
		return array;
	}
	public static int [ ] locateSmallest (double [ ][ ] arrayParam){
		int row = 0;
		int col = 0;
		double smallest = arrayParam[0][0];
		
		for (int i = 0; i < arrayParam.length; i++) {
			for (int j = 0; j < arrayParam[i].length; j++) {
				if (arrayParam[i][j] < smallest){
					smallest = arrayParam[i][j];
					row = i;
					col = j;
				}
			}
		}
		int array [] = {row,col};
		System.out.println("Smallest number in the array: " + smallest);
		
		return array;
	}
	public static int [ ] locateSmallest (int [ ][ ] arrayParam){
		int row = 0;
		int col = 0;
		int smallest = arrayParam[0][0];
		
		for (int i = 0; i < arrayParam.length; i++) {
			for (int j = 0; j < arrayParam[i].length; j++) {
				if (arrayParam[i][j] < smallest){
					smallest = arrayParam[i][j];
					row = i;
					col = j;
				}
			}
		}
		int array [] = {row,col};
		System.out.println("Smallest number in the array: " + smallest);
		
		return array;
	}
	
	public static void main (String[] args){
		//target arrays are things of thing. sizes are varied to ensure code works properly
		double [][] thing = {
			{2.54,34.55,9.6,3.45},
			{8.0,65.66,2.059,3.14},
			{8.7,6.5,4.3,2.1}
		};
		
		int [][] ghint = {
			{2,34,5,67,65,4,3,2},
			{345,676,543,9473,456,78,765},
			{9999,34,56,54,3,2},
			{2,34,5,67,8,9,8,9,8,98,7},
			{98,7,6,78,98,76,54321,23456}
		};
		
		double [][] night = {//java can't turn 3 into 3.0...
			{23.43,65.0,-245.432},
			{-4.3,456.54,-5.5},
			{34.5654,323.456,789.8765,432.3456},
			{3443.45,54456.54,5.7,-400.5}
		};
		
		int [][] ginth = {
			{2,34,56,78,98,76,54,34},
			{9876,876,787,654,5676,543,4,32},
			{-4,-8,345,678,765,432,3,456,78},
			{2,34,56,78,76,5,43,2,34,-2},
			{23,45,67,8}
		};
		
		//all blocks of code initiate method of its type, printing location of target value
		int firstthing [] = locateLargest(thing);
		System.out.print("Location: ");
		for (int num : firstthing){
			System.out.print(num + " ");
		}
		
		System.out.println("\n");
		
		int secondthing [] = locateLargest(ghint);
		System.out.print("Location: ");
		for (int num : secondthing){
			System.out.print(num + " ");
		}
		
		System.out.println("\n");
		
		int thirdthing [] = locateSmallest(night);
		System.out.print("Location: ");
		for (int num : thirdthing){
			System.out.print(num + " ");
		}
		
		System.out.println("\n");
		
		int fourththing [] = locateSmallest(ginth);
		System.out.print("Location: ");
		for (int num : fourththing){
			System.out.print(num + " ");
		}
	}
}