package array_list;

import java.util.ArrayList;
import java.util.Iterator;

import pojo.Student;

public class College {
	
	//ArrayList<Student>studentArraylist;
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList<Student>studentArraylist=new ArrayList<>();
		 * 
		 * studentArraylist.add(new Student(1,"Arif")); studentArraylist.add(new
		 * Student(2,"Vaibhav")); studentArraylist.add(new Student(3,"Sumit"));
		 * studentArraylist.add(new Student(4,"Dnyaneshwar")); studentArraylist.add(new
		 * Student(5,"Sachin"));
		 * 
		 * 
		 * System.out.println("Size of Student list "+studentArraylist.size());
		 * 
		 * for(int i=0;i<studentArraylist.size();i++) {
		 * 
		 * System.out.println("Student info "+studentArraylist.get(i).getId());
		 * System.out.println("Student info "+studentArraylist.get(i).getName());
		 * 
		 * }
		 */

		
		ArrayList a=new ArrayList();
		
		
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
				
		System.out.println("Student info "+a);
		
		
		
		Iterator iterator=a.iterator();
		
		while(iterator.hasNext())
		{
			
			System.out.println(iterator.next());
			
		}
		
	}

}
