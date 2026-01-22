// 22-01-26
// Pattern and Matcher


import java.util.regex.*;

public class TwentyTwoJanuary {
	public static void main(String[] args) {
		regexDemo.method();
	}
}
class regexDemo{
	public static void method() {
		String text = "Java 123 and 456 released on 12-05-2024";
		
		Pattern pattern = Pattern.compile("(\\d+)");
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.start());
			System.out.println(matcher.end());
			System.out.println("------------------------");
			
		}
		
	}
}
