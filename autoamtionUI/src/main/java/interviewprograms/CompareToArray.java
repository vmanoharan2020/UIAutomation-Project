package interviewprograms;

public class CompareToArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 8, 9, 12, 15, 25 };

		int[] arr2 = { 1, 5, 8, 9, 12, 15, 25 };

		int count = 0;

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] == arr2[i]) {
				count++;
			}

		}

		if (count == arr1.length) {
			System.out.println("Array are equal");
		} else {
			System.out.println("Array are not equal");
		}

	}
}
