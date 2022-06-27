package SetDemo;
	import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet ls = new LinkedHashSet();
					  ls.add(23);	
					  ls.add(34);
					  ls.add(13);
					  ls.add(17);
					  ls.add(34);
					  
	   Iterator itr = ls.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	}

}
