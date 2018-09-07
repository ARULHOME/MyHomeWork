package homework;

public class ClassA {


		final int a=20;
		static float f=0.054f;
		String s="name";
		
		
		
		
		public final void ranji1() {
			System.out.println("tv");
		}
		
		//overloading menthods
		
		public  static void method2() {
			System.out.println("lg tv");
		}
		
		public void method2(int a) {
			System.out.println("samsung tv");
		}
		
		
		public void method2(String name) {
			
		this.method2();
		this.yamini();
			System.out.println("lg tv");
		}
		
		public static void goinghome() {
			
			System.out.println("tomorrow");
		}
		
		
		public void method2(int a, float f) {
			System.out.println("lg tv");
		}
		private static int yamini() {
			int a =50;
			
			System.out.println(a);
			System.out.println("samsung tv");
		    return 3;
		
		}
		

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		/*obj.a=40;
		obj.f=0.033f;
		obj.s="ranji";*/
		
		
		
		System.out.println(obj.a);
		System.out.println(f);
		obj.ranji1();
		obj.method2();
		yamini();	

		}

	


	}


