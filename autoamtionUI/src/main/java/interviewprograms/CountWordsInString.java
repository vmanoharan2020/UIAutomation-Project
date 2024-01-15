package interviewprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountWordsInString {
	
	public static void main(String[] args) {
		
		String str = "the given string is palindrome or not the given string";
		
		String[] split_str = str.split(" ");
		
		Map<String, Integer> lmap = new LinkedHashMap<String, Integer>();
		
		for(String s : split_str)
		{
			lmap.put(s, lmap.containsKey(s)? lmap.get(s)+1 : 1);
		}
		
		for(Map.Entry<String, Integer> entry : lmap.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		// duplicate string
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("Printing only duplicates in String");
		
		for(Map.Entry<String,Integer> entry : lmap.entrySet())
		{
			if(entry.getValue() >= 2)
			{
				System.out.println(entry.getKey());
			}
		}
		
		System.out.println("-----------------------------------------------------------------------");
		
		// Add split[] to list
		
		List<String> list = new ArrayList<String>();
		
		for (String l : split_str) {
			
			list.add(l);
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
			i += 2;
			
		}
		
	}

}
