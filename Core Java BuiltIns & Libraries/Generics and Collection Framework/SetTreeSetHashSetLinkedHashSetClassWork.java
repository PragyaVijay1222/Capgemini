// 17-1-26
// Set question
// Tree Set

import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Collection;

public class SeventeenJanuary {
	public static void main(String[] args) {
		
		Set<String> ts = new TreeSet<>();
		ts.add("Kabir");
		ts.add("Nitish");
		ts.add("Aditya");
		ts.add("Animesh");
		ts.add("Pawan");
		ts.add("Devansh");
		ts.add("Balaji");
		System.out.println("Ascending Order: "+ts);
		TreeSet<String> dts = (TreeSet) ts;
		System.out.println("Descending Order: "+dts.descendingSet());

    ///////////////////////////////////////////////////////////////
	
		
	}
}
class implimentingSet{
			
	Integer[] arr;
	Set<Integer> set = new HashSet<>();
	
	public implimentingSet(Integer[] arr){
		this.arr = arr;
	}
	
	public void removeDuplicates() {
		for(Integer num : this.arr) {
			this.set.add(num);
		}
		System.out.println("After removing duplicates: "+this.set);
	}
	public void countUnique() {
		System.out.println("Number of unique values: "+this.set.size());
	}
	public void commonElements(int[] arr, int[] arr2) {
		Set<Integer> setArr = new HashSet<>();
		Set<Integer> setArr2 = new HashSet<>();
		
		for(int num: arr) {
			setArr.add(num);
		}
		for(int num: arr2) {
			setArr2.add(num);
		}
		System.out.print("Common elements in the two arrays are: ");
		for(Integer num : setArr) {
			if(setArr2.contains(num)) {
				System.out.print(num+" ");
			}
		}
		System.out.println();
	}
	public void checkInSet(Integer num) {
		if(this.set.contains(num)) {
			System.out.println("Yes, it's present.");
		}else {
			System.out.println("No, it's not present.");
		}
	}
	public void union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> union = Stream.concat(set1.stream(), set2.stream())
                .collect(Collectors.toSet());
		System.out.println("Union of the two given sets: "+union);
	}
	public void intersection(Set<Integer> set1, Set<Integer> set2) {
		set1.retainAll(set2);
		System.out.println("Intersection of the two given sets: "+set1);
	}
	public void difference(Set<Integer> set1, Set<Integer> set2) {
		set2.retainAll(set1);
		
		Iterator<Integer> itr = set1.iterator();
		
		while(itr.hasNext()) {
			if(set1.contains(itr.next())) {
				itr.remove();
			}
		}
		System.out.println("Difference: "+set1);
		
	}
	public void removeEven(Set<Integer> set){
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			if(itr.next()%2==0) {
				itr.remove();
			}
		}
		System.out.println("After removing all evens: "+set);
	}
	public void firstRepeat(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			if(set.contains(num)) {
				System.out.println("First repeat is: "+num);
				break;
			}else {
				set.add(num);
			}
		}
	}
	public void firstNonRepeating(String str) {
		
		Set<Character> set1 = new LinkedHashSet<>();
		Set<Character> set2 = new HashSet<>();
		for(int i=0; i<str.length(); i++) {
			if(set1.contains(str.charAt(i)) || set2.contains(str.charAt(i))) {
				set1.remove(str.charAt(i)) ;
			}else {
				set1.add(str.charAt(i));
			}
			set2.add(str.charAt(i));
		}
		Iterator<Character> itr = set1.iterator();
		System.out.println("First non repeating character is: "+itr.next());
		
	}
}
