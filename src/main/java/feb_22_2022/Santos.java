package feb_22_2022;

public class Santos {

	public static void main(String[] args) {
		
		String S="My Name is Santosh";
//		for(int i=S.length()-1; i>=0; i--) {
//			System.out.print(S.charAt(i));
//		}
		
		String S2[]=S.split(" ");
		for (int j=0; j<S2.length;j++) {
		String S3=S2[j];
		for (int i=S3.length()-1; i>=0;i--) {
			System.out.print(S3.charAt(i));
		}
		System.out.print(" ");
		}
		
	}
}
