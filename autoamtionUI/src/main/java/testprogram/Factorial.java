package testprogram;

public class Factorial {
	
	public static void main(String[] args) {
		
		int num = 5;
		
		int fact = 1;
		
		/*for(int i = 1 ; i<=num; i++)
		{
			fact *= i;
		}
		
		System.out.println("Factorial : "+fact);*/
		
		while (num != 0)
		{
			fact *= num; //1 *5 
			
			num = num - 1; //5 -1  4 
		}
		
		System.out.println(fact);
	}

}
