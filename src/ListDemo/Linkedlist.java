package ListDemo;

import java.util.*;
public class Linkedlist
{
	public static void main(String [] args)
	{
	  LinkedList<Prakesh> ll =new LinkedList<>();
	   
	  ll.add(new Prakesh(25));
	   
	  Prakesh s1= new Prakesh(34);
	  ll.add(s1);
	  
		Iterator itr= ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}}
class Prakesh
{
  int rollNo;
  Prakesh(int rollNo)
  {
	  this.rollNo=rollNo;
  }
  public String toString() {
    return "" +rollNo;
  }
  
}