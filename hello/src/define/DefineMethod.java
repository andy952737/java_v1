package define;

public class DefineMethod {
	// local variable
	int num1 = 75;
	int num2 = 25;

	// create a add method
	public int addNumbers(int a, int b) {
		int sum = a + b;
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
		int num3 = 100;
		int num4 = 150;
		
		// use multiplica
		int num5 = 1000;
		int num6 = 2;
		
		// user division
		int num7 = 500;
		int num8 = 2;
		
		// create an object of Main
		// Define yourself: obj 
		DefineMethod obj = new DefineMethod();
		DefineMethod obj2 = new DefineMethod();
		DefineMethod obj3 = new DefineMethod();
		DefineMethod ObjDivision = new DefineMethod();
		
		// result method
		int result = obj.addNumbers(obj.num1, obj.num2);
		System.out.println("Sum is:" + " " + result);
		
		int result2 = obj2.Subtractions(num3, num4);
		System.out.println("Subtract is:" + " " + result2);
		
		int result3 = obj3.Multiplications(num5, num6);
		System.out.println("Multiplica is:" + " " + result3);
		
		int result4 = ObjDivision.Divisions(num7, num8);
		System.out.println("Division is:" + " " + result4);
		
		obj.add();
		
		// obj.main(args);
	}
	
}
