
package Assignments.com;

public class WorkingWithInnerClasses {

	public static void main(String[] args) {
		vijay vij = new vijay() {
			
			@Override
			public void vamshi() {
				System.out.println("annonymous inner class");// annonymous inner class
			}
		};
		vij.vamshi(); 
		
		rakesh rak = new rakesh();
		rak.home(new vijay() {
			@Override
			public void vamshi() {
				System.out.println();
				System.out.println("Argument based annonymous inner class");
			}
			
		});
		
		System.out.println();
		
		new outer().new inner().print();
		
		System.out.println();
		
		

	}

}


interface vijay{
	void vamshi();
}


class rakesh {
	void home(vijay ref) {
	ref.vamshi();}
}

class outer{
	class inner{
		void print() {
			System.out.println("Regular inner class");
		}
	}
}



class Outer{
	void func() {
		class Inner{
			void print() {
				System.out.println("Method local inner class");
			}
		}
		new Inner().print();
	}
}
