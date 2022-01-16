package javaproject;

public class WorkingWithAccessSpecifers {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		WorkingWithAccessSpecifers ref = new WorkingWithAccessSpecifers();
	}
	void met() {
		System.out.println("vijay");
	}
	public void walk() {
		System.out.println("Am Walking...!");
		
	}
	protected void speak() {
		System.out.println("I can Speak..!");
	}
	private void breathe() {
		System.out.println("I can Breath..!");
	}
	
}
class Vijay{
	void aish() {
		System.out.println("hi am aishwarya");
		WorkingWithAccessSpecifers def = new WorkingWithAccessSpecifers();
		def.met();
		def.walk();
		def.speak();
		def.breathe();//will not display because private method of same package in other class
	}
	
}