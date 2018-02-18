package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
 * insertion order is not maintain
 * duplication of elements are not allowed
 * it can has atmost one null value
 * order of elements is dependent of implementation class
 * hashSet -> no insertion order
 * LinkedHashSet -> insertion order is maintained
 * TreeSet -> elements are ordered in ascendding order, if comparator reference is not passed
 */
public class HashSetExample {
	
	public static void main(String args[]) {
		Set<String> set = new HashSet<>();
		System.out.println(set.add("vendi"));
		System.out.println(set.add("kanna"));
		System.out.println(set.add("darling"));
		set.add("vandu");
		set.add("sweety");
		System.out.println("first null added:"+set.add(null));
		System.out.println("second null is added;"+set.add(null));
		set.add(null);
		
		System.out.println(set);
		
		Set<String> second_set = new HashSet<>();
		System.out.println(second_set.addAll(set));
		System.out.println(second_set.size());
		System.out.println("contains kanna:"+ set.contains("kanna"));
		
		String[] names = new String[set.size()];
		names = set.toArray(names);
		System.out.println("THe array representation of set:" + Arrays.toString(names));
		
		set.stream().forEach(System.out :: println);
	}

}

