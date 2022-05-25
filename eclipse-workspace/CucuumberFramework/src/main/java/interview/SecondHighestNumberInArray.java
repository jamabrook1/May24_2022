package interview;

public class SecondHighestNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int largest = 0;
		int secondLargest = 0;
		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("\nSecond largest number is:" + secondLargest);
		System.out.println("Largest Number is: " + largest);
	}
}


//		if(a>b && a>c && a>d) {
//			System.out.println(a);
//		}else if (b>a && b>c && b>d) {
//			System.out.println(b);
//		}else if (c>a && c>b && c>d) {
//			System.out.println(c);
//		} else {
//			System.out.println(d);
//		}
