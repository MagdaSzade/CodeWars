package Codewars;

import java.util.List;
import java.util.ArrayList;

public class Josephus {
  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
	  List<T> resultList = new ArrayList<T>();
	  int i = 1;
	  while(items.size()>0) {
      i = (i + k - 1);
		  if (items.size() > 1 && i > items.size()) {
			  if (i % items.size() > 0) {
				  i = i % items.size();
			  } else {
				  i = items.size();
			  }
		  } else if(items.size() == 1) {
			  i = 1;
		  }
			  resultList.add(items.get(i - 1));
			  items.remove(i - 1);
		  	  
	  }	  
	  return resultList;
  }
}
