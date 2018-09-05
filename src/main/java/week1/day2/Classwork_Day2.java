package week1.day2;

import java.util.Scanner;

public class Classwork_Day2 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner number = new Scanner(System.in);
		int input = number.nextInt();
		int remain = input%10;
		
		while (input >0)
		{
			if (remain%2 !=0)
			{
				System.out.println(remain);
			}
			input = input / 10;
			remain = input % 10;
		}
		
		
		
	}

}
