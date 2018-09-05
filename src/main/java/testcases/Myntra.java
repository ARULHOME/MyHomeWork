package testcases;

public class Myntra {

	public static void main(String[] args) {
		
		String s = "hi am studying java course";
		String[] split = s.split("\\s");
		for (String string : split) {
			System.out.println(string );
		}
		
		System.out.println("*****" );
		String[] split1 = s.split("\\s");
		for (String string1 : split1) {
			
			StringBuffer ai = new StringBuffer( string1);
			
			System.out.println(ai.reverse() );
		}
		
		
			String vl = "lakshmi";
			StringBuffer ai = new StringBuffer( vl);
			System.out.println(ai.reverse() );
		
		
	}

}
