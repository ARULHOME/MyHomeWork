package codingchallenge;

import java.util.Scanner;

public class ThirdLargestNumer_Day4 {

		public static void main(String[] args) {
				
			Scanner scan= new Scanner(System.in);	
			System.out.println("Enter the first number");
			int a= scan.nextInt();
				
			System.out.println("Enter the second number");	
			int b= scan.nextInt();
				
			System.out.println("Enter the third number");	
			int c= scan.nextInt();
		
			if((a>b)&&(a>c))		
			{
			System.out.println(a + " is the largest number");	
			}
			else if ((b>c)&&(b>a))	
			{
				System.out.println(b + " is the largest number");	
			}	
			else {
				System.out.println(c + " is the largest number");	
				
				scan.close();	
		}
				
		}		
}		
				

	


