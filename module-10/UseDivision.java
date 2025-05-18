//Anthony Nguyen, Assignment 10, 05/18/2025
//The purpose of this program is to demonstrate basic class extension capabilites

public class UseDivision {
	//this public class will access the divisions
	public static void main(String[] args) {
		InternationalDivision comp1 = new InternationalDivision("BIGLY", 987765, "UK", "English");
		DomesticDivision comp2 = new DomesticDivision("MANIC", 156546, "Texas");
		InternationalDivision comp3 = new InternationalDivision("GRIMER", 234567, "JAPAN", "Japanese");
		DomesticDivision comp4 = new DomesticDivision("GUMPONG", 3409766, "Georgia");
		comp1.display();
		comp2.display();
		comp3.display();
		comp4.display();
	}
}