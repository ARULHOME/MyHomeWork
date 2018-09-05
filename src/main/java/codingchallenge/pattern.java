package codingchallenge;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value1");
		int a =sc.nextInt();
		System.out.println("enter the value2");
		int b =sc.nextInt();
		for(int i=a;i<=b;i++)
		 {
			if(i%3==0)
			 {
				System.out.println("FIZZ");
			}
			else if (i%5==0)
			{
				System.out.println("BUZZ");
			}
			else if (i%3==0 && i%5==0)
			 {
				System.out.println("FIZZBUZZ");
			 }
			else
			{
				System.out.println(i);
			 }
		 }
	 }
	
	
	
	
	
}
				