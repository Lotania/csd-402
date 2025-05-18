class DomesticDivision extends Division {
	//extension territorial
	
	String state;
	
	public DomesticDivision (String compName, int accNum, String state){
		super(compName, accNum);//super requires all variable from a parent in parentheses
		this.state = state;
	}
	
	//abstract void
	@Override
	void display(){
		System.out.println("The company " + super.getName() + " (ACC NO. " + super.getAcc() + ") is located in " + state + ".");
	}
}