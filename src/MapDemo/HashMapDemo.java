package MapDemo;
import java.io.ObjectInputStream.GetField;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap hm= new HashMap();
		        hm.put("name", "siva");
		        hm.put("Dob","31st july");
		        
		        hm.put("Name", "Prakesh");
		        
		        Set s=hm.keySet();
		        
		        Iterator itr=s.iterator();
		        while(itr.hasNext()) {
		        Object obj =itr.next();
		        String str = obj.toString();
		        System.out.println(str+" :"+hm.get(str));
		        
		        }
		        
		       hm.remove("Name", "Prakesh"); // remove the key and Value
		        
		        System.out.println(hm.size()); // total get the size
		        System.out.println(hm.get("Dob")); // get the Dob (key) value (31st july)
		        System.out.println(hm.isEmpty()); // return false
		        
	}

}
