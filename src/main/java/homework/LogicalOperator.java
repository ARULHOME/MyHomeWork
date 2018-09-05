package homework;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		boolean result;
		if(num1>num2&&num1>num3)
		{
			System.out.println("The greatest of three numbers are:"+num1);
		}
		else if(num2>num1&&num2>num3)
		{
			System.out.println("The greatest of three numbers:"+num2);
			
		}
		else
		{
			System.out.println("The greatest of three numbers is:"+num3);
		}
		
		result = (num1> num2)|| (num3>num1);
		}

	


	}


