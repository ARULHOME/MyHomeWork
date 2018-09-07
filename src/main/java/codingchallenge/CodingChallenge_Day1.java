package codingchallenge;

import java.util.Scanner;
	

public class CodingChallenge_Day1 {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int i, n1,n2,n3;
	System.out.println("Enter the  Number1#");
	n1=scan.nextInt();
	System.out.println("Enter the  Number2#");
	n2=scan.nextInt();
	for( i=1; i<=n2;i++)
	{	
		n3=i*n1;
		System.out.println(i+"*"+n1+"="+n3);
	
	}
		scan.close();
}
}