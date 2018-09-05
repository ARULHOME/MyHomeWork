package week2.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class TvStore {

	public static void main(String[] args) {
Map<String ,Integer> allTv = new HashMap<String,Integer>();		

  allTv.put("sony Tv",2);
  allTv.put("VU Tv",2);
  allTv.put("LG Tv",1);
  System.out.println(allTv.size());
  allTv.get("LG Tv");
                 
  Set<String> allTvStore = allTv.keySet();
  List<String> allTelevision = new ArrayList<String>();
  allTelevision.addAll(allTvStore);
 System.out.println(allTelevision);
 
 
 
 
 
 
 
 
	}

}
