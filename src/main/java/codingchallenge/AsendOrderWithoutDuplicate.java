package codingchallenge;


	import java.util.Set;
	import java.util.TreeSet;
	
	public class AsendOrderWithoutDuplicate {
	
		public static void main(String[] args)  {
			int num =186553;
			String s = Integer.toString(num);
			Set<Character> asc = new TreeSet<Character>();
			for(char c:s.toCharArray())
			{
				asc.add(c) ;
			}
			String s2=""+asc;
			System.out.println(s2.replaceAll("\\D", ""));
			
		}
	}
	