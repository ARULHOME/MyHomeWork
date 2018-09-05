package javapractice;

public class ExceptionHandling {
	public static void main(String[] args)throws RuntimeException, ArithmeticException {
		// TODO Auto-generated method stub

		try {
			int x=50;
			int y=0;
			int b=x/y;
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("exception handling");
			System.err.println("red colored exception");
			System.out.println();
			throw new ArithmeticException();
			
			
		}finally {
			
			System.out.println("the block executed");
		}
		
	}

}


