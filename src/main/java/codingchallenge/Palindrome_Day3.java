package codingchallenge;
import java.util.Scanner;

public class Palindrome_Day3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");		
		int PoliNumber=scan.nextInt();
		
		int n=PoliNumber;
			
		int reverse=0;
		
		while(n>0) {
			
			int n1=n%10;
			
			int n2=n/10;
			n=n2;
			reverse=n1+(reverse*10);
		}
		
			//System.out.println(reverse);
			if(PoliNumber==reverse) {
				System.out.println(PoliNumber+" is Polindrome");
			}
			else
			{
				System.out.println(PoliNumber+" is not Polindrome");
			}
	}

			
			
				
				
				
			
			

	}


