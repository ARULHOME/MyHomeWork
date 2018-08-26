package week1.day1;

public class ClassWork {
	static void makeCall(String name , long phoneNumber) {
		System.out.println("Calling "+name+" " +phoneNumber);
		} 
	static void addContact(long phoneNumber) {
		System.out.println("Contact Added " +phoneNumber);}
	static void lockPhone() {
		System.out.println("Locked");}
	static long  getMobileNumber(String name) {
		System.out.println("Searching the contact "+name);
		return 123456789;}
	public static void main(String[] args) {
		makeCall("Gayatri",1234567890l);
		addContact(1234567);
		lockPhone();
	  long gayatriMobileNumber = getMobileNumber("Gayatri");
	  System.out.println(gayatriMobileNumber);}
}

