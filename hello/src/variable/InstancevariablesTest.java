package variable;

public class InstancevariablesTest {
	// ()後面是 input
	// void or int
	public static void main(String[] args) { 
		
		Instancevariables instancevariable = new Instancevariables();
		
		//instancevariable.myNum = 40;
		System.out.println(instancevariable.myNum);
		
		instancevariable.mySht = 3 * 9;
		System.out.println(instancevariable.mySht);
		
		instancevariable.myFum = 9.4f - 3.5f;
		System.out.println(instancevariable.myFum);
		
		//instancevariable.myBan = false;
		System.out.println(instancevariable.myBan);
		
		instancevariable.myText = "Java Hello";
		System.out.println(instancevariable.myText);
		
		// int a = 10;
		// return a;  
		
	}
}
