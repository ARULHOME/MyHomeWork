package week1.day2;
import java.util.Scanner;


public class LearnStatic {
	static int num =10;
	int num1=10;
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter input");
	int val= scan.nextInt();
	System.out.println(val);
	
		
		



	/*LearnStatic ls=new LearnStatic();
	ls.counter();		ls.counter();
	LearnStatic ls1=new LearnStatic();
	ls1.counter();		ls1.counter();
	ls.counter();
	Mobile_Phone.Lock(67);
*/}
public void counter() {
	num++;		num1++;
	System.out.println("static copy:"+num);
	System.out.println("non static copy:"+num1);
}
public static void staticFunction() {
	System.out.println("Static function working");
}

}