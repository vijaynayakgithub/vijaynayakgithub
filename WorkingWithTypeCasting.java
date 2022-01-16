package Assignments.com;

public class WorkingWithTypeCasting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char ch='K';
		System.out.println("The Character is "+ ch);
		int i=ch;
		System.out.println("The converted integer form is "+i);
		long l=ch;
		System.out.println("The long form is "+ l);
		double d=ch;
		System.out.println("The Double form is"+ d);
		
		
		System.out.println("Explicit Type Casting");
		double db=70;
		System.out.println("The double is "+db);
		int in=(int)db;
		System.out.println("The integer is "+in);
		char c=(char)db;
		System.out.println("The character is "+c);
		

	}

}