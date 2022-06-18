package First_Package;

public class Loops_Practice {

	public static void main(String[] args) {
//		111111
//		int c;
//		for(int j=1; j<=100; j++) {
//			c=0;
//			for (int k=1; k<=j;k++) {
//				if(j%k==0) {
//					c=c+1;
//				}
//			}
//			if(c!=2) {
//				System.out.print(j +" " );
//			}
//		}

//		2222222
//		for (int i = 5; i >0; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		int i=1;
//		for(int j=0; j<4; j++) {
//			for(int k=0; k<=j; k++) {
//		System.out.print(i++ +" ");
//		}
//		System.out.println();
//		}

//		for (int i=0; i<4; i++) {
//			for(int j=3; j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<=i;k++) {
//			System.out.print("*" +" ");
//			
//		}
//			System.out.println();
//		}

//		int c,d=0;
//		for(int i=0;i<=100;i++) {
//			c=0;
//			for(int j=1; j<=i; j++) {
//				if(i%j==0) {
//					c=c+1;
//				}
//			}
//			if(c!=2) {
//				d=d+1;
//				System.out.print(i +" ");
//			}
//			
//			
//		}
//		System.out.println();
//		System.out.println("The count of total prime numbers between 1 to 100 is " +d);

//		char a[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
//		String c[] = { "Santosh1", "Santosh2", "Santosh3", "Santosh4", "Santosh5", "Santosh6" };
//		int b[] = { 25, 68, 98, 1, 25, 45 };
//
//		System.out.println(a[1] + " " + c[3] + " " + b[5]);
//
//		System.out.println(a.length + " " + c.length + " " + b.length);
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i] + " " + c[i] + " " + b[i]);
//		}
//
//		int k[] = new int[5];
//		k[1] = 55;
//		System.out.println(k[1]);

//		char a[]= {'a', 'w', 'r', 'a', 't', 'w', 'A', 'g' };
//		
//		for(int i=0; i<a.length;i++) {
//			for(int j=0; j!=i;j++) {
//				if(a[i]==a[j]) {
//					System.out.println(a[i]);
//				}
//			}
//		}

//		char a[]= {'a', 'a','w', 'w', 'w', 't', 'w', 'f', 'A', 'g','g' }; 
//		
//		for(int i=0; i<a.length-1; i++) {
//			
//				if(a[i]==a[i+1]) {
//					System.out.println(a[i]);
//		
//			}
//		}
//		
//		
//		System.out.println();
//		
//		
//		char h[] = { '1', 'a', '5', 'w', '9', 't', 'w', 'f', 'A', 'g' };
//
//		for(int l=0;l<h.length;l++) {
//			if(!Character.isAlphabetic(h[l])) {
//				System.out.print(h[l] +" ");
//			}
//		}
//		int a;
//		int b[] = { 25, 9, 98, 2, 25, 99, 999, 25, 1, 35};
//		for(int i=0; i<b.length;i++) {
//			a=0;
//			for(int j=0; j<b.length; j++) {
//				if(b[i]<b[j]) {
//					a=a+1;
//				}
//			}
//			if(a==b.length-1) {
//				System.out.println(b[i]);
//			}
//		int t;
//		for(int i=0; i<b.length;i++) {
//			for(int j=0; j<b.length;j++) {
//				if(b[i]<b[j]) {
//					t=b[i];
//					b[i]=b[j];
//					b[j]=t;
//				}
//			}
//		}
//		for(int k=0; k<b.length; k++) {
//			System.out.print(b[k] + " ");
//		}
//		
//		String a="Testing";
//		String b="Testing";
//		String c="Hi Welcome to Hi Testing Class";
//		String d=" Testing";
//		String e="TESTING";
//		String f="testing";
//		String h="123456";
//		
//		System.out.println(a.equals(b));
//		System.out.println(a.equalsIgnoreCase(f));
//		System.out.println(e.toLowerCase());
//		System.out.println(f.toUpperCase());
//		System.out.println(f.concat(h));
//		System.out.println(a.length());
//		String j[]=c.split(" ");
//		System.out.println(j[0]);
//		
//		for(int i=0; i<j.length;i++) {
//			System.out.print(j[i] +" ");	
//		}
//		System.out.println();
//		System.out.println(c.replace("Hi", "1234"));
//		System.out.println(c.replaceFirst("Hi", "Hello"));
//		System.out.println(c.replaceAll("Hi", e));
//		
//		System.out.println(c.substring(0, 10));
//		
//		System.out.println(c.subSequence(0, 10));
//		
//		int ab=c.subSequence(0, 10).length();
//		System.out.println(ab);
//		
//		int abc=c.substring(0, 10).length();
//		System.out.println(abc);
//		
//		
//		System.out.println(c.contains(b));
//		System.out.println(c.charAt(0));
//		
//		System.out.println(d.trim());
//		
//		System.out.println(d.startsWith("T"));
//		
//		System.out.println(d.trim().startsWith("T"));
//		
//		
//		int adv=Integer.parseInt(h);
//		float advf=Float.parseFloat(h);
//		System.out.println(adv +" "+ advf);

//		String s = "Hello how are you all";
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
//		
//		System.out.println();
//		String s2[]=s.split(" ");
//		for(int j=s2.length-1;j>=0;j--) {
//			System.out.print(s2[j] +" ");
//		}
//		

//		String s = "Hello how are you all how hello u are";
//		
//		String s2[]=s.split(" ");
//		for(int i=0;i<s2.length;i++) {
//			for(int j=0;j!=i;j++) {
//				if (s2[i].contains(s2[j])) {
//					System.out.println(s2[i]);
//				}
//				
//				if (s2[i].equals(s2[j])) {
//					System.out.println(s2[i]);
//				}
//			}
//		}

//		String s = "My account number is 12345";
//		for(int i=0; i<s.length();i++) {
//			if (!Character.isAlphabetic(s.charAt(i))) {
//				System.out.print(s.charAt(i));
//			}
//		}

//		Loops_Practice Object = new Loops_Practice("Hello how are you all", "NITIN");
		
		

	}

	public Loops_Practice(String S, String S2) {
		mmethod(S, S2);
		
	}

	public void mmethod(String S, String S2) {
		if(S.contains(S2)) {
			System.out.println(S.replaceFirst(S2,rvst(S2) ));
		}
		else {
			System.out.println("The given String is not present");
		}
		
		if(S2.equals(rvst(S2))) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}

	public String rvst(String S2) {
		String S3 = "";
		for (int i = S2.length() - 1; i >= 0; i--) {
			S3 = S3 + String.valueOf(S2.charAt(i));
		}
		return S3;
	}

}
