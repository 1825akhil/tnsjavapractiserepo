package com.tns.collections;
import java.util.*; 

public class Collections {
public static void main(String[] args) {
	//Array List
	System.out.println("ArrayList"); 
	ArrayList l=new ArrayList(); 
	l.add("hyderabad"); 
	l.add("chennai"); 
	System.out.println(l); 
	l.remove(0); 
	System.out.println(l); 
	System.out.println(l.get(0)); 
	
	//Vector
	System.out.println("Vector"); 
	 Vector v=new Vector(); 
     v.addElement("hyderabad"); 
     v.addElement("chennai"); 
     v.addElement("mumbai"); 
     System.out.println(v); 
    v.removeElement("chennai"); 
  System.out.println(v); 
      System.out.println(v.get(0)); 
      
    //Stack
  	System.out.println("Stack"); 
  	 Stack s=new Stack(); 
     s.push("abc"); 
      s.push(10); 
      s.push(true); 
      s.push("abc"); 
      s.push(null); 
      System.out.println(s); 
      s.pop(); 
      System.out.println(s); 
      System.out.println(s.peek()); 
      System.out.println(s); 

    //Hash Set
    System.out.println("HashSet"); 
    Set e=new HashSet(); 
    e.add("rahul"); 
    e.add("priya"); 
    e.add("sumit"); 
    //l.add("sumit"); 
    System.out.println(e); 
   e.remove("priya"); 
   System.out.println(e); 


}
}
