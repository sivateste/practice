package MapDemo;
import java.util.*;

public class LInkedHasMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		
					  lhm.put("name","siva");
					  lhm.put("Dob","31st July");
					  lhm.put("Name","Prakesh");
					  
					  Set s= lhm.keySet();
		Iterator itr =s.iterator()	;
		while(itr.hasNext())
		{
			Object obj =itr.next();
			String str =(String)obj;
			System.out.println(str+":"+lhm.get(str));
		}
					  

	}

}
