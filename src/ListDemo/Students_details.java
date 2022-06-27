package ListDemo;

import java.util.*;

class Student
{
	int rollno;
	String name,address;
	
	Student(int rollno,String name,String address)
	{
		this.rollno=rollno;
		this.name=name;
	    this.address=address;
	} 

}


public class Students_details {

	public static void main(String[] args) {

		List<Student> list =new ArrayList<>();
		Student s1 =new Student(1,"Siva","Nellore");
		Student s2 =new Student(2,"Raja","Atmakur");
		Student s3 =new Student(3,"Prakesh","Hyderbad");
		Student s4 =new Student(4,"Praveen","Nellore");
     
				list.add(s1);
				list.add(s2);
				list.add(s3);
				list.add(s4);
			for(Student s:list)	
			{
		System.out.println(s.rollno+":"+s.name+","+s.address);
			}
	}

}
