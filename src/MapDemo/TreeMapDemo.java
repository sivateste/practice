package MapDemo;

import java.util.Iterator;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

		public static void main(String[] args) {
			
			TreeMap tm = new TreeMap();
			
						  tm.put("name","siva");
						  tm.put("Dob","31st July");
						  tm.put("Name","Prakesh");
						  
						  Set s= tm.keySet();
			Iterator itr =s.iterator()	;
			while(itr.hasNext())
			{
				Object obj =itr.next();
				String str =(String)obj;
				System.out.println(str+":"+tm.get(str));
			}

	}

}
