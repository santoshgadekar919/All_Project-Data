package First_Package;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections_Eg {

	public static void main(String[] args) {
		List <Integer> list=new ArrayList<Integer>();
		List <Integer> list1=new LinkedList<Integer>();
		list.add(15);
		list.add(26);
		list.add(6);
		list.add(98);
		list.add(97);
		System.out.println(list);
		list1.add(11);
		list1.add(36);
		list1.add(879);
		list1.add(23);
		list1.add(875);
		System.out.println(list1);
		
		list.addAll(list1);
		System.out.println(list);
		list.add(0, 9999);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		System.out.println(list.size());
		
		list.remove(0);
		
		System.out.println(list);
		
		list.removeAll(list1);
		System.out.println(list);
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		list2.add("Hello");
		list2.add("How");
		list2.add("are");
		list2.add("Hi1 ");
		System.out.println(list);
		for(int i=0;i<list2.size();i++) {
			if(list2.get(i).equals("Hello")) {
				list2.remove(list2.get(i));
			}
			System.out.println(list2.get(i));
		}
		
		List<String> list4=new ArrayList<String>();
		list4.add("abf");
		list4.add("abbpf");
		list4.add("abbff");
		list4.add("abbfbf");
		for(int i=list4.size()-1; i>=0;i--) {
			if(list4.get(i).startsWith("abb")) {
				list4.remove(list4.get(i));
			}
		}
		System.out.println(list4);

	}
}
