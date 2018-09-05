package week1.day1;

public class LearningObjects {
	
	public static void main(String[] args) {
		
		BankAccountVersionNew accOne = new  BankAccountVersionNew();
		accOne.createAccount("Savings", "TestLeaf", '*');
		System.out.println("Is the Account Active ? "+accOne.isActive);
		accOne.blockAccount(0);
		System.out.println("Is the Account Active ? "+accOne.isActive);
		accOne.printAccountDetails();
		
		BankAccountVersionNew accTwo = new BankAccountVersionNew();
		accTwo.createAccount("Savings", "Gayatri", 'k');
		accTwo.printAccountDetails();
		accTwo.blockAccount(1);
		System.out.println(accTwo.accountHolderFirstName);
		
	}
}

