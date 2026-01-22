// 21/01/26
// Regular Expression


public class TwentyOneJanuary {
	public static void main(String[] args) {
		System.out.println(".");
		Dot.method();
		System.out.println("--------------------");
		System.out.println("+");
		Plus.method();
		System.out.println("--------------------");
		System.out.println("*");
		Asterisk.method();
		System.out.println("--------------------");
		System.out.println("?");
		QuestionMark.method();
		
		///////////////////////////////////////////////////////////
		System.out.println("----------------------------------");
		System.out.println("SSSSjjjj".matches("S*j*"));
		System.out.println("SSSSjjjj".matches("S{4}j{4}"));
		System.out.println("SurajSurajSuraj".matches("(Suraj)*"));
		System.out.println("SurajSurajSuraj".matches("(Suraj){3}"));
		
		System.out.println("ditya".matches("A*d*i*t*y*a*"));
		System.out.println("1234".matches(".*"));  //Anything is fine 
		
		System.out.println("--------------------");
		System.out.println("\\d");
		Digits.method();
		
		System.out.println("--------------------");
		System.out.println("\\w");
		Characters.method();
		
		System.out.println("--------------------");
		System.out.println("\\s");
		WhiteSpace.method();
		
//		System.out.println("Hello 8".matches(".*\\s{1}.*"));
		
		System.out.println("--------------------");
		System.out.println("[A-Z]");
		UpperCase.method();
		
		System.out.println("--------------------");
		System.out.println("[a-z]");
		LowerCase.method();
		
		System.out.println("--------------------");
		System.out.println("abc");
		Sequence.method();
		
		System.out.println("--------------------");
		System.out.println("{n}");
		Count.method();
		
		System.out.println("--------------------");
		System.out.println("{n,m}");
		Range.method();
		
		System.out.println("--------------------");
		System.out.println("|");
		Or.method();
		
//		//////////////////////////////////////////////////////////////////////
		System.out.println("------------------------------------------------------");
		
		System.out.println("123".matches("\\d+")); 
		System.out.println("9".matches("\\d+"));   
		System.out.println("".matches("\\d+"));    
		
		System.out.println("------------------------------------------------------");
		System.out.println("".matches("\\d*"));    
		System.out.println("123".matches("\\d*")); 
		System.out.println("a12".matches("\\d*")); 
		
		System.out.println("------------------------------------------------------");
		System.out.println("ABC".matches("[A-Z]+"));
		System.out.println("A".matches("[A-Z]+"));   
		System.out.println("AbC".matches("[A-Z]+")); 
		
		System.out.println("------------------------------------------------------");
		System.out.println("".matches("[A-Z]*"));    
		System.out.println("XYZ".matches("[A-Z]*")); 
		System.out.println("XyZ".matches("[A-Z]*")); 
		
		System.out.println("------------------------------------------------------");
		System.out.println("abc".matches("[a-z]+")); 
		System.out.println("a".matches("[a-z]+"));   
		System.out.println("aBc".matches("[a-z]+")); 
		
		System.out.println("------------------------------------------------------");
		System.out.println("".matches("[a-z]*"));    
		System.out.println("xyz".matches("[a-z]*")); 
		System.out.println("xYz".matches("[a-z]*")); 
		
		System.out.println("------------------------------------------------------");
		System.out.println("abcabc".matches("(abc)+")); 
		System.out.println("abc".matches("(abc)+"));   
		System.out.println("ababc".matches("(abc)+"));  
		
		System.out.println("------------------------------------------------------");
		System.out.println("".matches("(abc)*"));   
		System.out.println("abc".matches("(abc)*"));
		
		
//		//////////////////////////////////////////////////////////////////////////////
		
		System.out.println("-------------------");
		System.out.println("Anchors");  
		Anchors.method();
		
		////////////////////////////////////////////////////////////////////
		
		System.out.println("1--------------------------------------------------------------------------");
		System.out.println("abc".matches("^abc$"));
		System.out.println("xabc".matches("^abc$"));
		System.out.println("abcx".matches("^abc$"));
		System.out.println("xabcx".matches("^abc$"));
		
		System.out.println("2--------------------------------------------------------------------------");
		System.out.println("12345".matches("^\\d+$"));
		System.out.println("123a".matches("^\\d+$"));
		System.out.println("12 3".matches("^\\d+$"));
		
		System.out.println("3--------------------------------------------------------------------------");
		System.out.println("color".matches("^colo?r$"));
		System.out.println("colr".matches("^colo?r$"));
		System.out.println("coloor".matches("^colo?r$"));
		
		System.out.println("4--------------------------------------------------------------------------");
		System.out.println("100".matches("\\d\\d?\\d"));
		System.out.println("10".matches("\\d\\d?\\d"));
		System.out.println("1".matches("\\d\\d?\\d"));
		
		System.out.println("5--------------------------------------------------------------------------");
		System.out.println("abc123".matches("\\w+"));
		System.out.println("A_B9".matches("\\w+"));
		System.out.println("abc-123".matches("\\w+"));
		
		System.out.println("6--------------------------------------------------------------------------");
		System.out.println("".matches("\\w"));
		System.out.println("Test_01".matches("\\w*"));
		System.out.println("Test 01".matches("\\w*"));
		
		System.out.println("7--------------------------------------------------------------------------");
		System.out.println("User_123".matches("^\\w+$"));
		System.out.println("User-123".matches("^\\w+$"));
		System.out.println("User 123".matches("^\\w+$"));
		
		System.out.println("8--------------------------------------------------------------------------");
		System.out.println("abc_123".matches("\\w+")); 
		System.out.println("abc_123".matches("[A-Za-z0-9_]+")); 
		
		System.out.println("9--------------------------------------------------------------------------");
		System.out.println("   ".matches("\\s+"));
		System.out.println("\t\t".matches("\\s+"));
		System.out.println(" ".matches("\\s+"));
		System.out.println(" a ".matches("\\s+"));
		
		System.out.println("10--------------------------------------------------------------------------");
		System.out.println("".matches("\\s*"));
		System.out.println("   ".matches("\\s*"));
		System.out.println(" a ".matches("\\s*"));
			
		System.out.println("11--------------------------------------------------------------------------");
		System.out.println("   ".matches("^\\s+$"));
		System.out.println(" \t ".matches("^\\s+$"));
		System.out.println(" a ".matches("^\\s+$"));
		
		System.out.println("12--------------------------------------------------------------------------");
		System.out.println("1234".matches("\\d{4}"));
		System.out.println("123".matches("\\d{4}"));
		System.out.println("12345".matches("\\d{4}"));
		
		System.out.println("13--------------------------------------------------------------------------");
		System.out.println("ABC".matches("[A-Z]{3}"));
		System.out.println("AB".matches("[A-Z]{3}"));
		System.out.println("ABCD".matches("[A-Z]{3}"));
		
		System.out.println("14--------------------------------------------------------------------------");
		System.out.println("abcabc".matches("(abc){2}"));
		System.out.println("abc".matches("(abc){2}"));
		
		System.out.println("15--------------------------------------------------------------------------");
		System.out.println("9999".matches("^\\d{4}$"));
		System.out.println("99a9".matches("^\\d{4}$"));
		System.out.println("999".matches("^\\d{4}$"));	
		
		System.out.println("16--------------------------------------------------------------------------");
		System.out.println("123".matches("\\d{3,5}"));
		System.out.println("12345".matches("\\d{3,5}"));
		System.out.println("12".matches("\\d{3,5}"));
		System.out.println("123456".matches("\\d{3,5}"));
		
		System.out.println("ABCD".matches("[A-Z]{2,5}"));
		System.out.println("AB".matches("[A-Z]{2,5}"));
		System.out.println("ABCDE".matches("[A-Z]{2,5}"));
		System.out.println("A".matches("[A-Z]{2,5}"));
		
		System.out.println("17--------------------------------------------------------------------------");
		System.out.println("abcabc".matches("(abc){2,3}"));
		System.out.println("abcabcabc".matches("(abc){2,3}"));
		System.out.println("abc".matches("(abc){2,3}"));
		
		System.out.println("18--------------------------------------------------------------------------");
		System.out.println("9876543210".matches("^[6-9]\\d{9,10}$"));
		System.out.println("987654321".matches("^[6-9]\\d{9,10}$"));	
		
		System.out.println("19--------------------------------------------------------------------------");
		System.out.println("cat".matches("^(cat|dog)$"));
		System.out.println("dog".matches("^(cat|dog)$"));
		System.out.println("catdog".matches("^(cat|dog)$"));
		
		System.out.println("20--------------------------------------------------------------------------");
		System.out.println("A".matches("[A-Z]|[a-z]"));
		System.out.println("a".matches("[A-Z]|[a-z]"));
		System.out.println("1".matches("[A-Z]|[a-z]"));
		
		System.out.println("21--------------------------------------------------------------------------");
		System.out.println("123".matches("\\d+|[A-Z]+"));
		System.out.println("ABC".matches("\\d+|[A-Z]+"));
		System.out.println("A1".matches("\\d+|[A-Z]+"));
		
		System.out.println("22--------------------------------------------------------------------------");
		System.out.println("Mr".matches("(Mr|Mrs|Ms)"));
		System.out.println("Mrs".matches("(Mr|Mrs|Ms)"));
		System.out.println("Ms".matches("(Mr|Mrs|Ms)"));
		System.out.println("Dr".matches("(Mr|Mrs|Ms)"));
		
		System.out.println("23--------------------------------------------------------------------------");
		System.out.println("UPI".matches("^(UPI|CASH|CARD)$"));
		System.out.println("NET".matches("^(UPI|CASH|CARD)$"));
		
		System.out.println("regular expression to validate a mobile number starting with 6, 7, 8, or 9");
		System.out.println("7890123456".matches("^[6-9]\\d{9}"));
		
		System.out.println("regular expression to validate an email ID");
		System.out.println("pragyavijay20318@gmail.com".matches("(\\w+)@(\\w+\\.\\w+)"));
		
		System.out.println("regular expression to validate a password");
		System.out.println("Apple26".matches(".*[A-Z].*\\d.*"));
		
		System.out.println("regular expression to validate a username");
		System.out.println("abcsd234_hj".matches("^[A-Z]|[a-z]\\w{4,14}"));
		
		System.out.println("OTP and PIN Code Validation");
		System.out.println("675432".matches("\\d{6}"));
		System.out.println("5463".matches("\\d{4}"));
		
		System.out.println("regular expression to validate an Indian vehicle number");
		System.out.println("MH12AB1234".matches("[A-Z]{2}\\d{2}[A-Z]*\\d{4}"));
		
		System.out.println("regular expression to validate a date in the format: dd-mm-yyyy");
		System.out.println("12-01-2026".matches("\\d{2}-\\d{2}-\\d{4}"));
	}
}

class Dot{
	public static void method() {
		System.out.println("Suraj".matches("S...j"));
		System.out.println("Suraj".matches("S..j"));
		System.out.println("Sraj".matches("S...j"));
		System.out.println("suraj".matches("S...j"));
		System.out.println("Siraj".matches("S...j"));
		System.out.println("Sairaj".matches("S...j"));
		System.out.println("S123j".matches("S...j"));
	}
}
class Plus{
	public static void method() {
		System.out.println("Sabcj".matches("S+j"));
		System.out.println("Sxxj".matches("S+j"));
		System.out.println("Sj".matches("S+j"));
		System.out.println("SSj".matches("S+j"));
		System.out.println("sSaj".matches("S+j"));
		System.out.println("Sjj".matches("S+j"));
		System.out.println("SSSj".matches("S+j"));
	}
}
class Asterisk{
	public static void method() {
		System.out.println("j".matches("S*j"));
		System.out.println("Sj".matches("S*j"));
		System.out.println("SSj".matches("S*j"));
		System.out.println("SSSj".matches("S*j"));
		System.out.println("Sabcj".matches("S*j"));
		System.out.println("sSj".matches("S*j"));
		System.out.println("jj".matches("S*j"));
	}
}
class QuestionMark{
	public static void method() {
		System.out.println("colr".matches("colo?r"));
		System.out.println("color".matches("colo?r"));
		System.out.println("coloor".matches("colo?r"));
		System.out.println("abc".matches("ab(c)?"));
		System.out.println("ab".matches("ab(c)?"));
		System.out.println("abcd".matches("ab(c)?"));
	}
}
class Digits{
	public static void method() {
		System.out.println("5".matches("\\d"));
		System.out.println("0".matches("\\d"));
		System.out.println("9".matches("\\d"));
		System.out.println("12".matches("\\d")); //false
		System.out.println("a".matches("\\d"));
		System.out.println(" ".matches("\\d"));
	}
}
class Characters{
	public static void method() {
		System.out.println("a".matches("\\w"));
		System.out.println("z".matches("\\w"));
		System.out.println("5".matches("\\w"));
		System.out.println("_".matches("\\w"));
		System.out.println("@".matches("\\w"));
		System.out.println(" ".matches("\\w"));
	}
}
class WhiteSpace{
	public static void method() {
		System.out.println(" ".matches("\\s"));
		System.out.println("\t".matches("\\s"));
		System.out.println("\n".matches("\\s"));
		System.out.println("a".matches("\\s"));
		System.out.println("1".matches("\\s"));
	}
}
class UpperCase{
	public static void method() {
		System.out.println("A".matches("[A-Z]"));
		System.out.println("Z".matches("[A-Z]"));
		System.out.println("M".matches("[A-Z]"));
		System.out.println("a".matches("[A-Z]"));
		System.out.println("AA".matches("[A-Z]"));
		System.out.println("1".matches("[A-Z]"));
		System.out.println("@".matches("[A-Z]"));
	}
}
class LowerCase{
	public static void method() {
		System.out.println("a".matches("[a-z]"));
		System.out.println("z".matches("[a-z]"));
		System.out.println("m".matches("[a-z]"));
		System.out.println("A".matches("[a-z]"));
		System.out.println("aa".matches("[a-z]"));
		System.out.println("1".matches("[a-z]"));
		System.out.println("#".matches("[a-z]"));
	}
}
class Sequence{
	public static void method() {
		System.out.println("abc".matches("abc"));
		System.out.println("ab".matches("abc"));
		System.out.println("abcd".matches("abc"));
		System.out.println("aBc".matches("abc"));
		System.out.println("ABC".matches("abc"));
		System.out.println(" abc".matches("abc"));
		
	}
}
class Count{
	public static void method() {
		System.out.println("aaa".matches("a{3}"));
		System.out.println("aa".matches("a{3}"));
		System.out.println("aaaa".matches("a{3}"));
	}
}
class Range{
	public static void method() {
		System.out.println("aaa".matches("a{2,4}"));
		System.out.println("aa".matches("a{2,4}"));
		System.out.println("aaaa".matches("a{2,4}"));
		System.out.println("a".matches("a{2,4}"));
		System.out.println("aaaaa".matches("a{2,4}"));
	}
}
class Or{
	public static void method() {
		System.out.println("cat".matches("cat|dog"));
		System.out.println("dog".matches("cat|dog"));
		System.out.println("cow".matches("cat|dog"));
	}
}
class Anchors{
	public static void method() {
		System.out.println("Using ^");
		System.out.println("abc".matches("^abc"));
		System.out.println("abcx".matches("^abc"));
		System.out.println("xabc".matches("^abc"));
	}
}
