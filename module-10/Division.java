abstract class Division {
	//abstract class - cannot be instanced directly
	
	String compName;
	int accNum;
	
	//all extended classes mu have these two passed through the parent class first
	//before they can be utilized by those extended classes
	public Division (String compName, int accNum){
		this.compName = compName;
		this.accNum = accNum;
	}

	//method to be overridden
	abstract void display();
	
	public String getName(){
		return compName;
	}
	
	public int getAcc(){
		return accNum;
	}
}