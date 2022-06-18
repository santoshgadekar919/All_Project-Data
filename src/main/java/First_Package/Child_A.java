package First_Package;

public class Child_A extends Parent {

	public Child_A() {
//		super();
//		this(15);
		System.out.println("NPC of Child_A");
	}
	
	public Child_A(int i) {
		super(15);
		System.out.println("PC of Child_A");
	}

	public void disp() {
		System.out.println("Display of Child");
	}

	public static void main(String[] args) {

//		Child_A Object=new Child_A();
		Child_A Object1=new Child_A(15);
//		Object.disp();
//		Object.display();
	}

}
