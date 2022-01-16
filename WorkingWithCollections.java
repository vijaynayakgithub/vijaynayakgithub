package Assignments.com;

import java.util.*;

public class WorkingWithCollections {

	public static void main(String[] args) {
				System.out.println("ArrayList");
				ArrayList<Integer> number=new ArrayList<Integer>();   
			      number.add(1);//
			      number.add(11);    	   
			      System.out.println(number);  
				

			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<String> name = new Vector();
			      name.addElement("Vijay"); 
			      name.addElement("Vamshi"); 
			      System.out.println(name);
			      for(String nam:name)
			    	  System.out.print(nam+" ");
				

			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("Alex");  
			      names.add("John");  	
			      names.add("Vijay");
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  }
			      System.out.println(names);
			       
			       
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(101);  
			       set.add(103);  
			       set.add(102);
			       set.add(104);
			       set.add(100);
			       System.out.println(set);
			       
			      
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(11);  
			       set2.add(13);  
			       set2.add(12);
			       set2.add(14);
			       set2.add(10);
			       System.out.println(set2);
			      	} 


	}