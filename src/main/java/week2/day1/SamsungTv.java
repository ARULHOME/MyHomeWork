package week2.day1;

public class SamsungTv implements Tv {

public void channelchange(String name) {	
System.out.println("channelchanged" + name);
}
public void channelchange(int number) {
System.out.println("channelchanging" + number);
}
	
public void switchoff(boolean name) {
System.out.println("false");
}

}