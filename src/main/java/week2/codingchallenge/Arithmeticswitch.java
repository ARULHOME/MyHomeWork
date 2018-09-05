package week2.codingchallenge;

import java.util.Scanner;

public class Arithmeticswitch {

	public static void main(String[] args) {
		int a,b,c;
		String s1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number 1");
		a=s.nextInt();		
		System.out.println("Enter the Number 2");
		b=s.nextInt();		
		System.out.println("Enter the Which arithmetic operation to be performed Add/subtract/Multiply/Division");
		s1=s.next().toLowerCase();		
		switch(s1)
		{
		case "add":
		{
			System.out.println("Addition of two nuwmbers:"+(a+b));	
			break;
		}
		case "subtract":
		{
			System.out.println("subtraction of two nuwmbers:"+(a-b));	
			break;
		}
			case"multiply":
		{
			System.out.println("multiplication of two nuwmbers:"+(a*b));	
			break;
			
		}
			case "divide":
		{
			System.out.println("division of two nuwmbers:"+(a/b));	
			break;
		}
		default:
		{
			System.out.println("Enter valid arthimetic operator");	
		}
		}
		s.close();
	}
		
	

}
