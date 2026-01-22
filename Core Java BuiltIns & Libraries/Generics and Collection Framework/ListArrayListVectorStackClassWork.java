// 14/1/26

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Stack;
public class FourteenJanuary {
	public static void main(String[] args) {
		
		// ArrayList
		
		int[] arr = {1,2,3,4,5,6};
		ArrayList<Integer> list = new ArrayList<>(); // Mutable
		for(int i:arr) {
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8); // Immutable
		
		String[] s = {"Mridul", "Girish", "Pawan", "Balaji", "Murli"};
		List<String> slist = new ArrayList<>();
		for(String str : s) {
			slist.add(str);
		}
		System.out.println(slist);
		System.out.println("Index of Pawan: "+slist.indexOf("Pawan"));
		System.out.println("Removing Pawan: "+slist.remove("Pawan"));
		System.out.println("New list: "+ slist);
		
		int[] a = {10,21,23,25,26,28,21,24,25,26};
		List<Integer> li = new ArrayList<>();
		for(int i : a) {
			li.add(i);
		}
		
		System.out.println("Before removing: "+li);
		
		for(Integer i : li) { Will give exception: java.util.ConcurrentModificationException, hence we use iterator
			if(i%2!=0) {
				li.remove(li.indexOf(i));
			}
		}
		
		for(int i=0; i<li.size(); i++) {
			if(li.get(i) %2 !=0) {
				li.remove(i);
				i--; // As array-list is dynamic in nature so each removal will shrink the list. To avoid missing any data, we do i--.
			}
		}
		
		for(char i = 'a'; i<'z'; i++) {
			
		}
		
		System.out.println("After removing: "+li);
		
		// Iterator
		
		
		int[] b = {10,21,23,25,26};
		List<Integer> l = new ArrayList<>();
		for(int i : b) {
			l.add(i);
		}
		
		Iterator<Integer> itr = l.iterator();
		
		while(itr.hasNext()) {
			System.out.println(l);
			itr.next();
			itr.remove();
		}
		
		// ListIterator
		
		ListIterator<Integer> ltr = l.listIterator();
		
		while(ltr.hasNext()) {
			ltr.next();
		}
		
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
		String[] name = {"Suraj", "Mridul", "Kabir", "Girish"};
		List<String> list = new ArrayList<>();
		for(String str: name) {
			list.add(str);
		}
		
		ListIterator<String> ltr = list.listIterator();
		
		while(ltr.hasNext()) {
			ltr.next();
		}
		
		while(ltr.hasPrevious()) {
			System.out.println(list);
			ltr.previous();
			ltr.remove();
		}
		
		ArrayList<Account> accounts = new ArrayList<>();
		SavingsAccount saa = new SavingsAccount(101, "Amit", 100000);
		accounts.add(saa);
		CurrentAccount cur = new CurrentAccount(102, "Rohit", 1000);
		accounts.add(cur);
		SavingsAccount saa1 = new SavingsAccount(103, "Mohit", 20000);
		accounts.add(saa1);
		CurrentAccount curr2 = new CurrentAccount(104, "Manit", 3000);
		accounts.add(curr2);
		
		for(Account acc : accounts) {
			if(acc.getAccountNo()==103) {
				accounts.remove(acc);
			}
		}
		
		// Vector
		
		List<String> v =  new Vector<>();
		v.add("Suraj");
		v.add("mridul");
		v.add("kabir");
		v.add("girish");
		System.out.println(v);
		System.out.println(v.size());
		
		for(int i = 0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("-----");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	//	Stack
		
		Stack<Integer> st = new Stack<Integer>();
		
		System.out.println(st.empty());
//		System.out.println(st.peek()); EmptyStackException
//		System.out.println(st.pop()); EmptyStackException
		
		System.out.println(st.push(10));
		st.push(14);
		st.push(16);
		st.push(12);
		st.push(13);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.empty());
		
		//Valid Parentheses
		
		Stack<Character> stack = new Stack<>();
		
		String str = "()[]{}";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[') {
				stack.push(str.charAt(i));
			}else if(str.charAt(i)==')' && !stack.empty() && stack.peek()=='(') {
				stack.pop();
			}
			else if(str.charAt(i)=='}' && !stack.empty() && stack.peek()=='{') {
				stack.pop();
			}
			else if(str.charAt(i)==']' && !stack.empty() && stack.peek()=='[') {
				stack.pop();
			}
		}
		
		if(stack.empty()) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}
}

interface BankOperations{
	public void deposit(int amount);
	public void withdraw(int amount);
	public int checkBalance();
}

abstract class Account{
	private int accountNo;
	private String name;
	private int balance;
	
	public Account(int no, String name, int balance) {
		this.setAccountNo(no);
		this.setName(name);
		this.setBalance(balance);
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class SavingsAccount extends Account implements BankOperations{
	
	public SavingsAccount(int no, String name, int balance) {
		super(no, name, balance);
	}
	
	@Override
	
	public void deposit(int amount) {
		int present = super.getBalance();
		super.setBalance(present + amount);
		System.out.println(amount+" is deposited in your Savings Account.");
	}
	
	@Override
	
	public void withdraw(int amount) {
		int present = super.getBalance();
		if(present-amount >=0) {
		super.setBalance(present-amount);
		System.out.println("Withdrawal successful from your Savings Account.");
		}else {
			System.out.println("Balance is lower than the asked amount");
		}
	}
	
	@Override
	
	public int checkBalance() {
		return super.getBalance();
	}
}

class CurrentAccount extends Account implements BankOperations{
	
	public CurrentAccount(int no, String name, int balance) {
		super(no, name, balance);
	}
	
	@Override
	
	public void deposit(int amount) {
		int present = super.getBalance();
		super.setBalance(present + amount);
		System.out.println(amount+" is deposited in your Current Account.");
	}
	
	@Override
	
	public void withdraw(int amount) {
		int present = super.getBalance();
		if(present-amount >=0) {
		super.setBalance(present-amount);
		System.out.println("Withdrawal successful from your Current Account.");
		}else {
			System.out.println("Balance is lower than the asked amount");
		}
	}
	
	@Override
	
	public int checkBalance() {
		return super.getBalance();
	}
}
