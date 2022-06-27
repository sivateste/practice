package ListDemo;

import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {

		Vector v= new Vector(5,1);
		
		       v.add("siva");
		       v.add("raja");
		       v.add("ravi");
		       v.add("prakesh");
		       v.add("praveen");
		       v.add("praveen");
		       v.add(2,"lokesh");
		       System.out.println(v.capacity());
		       System.out.println(v);
	}

}
