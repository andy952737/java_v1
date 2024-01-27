package define;

public class DefineMethod {
	// local variable
	int num1 = 75;
	int num2 = 25;
	
	// constructor
	public DefineMethod() {
		System.out.println("***************** null *****************");
	}
	
	public DefineMethod(int n1, int n2) {
		this.num1 = n1;
		this.num2 = n2;
	}

	// create a add method
	public int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	// ex1. overload create a add method
	public int addNumbers(int a, int b, int c) {
		int i = 20;
		int sum = i + b + a;
		return sum;
	}
	
	// ex2. overload create a add method
	public int addNumbers(int a) {
		int i = 20;
		int sum = a + i;
		return sum;
	}

	// create a subtract method
	public int Subtractions(int c, int d){
		int subtract = c - d;
		return subtract;
	}
	
	// create a multiplication method
	public int Multiplications(int e, int f) {
		int multiplica = e * f;
		return multiplica;
	}
	
	// create a division method
	public int Divisions(int g, int h) {
		int division = g / h;
		return division;
	}
	
	// not Define yourself method
	public void add() {
		int num1 = 2500;
		int num2 = 1500;
		int result = num1 + num2;
		System.out.println("Add Result is:" + " " + result);
	}
	
	public class Main {
		public static void main(String[] args) {
			System.out.println("Square root of 4 is:" + " " + Math.sqrt(4));
		}
	}
	
	public static void main(String[] args) {
		// use add
		// int num1 = 25;
		// int num2 = 25;
		
		// void variable
		// use subtract
		// int num3 = 100;
		// int num4 = 150;
		
		// use multiplica
		// int num5 = 1000;
		// int num6 = 2;
		
		// use division
		int num7 = 500;
		int num8 = 2;
		
		// create an object of Main
		// Define yourself: obj 
		
		// result method
		DefineMethod obj = new DefineMethod(2000, 4000);
		int result = obj.addNumbers(obj.num1, obj.num2);
		System.out.println("Sum is:" + " " + result);
		
		DefineMethod obj2 = new DefineMethod(100, 50);
		int result2 = obj2.Subtractions(obj2.num1, obj2.num2);
		System.out.println("Subtract is:" + " " + result2);
		
		DefineMethod obj3 = new DefineMethod(2, 50);
		int result3 = obj3.Multiplications(obj3.num1, obj3.num2);
		System.out.println("Multiplica is:" + " " + result3);
		
		DefineMethod ObjDivision = new DefineMethod();
		int result4 = ObjDivision.Divisions(num7, num8);
		System.out.println("Division is:" + " " + result4);
		
		obj.add();
	}
	
}
