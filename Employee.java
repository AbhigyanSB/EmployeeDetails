package sarmabaruaabhigyan_OOP_06;

//Employee class with inheriting from the Person class.
public class Employee extends Person {

	//Creating a private String for the PPS number.
	private String pps;
	
	//Constructor against the fields.
	public Employee(String name, int phone, String pps) {
		super(name, phone);
		this.pps = pps;
	}
	
	@Override
	//toString method to display the details of the Employee.
	public String toString() {
		System.out.println("The PPS number of "+this.name+" is "+this.pps+".");
		System.out.println();			//To create a gap between the information of each objects.
		return "";						//Returning an empty String.
	}
	
	//Equals method to determine if two employees are the same.
	public static boolean equals(Employee A, Employee B) {
		
		//Checking for an Employee object being compared to itself and also to null.
		if(!(A instanceof Employee) && !(B instanceof Employee)) {
			return false;
		}
		else {
			Employee Ea = (Employee) A;
			Employee Eb = (Employee) B;
			//Condition of the Employee to be the same, if the PPS numbers are the same.
			if(Ea.pps==Eb.pps) {
				System.out.println("The two employees "+Ea.name+" and "+Eb.name+" are the same, as they have the same PPS number.");
				System.out.println();
				return true;
			}
			else {
				System.out.println("The two employees "+Ea.name+" and "+Eb.name+" have the different PPS number.");
				System.out.println();
				return false;
			}
		}
	}
	
}
