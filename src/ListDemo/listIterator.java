package ListDemo;

import java.util.*;

public class listIterator {

	public static void main(String[] args) {
     
		List<String> al= new ArrayList<>();
		             al.add("siva");
		             al.add("prakesh");
		             al.add("Raja");
		             al.add("Praveen");
		             
		/* ListIterator<String> itr = al.listIterator();  
		 System.out.println("In Forward Directin...!");
		 while (itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 System.out.println("In Reverse Directin...!");
		 while (itr.hasPrevious())
		 {
			 System.out.println(itr.previous());
		 }
         */
		             
		             //using Lambda Expression
		    Iterator itr =al.iterator();         
		        itr.forEachRemaining(a->{
		        	System.out.println(a);
		        	});
		             
		 
	}

}
