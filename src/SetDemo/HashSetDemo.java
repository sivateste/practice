package SetDemo;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

			HashSet hs =new HashSet();
			        hs.add("siva");
			        hs.add("Raja");
			        hs.add("Prakesh");
			        hs.add("Praveen");
			        hs.add("Prakesh");   // it does not allow duplicate values
		
			Iterator itr = hs.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	}

}
