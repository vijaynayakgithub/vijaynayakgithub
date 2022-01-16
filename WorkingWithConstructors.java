package Assignments.com;

public class WorkingWithConstructors {
	int empID;
	String name;
	void display() {
		System.out.println(empID +" : "+ name);
	}
		

	public static void main(String[] args) {
		WorkingWithConstructors emp1 = new WorkingWithConstructors();
		emp1.display();//default constructor gave values 0 and null
		
		
		
		paraConstructor emp2 = new paraConstructor(2487587, "Vijay Nayak");

	}

}
class paraConstructor{
	int empID;
	String name;
	paraConstructor(int empID,String name) {// parametrized constructor
		this.empID=empID;
		this.name=name;
		System.out.println(empID +" : "+ name);
	}
}