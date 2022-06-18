package First_Package;

public class Polymorphism_Eg_1 extends Polymorphism_Eg{
	public void display(int a, char b) {
		System.out.println("display method in Polymophism_Eg_1 with int a and char b " +a +" "+ +b);
	}

	public int display(int a) {
		System.out.println("display method in Polymophism_Eg_1 which returns int a " +a);
		return a;
	}
	public void display(boolean a) {
		System.out.println("display method in Polymophism_Eg_1 with boolean a " +a);
		
	}
	public void display(char b, int a) {
		System.out.println("display method in Polymophism_Eg_1 with char b and int a "+ a +" "+ b);
	}
	public static void display(char b) {
	System.out.println("Compile time Polymorphism in Polymophism_Eg_1 " +b);
	}
	public static void main(String[] args) {
		
		Polymorphism_Eg_1 Object=new Polymorphism_Eg_1();
		Object.display(0);
	}

}
