package codingchallenge;

import java.util.Scanner;
	

public class CodingChallenge_Day1 {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int i, a,b,c;
	System.out.println("Enter the  Number1#");
	a=scan.nextInt();
	System.out.println("Enter the  Number2#");
	b=scan.nextInt();
	for( i=1; i<=b;i++)
	{	
		c=i*a;
		System.out.println(i+"*"+a+"="+c);
	
	}
		scan.close();
}
}