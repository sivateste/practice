package CollectionClassDemo;

import java.util.ArrayList;
import java.util.Collections;

public class collectionClassDemo {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();
			      al.add(50);
			      al.add(12);
			      al.add(40);
			      al.add(5);
			      al.add(33);
			      
			      System.out.println(al);
			      Collections.sort(al);   //Sorting the order
			      System.out.println(al);
			      Collections.reverse(al); //Reverse the order
			      System.out.println(al);
			      Collections.swap(al,1,4); //Exchange the elements
			      System.out.println(al);
			      System.out.println(Collections.min(al)); //small element
			      System.out.println(Collections.max(al)); // Big element
		
	}

}
