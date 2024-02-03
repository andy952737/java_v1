package com.staticlesion;

public class Student {
	//instance variable
	int rollno;   
	String name;
	
	//static variable, constructor
	static String college = "ITS";
	
    static void change(){  
    	college = "BBDIT";  
    }
//	void change(){  
//    	college = "BBDIT";  
//    }
	  
	Student(int r, String n){  
      rollno = r;  
      name = n;  
    }
	
	//method to display the values  
	 void display(){System.out.println(rollno+" "+name+" "+college);}  


}