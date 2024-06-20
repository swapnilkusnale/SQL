package polymorphisam;

public class MethodOverriding2 extends MethodOverriding1 { 
	
	
	public void method1() {
		
		System.out.println(" 8087938845");
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverriding1 m2 = new MethodOverriding2();
		m2.method1();
		
		m2.method2();
		
	}
	

}
