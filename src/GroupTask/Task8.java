package GroupTask;

public class Task8 {
	
	public static void main(String[] args) {
		//write a java program to print the first 10m numbers of Fibonacci series.
		
		int n =10, num1=0,num2=1;
		System.out.println("Fibomacci Series till" +n+"terms:");
		
		for (int i = 1; i<=n; i++) {
			System.out.print(num1 +",");
			int num = num1 +num2;
			num1 = num2;
			num2 = num;
			
		}
	}

}
