package homeworkweek2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class UniqueCharacter {

	public static void main(String[] args) {
		
		String s = "Infosys india" ;	
		
		char[] c = s.toCharArray();
	
		Set<Character> a = new LinkedHashSet<Character>();
		for ( int i=0; i< c.length; i++)
		{
			a.add(c[i]);
		}
		for(Character eachch:a)
		{
			System.out.println(eachch);
		}
	}

}
