package homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassC extends ClassA {
		
		
		

		public void cricket() {
			
			super.method2();
			super.method2(7);
		
		}
		
		
		public static void goinghome() {
			
			System.out.println("day after tomorrow");
		}
		
		public static void method2() {
			
			System.out.println("VU Tv");
			
		}
		

		public static void main(String[] args) {
			
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver ch=new ChromeDriver();
			
			ch.get("https://www.google.com/");
			
			// TODO Auto-generated method stub
			ClassC obj  = new ClassC();
			obj.f=0.003f;
			obj.s="rathna";
			
			obj.ranji1();
			obj.method2();
			System.out.println(obj.a);
			obj.method2(5);
			
			
			
		}

	}


