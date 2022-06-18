package feb_22_2022;

import java.util.ArrayList;
import java.util.Collections;

public class Puzzle_1 {
	public int a = 19;

	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList<String> list = new ArrayList(Collections.nCopies(1100, "HEAD"));
	
		for (int i = 2; i < 1100; i++) {
			for (int j = 0; j < list.size(); j++) {
				if ((j + 1) % i == 0) {
					list.set(j, "TAIL");

				}
			}
		}
		
		for (int k = 0; k < list.size(); k++) {
			int A = 0;
			if (list.get(k).contains("HEAD")) {
				A = A + 1;
				System.out.println("The total number of Heads after 1100 people take their turn is"+ "  " +A);
			}

		}

	}

}
