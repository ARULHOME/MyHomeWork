package week2.collections;

import java.util.Set;
import java.util.TreeSet;

public class Learnset {

	public static void main(String[] args) {
		Set<String>Tvmodels = new TreeSet<String>();
		System.out.println(Tvmodels.size());				
		Tvmodels.add("6v");
		Tvmodels.add("6c");
		Tvmodels.add("3s");
		Tvmodels.add("6");
		Tvmodels.add("4");
		for(String eachTv : Tvmodels) {
		System.out.println(eachTv);
		
		
		
	}
		Tvmodels.remove("6c");
	}


	}

