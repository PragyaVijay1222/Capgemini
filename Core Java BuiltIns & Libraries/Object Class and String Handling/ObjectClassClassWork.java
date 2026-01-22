// 10/01/26
// Object

public class TenJanuary {
	int id;
	String name;
	
	public TenJanuary(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override 
	public boolean equals(Object obj) {
		TenJanuary ref =(TenJanuary) obj;
		return this.id == ref.id && this.name == ref.name;
	}
	
	public static void main(String[] args) {
		TenJanuary ref = new TenJanuary(1, "Mohit");
		System.out.println(ref.getClass().getName()+"@"+Integer.toHexString(ref.hashCode()));
		
		TenJanuary ref2 = new TenJanuary(1, "Rohit");
		TenJanuary ref3 = new TenJanuary(1, "Rohit");
		System.out.println(ref2.equals(ref3));
		
//		/////////////////////////////////////////////////////////
		
//		Overriding ToString
		
		P1 ref1 = new P1(1, "John");
      System.out.println(ref1);  //P1 [id=1, name=John]
      System.out.println(ref1.toString());  //P1 [id=1, name=John]
      System.out.println(ref1.hashCode());  //868693306
      System.out.println(Integer.toHexString(ref1.hashCode()));  //33c7353a

      System.out.println(ref1.getClass());  //class P1
      System.out.println(ref1.getClass().getName());  //P1

      System.out.println(ref1.getClass().getName()+"@"+Integer.toHexString(ref.hashCode()));  //P1@33c7353a
      
      
//      //////////////////////////////////////////////////////////
      
//      Overriding Equals
      
      P2 ref5 = new P2(1, "John");
      P2 ref4 = new P2(1, "John");

      System.out.println(ref5 == ref4);  //false
      //System.out.println(ref1.equals(ref2));  //false because default implementation compares reference
      System.out.println(ref5.equals(ref4));  //true because we have overridden equals() method
	}
}

class P1{
  int id;
  String name;

  public P1(int id, String name){
      this.id = id;
      this.name = name;
  }

  @Override
  public String toString() {
      return "P1 [id=" + id + ", name=" + name + "]";
  }  
}

class P2{
    int id;
    String name;

    public P2(int id, String name){
        this.id = id;
        this.name = name;
    } 
    
    @Override
    public boolean equals(Object obj) {
        P2 ref = (P2)obj;
        return this.id == ref.id && this.name == ref.name;
    }}
