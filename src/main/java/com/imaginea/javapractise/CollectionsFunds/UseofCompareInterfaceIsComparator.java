package CollectionsFunds;
/* Advantage
 * 
 * It provides multiple sorting sequence i.e. you can sort the elements based on any data member.
 *  For instance it may be on rollno, name, age or anything else. 
 * 
 * */

import java.util.Comparator;


import java.util.*;
import java.io.*;

public class UseofCompareInterfaceIsComparator
{
	public static void main(String args[]){

		ArrayList al=new ArrayList();
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(106,"Ajay",27));
		al.add(new Student(105,"Jai",21));

		System.out.println("Sorting by Name...");

		Collections.sort(al,new NameComparator());
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al,new AgeComparator());
		Iterator itr2=al.iterator();
		while(itr2.hasNext()){
			Student st=(Student)itr2.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}


	}
}


class AgeComparator implements Comparator
{  
	public int compare(Object o1,Object o2){  
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
Integer a1 =s1.age;
Integer a2 =s2.age;
		/*if(s1.age==s2.age)  
			return 0;  
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;  */
		return a1.compareTo(a2);  
	}


}


class NameComparator implements Comparator
{  
	public int compare(Object o1,Object o2){  
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  

		return s1.name.compareTo(s2.name);  
	}  
	
}

