package set;

import java.util.LinkedHashSet;

/*
 * Insertion order is maintained
 * it contains unique elements
 */
public class LinkedHashSetExample {

	public static void main(String args[]) {
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("amano");
		set.add("koyila");
		System.out.println(set);
	}
}
