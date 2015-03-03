import java.util.Scanner;
import java.lang.Math;
public class College {
	public static void main(String[] args) {
		double baseTuition = 12342;
		double totalTuition = 0;
		double finalTuition = 0;
		

		Scanner A = new Scanner(System.in);
		System.out.println("What is the percent at which tuition increases yearly?(in %) ");
		double tuitionRate = A.nextDouble();
		
		tuitionRate = tuitionRate / 100;
		double newBase = baseTuition * (1 + tuitionRate);

		// public static float calculateTuition(float baseTuition , float
		// totalTuition, float tuitionRate){
		
		 for (int Year = 1; Year <= 4; Year++) {
		//	baseTuition += newBase;
			totalTuition += newBase;
	//		System.out.println(newBase);
			System.out.println(totalTuition);
			
		//	finalTuition += totalTuition;
		//	System.out.println(finalTuition);
			/*
			baseTuition = (baseTuition * (1 + tuitionRate));

			totalTuition += (baseTuition);
*/
		//	System.out.println(totalTuition);

		}

		System.out.println("Your total sum price after 4 years is " + totalTuition);
	}

}
