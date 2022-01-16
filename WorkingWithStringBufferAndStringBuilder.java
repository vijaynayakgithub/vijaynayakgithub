package Assignments.com;

public class WorkingWithStringBufferAndStringBuilder {

	public static void main(String[] args) {
		
	//String into StingBuffer
		
		String str="heloo every one";
		System.out.println("String : "+str);
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		System.out.println("StringBuffer : "+sb);
		
	// String into StringBuilder
		StringBuilder sb1=new StringBuilder();
		sb1.append(str);
		System.out.println("StringBuilder : "+sb1);

	}

}
