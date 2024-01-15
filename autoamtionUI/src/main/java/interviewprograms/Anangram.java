package interviewprograms;

import java.util.Arrays;

public class Anangram {
	
	public static void main(String[] args) {
		
		String str1 = "listen";
		
		String str2 = "silent";
		
		char[] ch1 = str1.toCharArray();
		
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		
		Arrays.sort(ch2);

		String string = Arrays.toString(ch1); 
				
		String string2 =  Arrays.toString(ch2); 
		
		System.out.println(string+"----"+string2);
		
		if(string.equals(string2))
		{
			System.out.println("String is Anangram");
		}
		else
		{
			System.out.println("String is not Anangram");
		}
	}

}
