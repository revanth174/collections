package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
 * it maintains insertion order
 * it is not syncronized
 * can access elements by index
 * duplications are allowed
 * manipulation is slow because it requires lot of shifting 
 * 
 */
public class Arraylist {
	
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();
		al.add("revanth");
		al.add("venki");
		al.add("venkat");
		al.add(2,"kanna");
		al.set(3, "repalce");
		ArrayList<String> a = new ArrayList<>();
		a.add("darling");
		a.add("baby");
		al.addAll(a);
		// default capacity of arraylist is 10 and every time we try to add elements which exceds the capacity ,the arraylist
		// increase its capacity 50%
	
		String s[] = new String[3];
		
		System.out.println(s.length);
		s = al.toArray(s);
		System.out.println(s.length);
		Iterator i = al.iterator();
		/*while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String str : al) {
			System.out.println(str);
		}*/
		
		String name = "kanna";
		System.out.println(al.contains(name));
		int index = al.indexOf("kanna");
		al.remove(index);
		System.out.println(al);
		
		List<String> list = new ArrayList<>();
		
		
	}

}
