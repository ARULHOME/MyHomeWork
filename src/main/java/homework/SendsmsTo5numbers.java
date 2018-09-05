package homework;

public class SendsmsTo5numbers {

	public static void main(String[] args) {
		
		mobilephone accesssms = new mobilephone();
		
			long number []= {9000812341l,9000812342l,9000812343l,9000812343l,9000812345l};
			for(long numPin:number)
			{	
				accesssms.sendsms ("Goodmorning message sent to " , numPin);
			}
				System.out.println(" ");
				for(int i=0; i<number.length; i++)
				{
					accesssms.sendsms ("Goodmorning message sent to " , number[i]);	
				}

	}

}
