 package ListDemo;


class company
{
double salary = 21000.12;


}
public class employee extends company
{
   int bonus = 1000;
	public static void main(String[] args) {
		
		 employee e= new employee();
		 System.out.println("total salary ="+(e.salary+e.bonus));
    
	}

}
