package ListDemo;

import java.util.*;
public class example {

	public static void main(String[] args) {

		/*ArrayList al=new ArrayList();
		
		          al.add("siva");
		          al.add("prakesh");
		          al.add(25);
		          al.add(5634.423);
		          al.add('A');
		          System.out.println(al);
		          */
		
		List<String> al=new ArrayList<>();
		al.add("siva");
		al.add("prakesh");
		al.add("raja");
		al.add("praveen");
		
		System.out.println(al);
		//using for each loop
		for( String s:al)
		     System.out.println(s);  
		
		//using for loop
		for(int i=0;i<al.size();i++)
			//  System.out.println(i);  using size method
		   System.out.println(al.get(i)); //using get method`

	}

}
