package First_Package;

public class Polymorphism_Eg {

	public void display(int a, char b) {
		System.out.println("display method with int a and char b " +a +" "+ +b);
	}

	public int display(int a) {
		System.out.println("display method which returns int a " +a);
		return a;
	}
	public void display(boolean a) {
		System.out.println("display method with boolean a " +a);
		
	}
	public void display(char b, int a) {
		System.out.println("display method with char b and int a "+ a +" "+ b);
	}
	public static void display(char b) {
	System.out.println("Compile time Polymorphism " +b);
	}
	
	public static void main(String[] args) {

		Polymorphism_Eg Object=new Polymorphism_Eg();
		Object.display(true);
		display('c');
	}
}
