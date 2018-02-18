package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * it maintains insertion order
 * manipulation is fast because it doesnot requires any shifting of elements
 * duplications are allowed
 * it extends AbstractSequentialList and implements Deque ,so it can act as list,stack or queue
 */

public class Linkedlist {
	
	

	public static void main(String args[]) {
		LinkedList<String> li = new LinkedList<>();
		li.add("first");
		li.add("second");
		System.out.println(li);
		li.addLast("last");
		System.out.println(li);
		li.addFirst("head");
		System.out.println(li);
		String first = li.getFirst();
		System.out.println("first->" + first);
		String last = li.getLast();
		System.out.println("last->"+last);
		System.out.println("is list has second->"+li.contains("second"));
		Iterator<String> i = li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Object lic = li.clone();
		LinkedList<String> li2 = (LinkedList<String>)lic;
		li2.addAll(li);
		li.add(1,"added");
		System.out.println("linked contains all elements:" +li2.containsAll(li));
		System.out.println(li2);
		String[] str = new String[li2.size()];
		str = li2.toArray(str);
		System.out.println(Arrays.toString(str));
		
		List<String> sub = li2.subList(5, 7);
		System.out.println(sub);
		
		Iterator<String> l2 = li2.descendingIterator();
		String remove = li2.remove();
		System.out.println(remove);
	}
}
