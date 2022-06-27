package MapDemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

class HashTableDemo {


		public static void main(String[] args) {
			
			Hashtable ht = new Hashtable();
			
						  ht.put("name","siva");
						  ht.put("Dob","31st July");
						  ht.put("Name","Prakesh");
						  
						  Set s= ht.keySet();
			Iterator itr =s.iterator()	;
			while(itr.hasNext())
			{
				Object obj =itr.next();
				String str =(String)obj;
				System.out.println(str+":"+ht.get(str));
			}

	}

}
