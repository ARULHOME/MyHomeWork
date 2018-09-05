package codingchallenge;
import java.util.Scanner;

public class Factorial_Day3 {

	public static void main(String[] args) {
		
		int i;
		int fact=1;
		int num;
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the value");
		num=Scan.nextInt();
		
		for(i=1; i<=num; i++)
			
		{
			fact=fact*i;
		}
		System.out.println("Facorial of "+num+" is:"+fact);
		Scan.close();
		}
		
	}


