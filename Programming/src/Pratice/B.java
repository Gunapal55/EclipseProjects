package Pratice;

public class B extends A {
public void show(){
	super.show();
	System.out.println("Hello");
	
}

public static void main(String[] args) {
	
	
	A ob = new B();

	ob.show();
	
	
}


}
