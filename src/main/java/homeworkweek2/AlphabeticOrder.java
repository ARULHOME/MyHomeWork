package homeworkweek2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphabeticOrder {
	public static void main(String[] args) { 
		String s = " amazon developement center";
		char [] c = s.toCharArray();
		List<Character> a =new ArrayList<Character>();
		for(int i=0;i<c.length;i++)
		{
			a.add(c[i]);
		}
		Collections.sort(a);
		System.out.println("The ordered list are");
		for (Character character : a) {
			System.out.println(character);
	}
}
}