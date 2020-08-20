package sarmabaruaabhigyan_OOP_06;

//Importing arraylist.
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		Person P1 = new Person("Alex", 123456789);
		Person P2 = new Person("Ben", 987654321);
		Person.equals(P1, P2);
		
		//Creating two Employee objects.
		Employee E1 = new Employee("Wesley", 987653221, "A721365352");
		Employee E2 = new Employee("Wsly", 987653221, "A721365352");
		
		//Calling the equal method of the Employee class.
		Employee.equals(E1, E2);
		
		//Creating an arraylist for all the four objects.
		ArrayList<Person> arrayList= new ArrayList<Person>();
		//Adding all the four objects to the arraylist.
		arrayList.add(P1);
		arrayList.add(P2);
		arrayList.add(E1);
		arrayList.add(E2);
		//Calling the printArrayList to display the object details.
		printArrayList(arrayList);

	}
	
	public static void printArrayList(ArrayList<Person> arrayList) {
		
		//Calling the toString method for all of the objects in the arraylist to display the details of the objects
		for (int i=0; i<arrayList.size(); i++) {
			arrayList.get(i).toString();		
		}
	
	}

}
