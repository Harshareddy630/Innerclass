
public class innerclassjava1 {
	private String str="Hello  Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(str+", start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {
		innerclassjava1 obj=new innerclassjava1();
		innerclassjava1.Inner in=obj.new Inner();  
		in.hello();  
	}


}
