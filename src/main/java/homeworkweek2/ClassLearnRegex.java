package homeworkweek2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassLearnRegex {

	public static void main(String[] args) {
		
		String text = "ABCDE";
		String pattern = "[A-Z] {4}[A-Z]";
		Pattern p = pattern.Compile(pattern);
		Matcher match = p.matcher(text);
		System.out.println("regex");
		
	}

	

}
