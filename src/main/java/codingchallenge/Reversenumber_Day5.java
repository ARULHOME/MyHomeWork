package codingchallenge;

import java.util.Scanner;

public class Reversenumber_Day5 {

	public static void main(String[] args) {
		int n,r,s=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value:");
	n=sc.nextInt();
	while(n!=0)	
	{
		r=n%10;
		s=(s*10)+r;
		n=n/10;
	}
	System.out.println("Reverse value is:"+s);
	sc.close();	
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


