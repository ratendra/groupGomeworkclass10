package GroupTask;

public class Task1 {
	public static void main(String[] args) {
	/*
	 * Create a 2D array of integer values. Print the sum of all numbers.
	 * 
	 */
int [][] arr= {
		{10, 20, 30,},
		{15, 25, 35}
};
int sum=0;
for(int i=0;i<arr.length; i++) {
	for (int j=0; j<arr.length+1;j++) {
		sum+=arr[i][j];
	}
}
System.out.println(sum);


System.out.println("----------------------------------");
	}
	

}
