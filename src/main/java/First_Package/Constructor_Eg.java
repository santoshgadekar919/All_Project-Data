package First_Package;

public class Constructor_Eg {
	int a=100;
	public Constructor_Eg() {
		this(15,16);
		int a = 10;
		String m = "My name is Santosh D. Gadekar";
		System.out.println("Hi, I am in Non Parameterize Constructor. " + m + " and value of a is " + this.a + "." +a);
	}

	public Constructor_Eg(int a, int b) {
		
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Constructor_Eg Object1=new Constructor_Eg();
		
	}
}
