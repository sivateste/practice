package SetDemo;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts =new TreeSet();
        ts.add("siva");
        ts.add("Raju");
        ts.add("kalyani");
        ts.add("ravi");
        ts.add("Lokesh");
        ts.add("Lokesh");   // it does not allow duplicate values

    /*  Iterator   itr = ts.descendingIterator();
        while(itr.hasNext())
      {
	      System.out.println(itr.next());
       }
*/
       // System.out.println(ts.last());
        
        //System.out.println(ts.first());
        
        TreeSet ts1 =(TreeSet) ts.headSet("kalyani"); // Bellow elements taken
        
        System.out.println(ts1);
        
        TreeSet ts2 =(TreeSet) ts.tailSet("kalyani"); // above elements taken
        
        System.out.println(ts2);
  
        TreeSet ts3 =(TreeSet) ts.subSet("Raju" ,"ravi"); // form Raju element to ravi element print
        
        System.out.println(ts3);

	}

}
