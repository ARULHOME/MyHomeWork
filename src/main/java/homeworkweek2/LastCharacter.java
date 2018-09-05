package homeworkweek2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class LastCharacter {

	public static void main(String[] args) {
		String name="i learnt a lot today";
		System.out.println("Given name:"+name);
		
		char[]c= name.toCharArray();
		Set<Character> a = new TreeSet<Character>();
			int size =a.size();
			for (int i=0;i<c.length;i++)
			{
				a.add(c[i]);
			}
			for (Character nm : a) {
				System.out.println(nm);
			}
			List<Character> last = new ArrayList<Character>();
			last.addAll(a);
			System.out.println("last alphabetic order "+last.get(a.size()-1));
		
		
		
		

	}

}
