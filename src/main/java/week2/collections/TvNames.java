package week2.collections;

import java.util.ArrayList;
import java.util.List;

public class TvNames {

	public static void main(String[] args) {
	List<String> Tv = new ArrayList<String>();
	int size= Tv.size();
	System.out.println(size);
	
	Tv.add("Samsung Tv");
	Tv.add("Sony Tv");
	Tv.add("vu Tv");
	System.out.println(Tv.size());
	Tv.add("vu Tv");
	for(String eachTv:Tv) {
	System.out.println("");
		
	}
	}

}
