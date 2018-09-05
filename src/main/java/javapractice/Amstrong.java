package javapractice;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count =0,a,b,c ,sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<800;i++) {
			n=i;
			
		while(n>0) {
			a=n%10;
			sum=sum+(a*a*a);
			n=n/10;
		}
		if(sum==i) {
			System.out.println(i);
		}
		
		sum=0;
		}
	}

}


