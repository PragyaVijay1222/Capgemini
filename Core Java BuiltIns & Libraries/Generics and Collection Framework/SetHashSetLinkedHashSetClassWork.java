// 16/01/26
// HashSet, LinkedHashSet


import java.util.Collections;
import java.util.ListIterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;
public class SixteenJanuary {
	
	public static void main(String[] args) {

//		////////////////////////////////////////////////////////////
		
		
//		HashSet
		
		Set hs = new HashSet();
		hs.add(10);
		hs.add(12);
		hs.add(null);
		hs.add('a');
		hs.add(true);
		hs.add(10);
		hs.add("LPU");
		hs.add('a');
		hs.add(null);
		System.out.println(hs);
		System.out.println("----");
		for(Object obj : hs) {
			System.out.println(obj);
		}
		System.out.println("----");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// LikedHashSet
		
		Set hs = new LinkedHashSet();
		hs.add(10);
		hs.add(12);
		hs.add(null);
		hs.add('a');
		hs.add(true);
		hs.add(10);
		hs.add("LPU");
		hs.add('a');
		hs.add(null);
		System.out.println(hs);
		System.out.println("----");
		for(Object obj : hs) {
			System.out.println(obj);
		}
		System.out.println("----");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(12);
		arr.add(13);
		arr.add(12);
		arr.add(14);
		arr.add(14);
		arr.add(null);
		arr.add(15);
		arr.add(11);
		arr.add(10);
		arr.add(16);
		arr.add(null);
		arr.add(10);
		System.out.println("Arr: "+arr);
		
		Set<Integer> set = new LinkedHashSet<>();
		for(Integer i : arr) {
			set.add(i);
		}
		System.out.println("Arr with unique values: "+set);
		
	}
}

