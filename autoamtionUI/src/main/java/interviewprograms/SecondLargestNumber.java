package interviewprograms;

public class SecondLargestNumber {
	
	public static int secondbiggestnum(int arr[]) {
		
		int maxNum = arr[0];
		
		int secMaxNum = -1;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(maxNum < arr[i])
			{
				secMaxNum = maxNum;
				maxNum = arr[i];
			}
			else if (secMaxNum < arr[i] && arr[i]!= maxNum)
			{
				secMaxNum = arr[i];
			}
		}
		
		return secMaxNum;
	
	}
	
	public static void main(String[] args) {
		
		int[] a = {56,23,14,15,20,56,24};
		
		System.out.println("Secondlargest number in Array is :"+secondbiggestnum(a));
		
		
	}

}
