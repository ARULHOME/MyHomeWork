package week1.day2;


	public class ClassB extends ClassA {
		
		
		ClassB(){
			
			System.out.println("b class");
		}
		
		
		
		public static void main(String[] args) {
			ClassB vs = new ClassB();	
			vs.x=40;
			vs.f=0.954f;
			vs.S="ranji";
			
			vs.method1();
			vs.method4();
			vs.cameratype();
			vs.method();
			

		}
		

	}


