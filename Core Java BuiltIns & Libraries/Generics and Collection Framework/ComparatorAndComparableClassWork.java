// 19-1-26
// Comparable and comparator

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NineteenJanuary {
	public static void main(String[] args) {
		List<Students> std = new ArrayList<>();
		std.add(new Students(2, "Abc", 98.6));
		std.add(new Students(3, "Bcd", 45.9));
		std.add(new Students(1, "Cde", 35.7));
		std.add(new Students(5, "Def", 87.8));
		std.add(new Students(4, "Efg", 81.2));
		std.add(new Students(7, "Fgh", 99.9));
		std.add(new Students(6, "Ghi", 94.6));
		
		System.out.println("Before sorting: "+std);
		Collections.sort(std);
		System.out.println("After sorting: "+std);
		String a = "Hello";
		a = a+"World";
		System.out.println(a);
		System.out.println("\n--Sorted by name--");
		Collections.sort(std,new SortByNames());
		for (Students s : std) {
			System.out.println(s);
		}
		
		System.out.println("\n--Sorted by marks--");
		Collections.sort(std, new SortByMarks());
		for (Students s : std) {
			System.out.println(s);
		}
		
		List<OnlineOrder> orders = new ArrayList<>();
		
		orders.add(new OnlineOrder(2, "Abc", 45.90, 7, 600));
		orders.add(new OnlineOrder(1, "Dbc", 100.10, 9, 10));
		orders.add(new OnlineOrder(4, "Ebc", 455.80, 4, 1000));
		orders.add(new OnlineOrder(3, "Lbc", 445.60, 1, 60));
		orders.add(new OnlineOrder(6, "Ubc", 57.20, 6, 90));
		orders.add(new OnlineOrder(5, "Ebc", 458.10, 2, 700));
		
		Collections.sort(orders, new OnlineOrderComparator());
		
		System.out.println("After sorting: ");
		for(OnlineOrder oo : orders) {
			System.out.println(oo);
		}
		
	}
}
class Students implements Comparable<Students>{
	int id;
	String name;
	double marks;
	
	public Students(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "["+this.id+", "+this.name+", "+this.marks+"]";
	}
	@Override
	public int compareTo(Students s) {
		return this.id - s.id;
	}
	
}
class SortByNames implements Comparator<Students>{

	@Override
	public int compare(Students s1, Students s2) {
		return s1.name.compareTo(s2.name);
	}
}

class SortByMarks implements Comparator<Students>{

	@Override
	public int compare(Students s1, Students s2) {
		return Double.compare(s1.marks, s2.marks);
	}
	
}

class OnlineOrder{
	int orderId;
	String customerName;
	double orderAmount;
	int itemCount;
	long orderTime;
	
	public OnlineOrder(int id, String name, double amount, int count, long time){
		this.orderId = id;
		this.customerName = name;
		this.orderAmount = amount;
		this.itemCount = count;
		this.orderTime = time;
	}
	@Override
	public String toString() {
		return this.orderId+" "+this.customerName+" "+this.orderAmount+" "+ this.itemCount+ " "+this.orderTime;
	}
}

class SortByAmount implements Comparator<OnlineOrder>{
	@Override
	
	public int compare(OnlineOrder o1, OnlineOrder o2) {
		return Double.compare(o1.orderAmount, o2.orderAmount);
	}
}
class SortByCount implements Comparator<OnlineOrder>{
	@Override
	
	public int compare(OnlineOrder o1, OnlineOrder o2) {
		return Integer.compare(o1.itemCount, o2.itemCount);
	}
}

class SortByOrderTime implements Comparator<OnlineOrder>{
	@Override
	
	public int compare(OnlineOrder o1, OnlineOrder o2) {
		return Long.compare(o1.orderTime, o2.orderTime);
	}
}

class SortByCustomerName implements Comparator<OnlineOrder>{
	@Override
	
	public int compare(OnlineOrder o1, OnlineOrder o2) {
		return o1.customerName.compareTo(o2.customerName);
	}
}

class SortByOrderID implements Comparator<OnlineOrder>{
	@Override
	
	public int compare(OnlineOrder o1, OnlineOrder o2) {
		return Integer.compare(o1.orderId, o2.orderId);
	}
}

class OnlineOrderComparator implements Comparator<OnlineOrder> {

    @Override
    public int compare(OnlineOrder o1, OnlineOrder o2) {

        int res = Double.compare(o2.orderAmount, o1.orderAmount);
        if (res != 0) return res;

        res = Integer.compare(o1.itemCount, o2.itemCount);
        if (res != 0) return res;

        res = Long.compare(o1.orderTime, o2.orderTime);
        if (res != 0) return res;

        res = o1.customerName.compareTo(o2.customerName);
        if (res != 0) return res;

        return Integer.compare(o1.orderId, o2.orderId);
    }
}

