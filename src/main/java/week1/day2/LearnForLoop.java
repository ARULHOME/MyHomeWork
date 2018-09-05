package week1.day2;

public class LearnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		for (int i = 99; i >=22 ; i--) {
			System.out.println(i);
		}
		
		for (int i =2; i <=100 ; i=i+2) {
			
			System.out.println(i);
		}*/
		String penClour[]= {"blue","green","black","red","black","red"};
		for (String eachPen : penClour) {
			if(eachPen.equals("black"))
				continue;
			System.out.println(eachPen);
		}
		

	}



	}


