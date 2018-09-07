package javapractice;

import java.io.IOException;
import java.util.Scanner;

public class Amstrong {
	
	 Amstrong(){
		
		System.out.println("yuyuguiu");
	}
	
	public static void main(String[] args)throws IOException {
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


