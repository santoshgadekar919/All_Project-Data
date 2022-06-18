package First_Package;

import Second_Package.Class_B;

public class Class_A extends Class_B{
	protected int a=100;
	public static void main(String[] args) {
		//Within Class
		Class_A Object1=new Class_A(); 
		System.out.println(Object1.a);
		//Outside Class
		abc Object2=new abc();
		Object2.display();
		System.out.println(Object2.b);
		//Within Package
		Class_C Object4=new Class_C();
		System.out.println(Object4.D); 
		//Outside Package
		Class_B Object3=new Class_B();
		
	}
}
class abc{
	protected int b=525;
	public void display() {
		System.out.println("Hello I am in abc class");
	}
}
