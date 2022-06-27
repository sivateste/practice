package ListDemo;

import java.util.*;

public class All_Practice {

	public static void main(String[] args) {
    
	/* void add()
	  	List<String> al = new ArrayList<>();
	 
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
		al.add("praveen");
		al.add(2, "vasu");
		
		List<String> al2 = new ArrayList<>();
		al2.add("raju");
		al2.add("Kumar");
		al2.add("lucky");
		al2.add("ramu");
		 //adding al elements
		al2.addAll(al);
		//using clear method
	    al2.clear();
		
		for (String s:al)
		{
			System.out.println(s);
		}
		for (String x:al2)
		{
			System.out.println(x);
		}
	*/
		
		//boolean equals
	/*	
		List<String> al = new ArrayList<>();
		 
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
		al.add("praveen");
		al.add(2, "vasu");
		
		List<String> al2 = new ArrayList<>();
		 
		al2.add("siva");
		al2.add("prakesh");
		al2.add("Raja");
		al2.add("praveen");
		al2.add(2, "vasu");
		al2.add("ravi");   // is not same element to remove the element return value true
		System.out.println(al.equals(al2));
		*/
		
		
		//int lastIndexOf()
	/*	List<String> al = new ArrayList<>();
		 
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
		al.add("praveen");
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
		al.add("praveen");
 
		System.out.println(al.lastIndexOf("Raja"));`
		
		*/
		//using indexOf()
	/*	List<String> al = new ArrayList<>();
		 
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
		al.add("praveen");
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
		al.add("praveen");
 
		System.out.println(al.indexOf("Raja"));`
		*/
		
		//using Contains()
	/*	List<String> al = new ArrayList<>();
		 
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
	    al.add("praveen");
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
		al.add("praveen");
			
 
		System.out.println(al.contains("siva");
		*/
		
		//using remove()
	/*	List<String> al = new ArrayList<>();
		 
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
	    al.add("praveen");
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
		al.add("praveen");
		al.remove("siva");
		
 
		System.out.println(al);
		*/
		
		//using  set()
	/*	List<String> al = new ArrayList<>();
		 
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
	    al.add("praveen");
		al.add("siva");
		al.add("prakesh");
		al.add("Raja");
		al.add("praveen");
		al.set(4, "raju");
 
		System.out.println(al);
     */
		
		//using sort()
		
		List<String> al = new ArrayList<>();
		 
		al.add("Raja");
		al.add("Lokesh");
		al.add("Prakesh");
	    al.add("praveen");
	    al.add("siva");
	    al.add("raja");
		//al.sort(String.CASE_INSENSITIVE_ORDER); //lower case & Uppercase same elements side by side
		al.sort(Comparator.naturalOrder()); // first print Upper case &last print Lower Case elements
		System.out.println(al);

		
	}

}
