package week1.day2;

public class ClassA {
	public int x=10;
	public float f=0.025f;
	static String S="vasanth";
	protected double d=0.25;
	
	private int y=70;
	
	
	final public void method1() {
		
		System.out.println("mobilephone"); 
	}
	
	private void mobilemodel() {
		
		 String mobile="MI";
		
		
	}
	
	protected void cameratype() {
		System.out.println("12mp");
		
	}
	 
	 public boolean method4() {
		 
		 System.out.println("4g ensbled");
		 return false;
		 
	 }
	 
	 
	 public static int method() {
		 int x=20;
		 System.out.println(x);
		 
		 System.out.println("volte available");
		 
		 return 5;
	 }
	 
	 
	 
	protected  ClassA() {
			
		 System.out.println("defsult constructor");
	}
	 
	 public static void main(String[] args) {
		
		 ClassA sx = new ClassA();
		 
		sx.method1();
		method();
		sx.method4();
		sx.cameratype();
		sx.method();
	
	
		 
	}
}


