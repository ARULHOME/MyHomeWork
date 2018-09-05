package week2.codingchallenge;
import java.util.Scanner;
public class FindArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int a=scan.nextInt();		
		Integer[]b=new Integer[a];
		int sum = 0;
		System.out.println("Enter the array values");
		for (int i=0;i<b.length;i++)
		{
			b[i] = scan.nextInt();
			sum =sum+b[i];
		}
		System.out.println("some of the array :"+sum);
	}

}
