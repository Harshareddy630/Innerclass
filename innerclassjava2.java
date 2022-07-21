
public class innerclassjava2 {
	private String str="Inner Classes";

	 void display(){  
		 class Inner{  
			 void str(){
				 System.out.println(str);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.str();  
	 }  

	 
	public static void main(String[] args) {
		innerclassjava2  ob=new innerclassjava2 ();  
		ob.display();  
	}
}
