package codingchallenge;

public class Multiple_3or5 {

	public static void main(String[] args) {
		

		
		
		int n1=5;int n2=3;
		int sum=0;
		for(int i=1;i<20;i++)
		{
			if(i%n1==0 || i%n2==0)
			{
				sum=sum+i;
			}
		}

		System.out.println("The multiples of 3 and 5 is:"+sum);
			
		}

		




	}


