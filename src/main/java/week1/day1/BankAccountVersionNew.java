package week1.day1;

public class BankAccountVersionNew {
	static boolean isActive = true;
	static String accountType ;
	static int accountNumber;
	static float rateOfInterest = 4.5f;
	static int minBalance = 500;
	static String accountHolderFirstName;
	static char accountHolderInitial;
	static String nomineeName = "Not Added";

	public static void createAccount(String aType, String aName, char aInitial){
		System.out.println("Creating account in progress");
		accountType= aType;
		accountHolderFirstName =aName;
		accountHolderInitial= aInitial;
		System.out.println("Account created successfully with the following details");
		System.out.println(aType);
		System.out.println(aName);
	}

	private static int printAccountDetails()
	{
		System.out.println("Printing account in progress");
		System.out.println("isActive " + isActive);
		System.out.println("accountNumber " + accountNumber);
		System.out.println("rateOfInterest " + rateOfInterest);
		System.out.println("minBalance " + minBalance);
		System.out.println("accountHolderFirstName " + accountHolderFirstName);
		System.out.println("accountHolderInitial " + accountHolderInitial);
		System.out.println("nomineeName " + nomineeName);
		return 4;
	}
	//blockAccount(12345);
	static boolean blockAccount(int accNumber){
		//int accNumber= 12345
		System.out.println("Blocking account in progress");
		isActive= false;
		System.out.println(accNumber + " is blocked successfully");
		return isActive;
	}

	public static void main(String[] args) {
		createAccount("Savings","SSP", 'S');
		boolean blockSatus = blockAccount(12345);
		System.out.println(blockSatus);
		printAccountDetails();
	}
}


