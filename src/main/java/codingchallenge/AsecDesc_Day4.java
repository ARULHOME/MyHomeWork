package codingchallenge;

import java.util.Scanner;

public class AsecDesc_Day4 {

	public static void main(String[] args) {
		int t ;
		
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the size of Array");
			int size = sc.nextInt();
			int a[]=new int[size];
			for (int i=0;i< a.length;i++)
			{
				System.out.println("Enter the values"+(i)+":");
				a[i]=sc.nextInt();
			}
			for (int i=0;i< a.length;i++)
			{
				for (int j=i+1;j<a.length;j++)
				{
					if (a[i]<a[j])
					{	
						t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}	
			}		
			System.out.println("\nAscending order");			
			for (int i= a.length-1;i>=0;i--)
			{
				System.out.println(a[i]);
			}
			System.out.println("\nDescending order");
			for (int i=0;i< a.length;i++)
			{
				System.out.println(a[i]);
			}	
			sc.close();	
	}
			
}		
			
			