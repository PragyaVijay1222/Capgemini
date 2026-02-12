package main;
public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public boolean isEven(int n) {
		return n%2 ==0;
	}
	public int devide(int a, int b) {
		return a/b;
	}
	public Integer check(int a, int b) {
		if(a==b) return 0;
		else return null;
	}
}
