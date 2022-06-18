package feb_22_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Example_Practice {

	public static List<String> display(String s) {
		List<String> list1 = new ArrayList();
		list1.add("abf");
		list1.add("abbpf");
		list1.add("abbff");
		list1.add("abbfbf");
		for (int i = list1.size() - 1; i >= 0; i--) {
			if (list1.get(i).startsWith(s)) {
				list1.remove(list1.get(i));
			}
		}
		return list1;
	}

	public static void main(String[] args) {
		Map<String, List<Character>> Object1 = new HashMap<>();
		List<Character> Object2 = new ArrayList<Character>();
		Object2.add('A');
		Object2.add('B');
		Object2.add('C');
		Object2.add('D');
		System.out.println(Object2);
		Object1.put("FirstName", Object2);
		System.out.println(Object1);
		Object2.add('E');
		Object2.add('F');
		Object2.add('G');
		Object2.add('H');
		System.out.println(Object2);
		Object1.put("LastName", Object2);
		System.out.println(Object1);
		Object1.remove("FirstName");
		System.out.println(Object1);
//		for(Entry<String, List<Character>> obje:Object1.entrySet() ) {
//			String ke=obje.getKey();
//			System.out.println(ke +" = " +Object1.get(ke));
//		}
//		
//		for (Entry<String, List<Character>> Object3 : Object1.entrySet()) {
//			String key = Object3.getKey();
//			System.out.println(key + " = " + Object1.get(key));
//		}
//		Set<Integer> set = new HashSet();
//		Set<Integer> set1 = new TreeSet();
//		set.add(5);
//		set.add(0);
//		set.add(16);
//		set.add(8);
//		set.add(15);
//		set.add(9);
//		set.add(9);
//		set1.add(88);
//		set1.add(155);
//		set1.add(99);
//		set1.add(94);
//		Iterator m=set1.iterator();
//		while(m.hasNext()) {
//			System.out.print(m.next() +" ");
//		}
//		System.out.println();
//		Iterator s=set.iterator();
//		while (s.hasNext()) {
//			System.out.print(s.next() + " ");
//		}
//		System.out.println();
//		for(Integer f:set) {
//			System.out.print(f +" ");
//		}

//		Map<String, Integer> Object = new HashMap();
//		Map<String, Integer> Object1 = new TreeMap();
//		Object.put("Santosh", 225);
//		Object.put("Mayuri", 10);
//		Object.put("Megha1", 15);
//		System.out.println(Object);
//		System.out.println(Object.containsKey("Santosh"));
//		System.out.println(Object.containsValue(15));
//		System.out.println(Object.get("Santosh"));
//		Object1.put("Santosh", 5);
//		Object1.put("Mayuri", 10);
//		Object1.put("Megha", 15);
//		Object1.put("Shubhangi", 25);
//		System.out.println(Object1);
//		Object1.putAll(Object);
//		System.out.println(Object1);
//		Object1.remove("Santosh");
//		System.out.println(Object1.remove("Santosh"));
//		System.out.println(Object1);
//		Object1.clear();
//		System.out.println(Object1);

//		System.out.println(display("abb"));

//
//		for (int i = 0; i < 4; i++) {
//			for (int j=3; j>i; j--) {
//				System.out.print(" ");
//			}
//			for (int k=0; k<=i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}

		int d[] = new int[5];
//		d[0]=5;
//		d[1]=1;
//		d[2]=125;
//		d[3]=85;
//		d[4]=155;

//		for(int i=0; i<d.length;i++) {
//		System.out.print(+d[i] +" ");
//		}
//		System.out.println();
//		
//		char a[]= {'a', 'w', 'r', 'a', 't', 'w', 'A', 'g' };
//		
//		for(int i=0; i<a.length;i++ ) {
//			for(int j=0; j!=i; j++) {
//				if(a[i]==a[j]) {
//					System.out.println(a[i]);
//				}
//			}
//		}

//		char a[] = { 'a', 'a', 'w', 'w', 'w', 't', 'w', 'f', 'A', 'g' };
//		for (int i = 0; i < a.length - 1; i++) {
//
//			if (a[i] == a[i + 1]) {
//				System.out.println(a[i]);
//			}
//		}

//		char a[] = { '1', 'a', '5', 'w', '9', 't', 'w', 'f', 'A', 'g' };
//		for (int i = 0; i < a.length - 1; i++) {
//			if (!Character.isAlphabetic(a[i])) {
//				System.out.print(a[i] +" ");
//			}
//		}

//		int a[] = { 25, 9, 98, 2, 25, 99, 999, 25, 1, 35 };
//		int p;
//		for (int i = 0; i < a.length; i++) {
//			p=0;
//			for (int j=0; j<a.length;j++) {
//				if (a[i]<a[j]) {
//					p=p+1;
//				}
//				if (p==a.length-1) {
//					System.out.println(a[i]);
//				}
//			}
//					
//		}

//		int a[] = { 12, 25, 1, 3, 26, 99 };
//		int c;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if (a[i] < a[j]) {
//					c = a[i];
//					a[i] = a[j];
//					a[j] = c;
//				}
//
//			}
//
//		}
//		for (int k = 0; k < a.length; k++) {
//			System.out.print(a[k] + " ");
//		}

	}
}
