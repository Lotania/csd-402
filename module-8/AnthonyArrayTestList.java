import java.util.*;// * to accept scanner and Collections

public class AnthonyArrayTestList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//activate input object
		String inputNum;
		int numTest= 0;
		boolean stopAdding = false;//flag for imput loop
		
		ArrayList<Integer> arrayTest = new ArrayList<Integer>();
		//list accepts input
		
		System.out.println("You will continue to input integers until you press 0.");
		System.out.println("Input an integer.");
		
		while(!stopAdding){
			inputNum = scanner.nextLine();
			try {
				numTest = Integer.parseInt(inputNum);
				//only integers (including negative) are acceptable
				if((numTest != 0)){
					arrayTest.add(numTest);
					System.out.println("Continue inputting an integer.");
				}else{
					arrayTest.add(numTest); //required to add 0 to list
					stopAdding = true;
				}
			} catch (Exception e) {
				System.out.println("INVALID INPUT");
			}
		}//traps the user until they provide an integer
		//this also ensures that the list contains at least a 0
		
		ArrayList<Integer> arrayNull = new ArrayList<Integer>();
		//empty list will demonstrate the second half of the method
		
		Integer max1 = max(arrayTest);//
		System.out.println("Maximum value: " + max1);
		
		Integer max2 = max(arrayNull);
		System.out.println("Maximum value: " + max2);
	}//end of main

	public static Integer max(ArrayList<Integer> list) {
		if (list == null || list.isEmpty()) {
			return 0;//an empty list will return a 0
		}
		return Collections.max(list);//one for all
		
	}
}