//Anthony Nguyen, Assignment 12.2, 05/31/2025

public class maintenanceCar {
	
	public static double yearlyService() {
		//standard service
		double standardcharge = 954.00;
		return standardcharge;
	}
	
	public static double yearlyService(int option1) {
		//standard service with oil change
		double standardcharge = 954.00;
		int oilcharge = 0;
		
		if (option1 == 1){
			oilcharge = 108;//conventional
		} else if (option1 == 2) {
			oilcharge = 132;//synthetic
		} else if (option1 == 3){
			oilcharge = 159;//synthetic blend
		} else {
			oilcharge = 180;//high mileage
		}
		
		double total = standardcharge + oilcharge;
		
		return total;
	}
	
	public static double yearlyService(int option1, int option2) {
		//standard service with oil change and tire rotation
		double standardcharge = 954.00;
		int oilcharge = 0;
		int tirecharge = 0;
		
		if (option1 == 1){
			oilcharge =108;
		} else if (option1 == 2) {
			oilcharge = 132;
		} else if (option1 == 3){
			oilcharge = 159;
		} else {
			oilcharge = 180;
		}
		
		if (option2 == 1 || option2 == 2){
			tirecharge = 75;//forward and rearward tire rotation
		} else {
			tirecharge = 116;//x-pattern rotation
		}
		
		double total = standardcharge + oilcharge + tirecharge;
		
		return total;
	}
	
	public static double yearlyService(int option1, int option2, int option3) {
		//standard service with oil change, tire rotation, and discount
		double standardcharge = 954.00;
		int oilcharge = 0;
		int tirecharge = 0;
		double discount = 0.00;
		
		if (option1 == 1){
			oilcharge = 108;
		} else if (option1 == 2) {
			oilcharge = 132;
		} else if (option1 == 3){
			oilcharge = 159;
		} else {
			oilcharge = 180;
		}
		
		if (option2 == 1 || option2 == 2){
			tirecharge = 75;
		} else {
			tirecharge = 116;
		}
		
		//note: you cannot apply more than one discount at a time; if you qualify for more than one discount, the higher discount will be applied
		if (option3 == 1){
			discount = 0.10;//first-time discount
		} else if (option3 == 2) {
			discount = 0.15;//senior discount
		} else {
			discount = 0.20;//veteran discount
		}
		
		double total = (standardcharge + oilcharge + tirecharge) * (1 - discount);
		
		return total;
	}
	
	public static void main(String[] args) {
		//each group will have the return formatted to $xxxx.xx
		String standard = String.format("%.2f", yearlyService());
		//can't test this one twice; it's literally only one number
		System.out.println("The charge of the standard service is $" + standard);
		System.out.println();
		
		String basiccombo1 = String.format("%.2f", yearlyService(2));
		System.out.println("The charge of the standard service plus a synthetic oil change is $" + basiccombo1);
		String basiccombo2 = String.format("%.2f", yearlyService(4));
		System.out.println("The charge of the standard service plus a high-mileage oil change is $" + basiccombo2);
		System.out.println();
		
		String premiumcombo1 = String.format("%.2f", yearlyService(1,3));
		System.out.println("The charge of the standard service plus a conventional oil change and an X-pattern tire rotation is $" + premiumcombo1);
		String premiumcombo2 = String.format("%.2f", yearlyService(3,1));
		System.out.println("The charge of the standard service plus a synthetic blend oil change and a foward tire rotation is $" + premiumcombo2);
		System.out.println();
		
		String discountcombo1 = String.format("%.2f", yearlyService(2,3,1));
		System.out.println("The charge of the standard service plus a synthetic oil change, an X-pattern tire rotation, and a 15% first-time discount is $" + discountcombo1);
		String discountcombo2 = String.format("%.2f", yearlyService(2,1,3));
		System.out.println("The charge of the standard service plus a synthetic oil change, a rearward tire rotation, and a 25% veteran discount is $" + discountcombo2);
		System.out.println();
	}
}