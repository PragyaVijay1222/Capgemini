// 16/01/26
// LinkedList, PriorityQueue

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;

public class SixteenJanuary {
	
	public static void main(String[] args) {
//		LinkedList 
		
		List<Integer> list = new LinkedList<>();
		
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
		ListIterator<Integer> li = list.listIterator();
		
		System.out.println("Forward");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Backward");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
//		////////////////////////////////////////////////////////////
		Train train = new Train();
		train.trainMethods();
		
//      Priority Queue
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(10);
		pq.offer(15);
		pq.offer(26);
		pq.offer(7);
		pq.offer(13);
		pq.offer(10);
		pq.offer(14);
//		pq.offer(null); NullPointerException
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
//		//////////////////////////////////////////////////////////////
		Task tsk1 = new Task("Task1", 2);
		Task tsk2 = new Task("Task2", 5);
		Task tsk3 = new Task("Task3", 1);
		Task tsk4 = new Task("Task4", 7);
		Task tsk5 = new Task("Task5", 3);
		
		Task.scheduling(tsk1);
		Task.scheduling(tsk2);
		Task.scheduling(tsk3);
		Task.scheduling(tsk4);
		Task.scheduling(tsk5);
		
		Task.display();
		
// ///////////////////////////////////////////////////////////////////
		

// LinkedList Question
class Train{
	public void trainMethods(){
		
		List<Integer> list = new LinkedList<>();
		
		for(int i=101; i<107; i++) {
			list.add(i);
		}
		System.out.println("Initial list: "+list);
		
		list.add(2, 999);
		System.out.println("List after adding 999: "+list);
		ListIterator<Integer> li = list.listIterator();
		
		while(li.hasNext()) {
			if(li.next()%2==0) {
				li.remove();
			}
		}
		System.out.println("List after removing even compartments: "+list);
		Collections.reverse(list);
		System.out.println("List after reversing it: "+list);
		if(list.contains(105)) {
			System.out.println("Index of 105: "+list.indexOf(105));
		}else {
			System.out.println("Compartment not found");
		}
	}
}

// Priority Queue

class Task{
	private String name;
	private Integer priority;
	private static PriorityQueue<Task> schedual = new PriorityQueue<>((a, b) -> a.priority.compareTo(b.priority));
	
	public Task(String name, Integer priority) {
		this.priority = priority;
		this.name = name;
	}
	
	public static void scheduling(Task tsk) {
		schedual.offer(tsk);
	}
	
	public static void display() {
		System.out.println(schedual);
	}
	@Override 
	public String toString() {
		return name + " (priority=" + priority + ")";
	}
}
