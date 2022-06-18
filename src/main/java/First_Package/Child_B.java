package First_Package;

public class Child_B extends Child_A{

	public Child_B() {
		System.out.println("NPC of Child_B");
	}
	public Child_B(int i) {
		super();
		System.out.println("PC of Child_B");
	}
	public static void main(String[] args) {
		Child_B Object=new Child_B();
	}

}
