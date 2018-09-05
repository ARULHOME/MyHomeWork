package week1.day1;

public class BankAccount {
		static boolean isActive ;
		static String accountType ;
		static int accountNumber;
		static float rateOfInterest ;
		static int minBalance ;
		static String accountHolderFirstName;
		static char accountHolderInitial;

		static void createAccount(){
			accountType= "Savings";
			accountNumber= 123456;
			isActive= true;
			rateOfInterest= 10.5f;
			minBalance = 500;
			accountHolderFirstName ="BABU";
			accountHolderInitial= 'M';
			System.out.println("Account created successfully");
		}
	 //blockAccount(12345);
		static boolean blockAccount(int accNumber){
			//int accNumber= 12345
			isActive= false;

			System.out.println(accNumber+" is blocked successfully");
			return isActive;

		}
		public static void main(String[] args) {
			createAccount();
			boolean blockSatus = blockAccount(12345);
			System.out.println(blockSatus);
		}
	

	}

