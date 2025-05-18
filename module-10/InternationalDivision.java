class InternationalDivision extends Division {
	//extension int'l
	
	String country;
	String language;
	
	public InternationalDivision (String compName, int accNum, String country, String language){
		super(compName, accNum);//super requires all variable from a parent in parentheses
		this.country = country;
		this.language = language;
	}
	
	//abstract void
	@Override
	void display(){
		System.out.println("The company " + super.getName() + " (ACC NO. " + super.getAcc() + ") is located in " + country + ", whose language is " + language + ".");
	}
}