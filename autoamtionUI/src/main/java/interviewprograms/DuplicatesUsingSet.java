package interviewprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicatesUsingSet {
	
	public static void main(String[] args) {
		
		String str = "google";
		
		char[] ch_arr = str.toCharArray();
		
		Set<Character> hset = new HashSet<Character>();
		
		for(char c : ch_arr)
		{
			hset.add(c);
		}
		
		//System.out.println(hset);

		Iterator it = hset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
