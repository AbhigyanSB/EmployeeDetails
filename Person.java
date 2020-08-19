package sarmabaruaabhigyan_OOP_06;

//Person class
public class Person {

	//Creating a public String and integer for the name and phone number.
	public String name;
	public int phone;

	//Constructor using the fields.
	public Person(String name, int phone) {
		this.name = name;
		this.phone = phone;
	}
	
	@Override 
	//toString method to display the details of the Person.
	public String toString() {
		System.out.println("The name of the person is "+this.name+".");
		System.out.println("The phone number of "+this.name+" is "+this.phone+".");
		System.out.println();			//To create a gap between the information of each objects.
		return "";						//Returning an empty String.
	}
	
	//Equals method to determine if two persons are the same.
	public static boolean equals(Person A, Person B) {
		
		//Checking for a Person object being compared to itself and also to null.
		if(!(A instanceof Person) && !(B instanceof Person)) {
			return false;
		}
		else {
			Person Pa = (Person) A;
			Person Pb = (Person) B;
			//Condition of the Person to be the same, if the names and the phone numbers are also the same.
			if(Pa.name==Pb.name && Pa.phone==Pb.phone) {
				System.out.println("The two persons "+Pa.name+" and "+Pb.name+" are the same, as they have the same name and phone number.");
				System.out.println();
				return true;
			}
			else {
				System.out.println("The two persons "+Pa.name+" and "+Pb.name+" are different, as they have different names and phone numbers.");
				System.out.println();
				return false;
			}
		}
	}

}
