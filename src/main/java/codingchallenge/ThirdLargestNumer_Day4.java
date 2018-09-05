package codingchallenge;

import java.util.Scanner;

public class ThirdLargestNumer_Day4 {

		public static void main(String[] args) {
			int t ;		
			Scanner scan= new Scanner(System.in);	
			System.out.println("Enter the size of Array");
				int size = scan.nextInt();
				int a[]=new int[size];
				for (int i=0;i< a.length;i++)
				{
					System.out.println("Enter the values"+(i)+":");
					a[i]=scan.nextInt();
				}
				for (int i=0;i< a.length;i++)
				{
					for (int j=i+1;i<a.length;j++)
					{
						if (a[i]>a[j])
						{	
							t=a[i];
							a[i]=a[j];
							a[j]=t;
						}
					}	
				}		
				System.out.println("First Largest value in the array:"+(a[size-1]));			
					
				System.out.println("3rd largest value in the array:"+(a[size-3]));
				
				
				scan.close();	
		}
				
	}		
				
				

	


