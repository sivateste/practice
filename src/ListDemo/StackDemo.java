package ListDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack s = new Stack();
		      s.push(5);
		      s.push("siva reddy");
		      s.push(3);
		      s.push(1);
		      s.push(6);
		      
		      System.out.println(s.empty());
		      System.out.println(s.search(6));
		      System.out.println(s.peek());
		      System.out.println(s.pop());
		      System.out.println(s.pop());
		      System.out.println(s.contains("siva reddy"));

		      
		      
	}

}
