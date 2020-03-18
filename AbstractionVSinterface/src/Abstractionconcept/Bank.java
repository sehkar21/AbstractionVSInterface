package Abstractionconcept;

public abstract class Bank {   //abstract class with keyword abstract

	//partial abstraction--- both abstract and non methods present
	
	
	public abstract void loan();  //abstract method with keyword abstract but no method body
	
	public void credit() {   //non abstract method in abstract class
		
		System.out.println("credit----bank");
	}
	
	public void debit() {
		
		System.out.println("debit---bank");
	}
	
	
	
	
}
