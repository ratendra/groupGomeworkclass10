package GroupTask;

public class Task10 {
	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array?
		int arr[]= {455,233,566,432,15008,};
		int largest=0;
		int secondlargest=0;
		for(int num:arr) {
			if (num>largest) {
				largest=num;
			}
			if(num>secondlargest &&num<largest) {
				secondlargest=num;
			}
		}
		System.out.println("Second largest number in array is "+ secondlargest);

	}

}
