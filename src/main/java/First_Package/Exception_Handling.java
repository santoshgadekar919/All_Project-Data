package First_Package;

import java.io.File;
import java.io.IOException;

public class Exception_Handling {

	public static void main(String[] args) {
		File f = new File("");
		try {
			System.out.println("Exception Occured");
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Handled");
			e.printStackTrace();
		}
		System.out.println("Hello");
		try {
			throw new userdefined_exception("Hello");
		} catch (userdefined_exception e) {
			
			System.out.println(e);
		}

	}

}

class userdefined_exception extends Exception {
	public userdefined_exception(String S) {
		
	}
}
