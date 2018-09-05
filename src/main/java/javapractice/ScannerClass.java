package javapractice;

import java.util.Scanner;

public class ScannerClass {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*
			int x=50, y=60;
		
			System.out.println("x and y addition is"+"  "+(x+y));
			*/
			
			Scanner sc=new Scanner(System.in);
			
			int x,y;
			
			System.out.println("x value is");
			x=sc.nextInt();
			
			System.out.println("y value is");
			y=sc.nextInt();
			
			System.out.println(x+y);
			

		}

	}


