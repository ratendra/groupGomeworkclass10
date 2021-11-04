package GroupTask;

public class Task3 {
	public static void main(String[] args) {
		
	
	int [][] num1= {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
	};
	int sumE=0;
	int sumO=0;
	for(int i=0; i<num1.length; i++) {
		for(int j=0; j<num1.length+1; j++) {
			if (num1[i][j]%2==0) {
				sumE+=num1[i][j];
				num1[i][j]++;
			} else {
				sumO+=num1[i][j];
				num1[i][j]++;
			}
		}
	}
	System.out.println("Sum of even numbers is "+ sumE);
	System.out.println("Sum of odd numbers is "+ sumO);

	System.out.println("----------------------------------");



		}

	}
	


