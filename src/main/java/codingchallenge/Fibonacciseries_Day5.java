package codingchallenge;

import java.util.Scanner;

public class Fibonacciseries_Day5 {

	public static void main(String[] args) {
	int i,j=0,k,n;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value:");
	n=scan.nextInt();
	System.out.println("Fibonacci series are:\n");
	for(i=0;i<n;i++)
	{
		k=i+j;
		System.out.println(i);
		i=j;
		j=k;
	}
	scan.close();
	}
}
