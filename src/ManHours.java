import java.util.Scanner;

public class ManHours {
double mH, uCasePoints;

public double eRate() {
	Scanner scan = new Scanner (System.in);
	UCP uCP = new UCP();
	uCasePoints = uCP.calcUCP();
	System.out.println("How many number of factor ratings in E1-E6 are below 2 and how many number of factor ratings in E7-E8 are above 3?");
	System.out.println("If the total is 2 or less, choose 1");
	System.out.println("If the total is 3 or 4 or less, choose 2");
	System.out.println("If the total is 5 or more, please consider restructuring the project team so the number falls to below 5");
	int choice = scan.nextInt();
	do {
	if (choice == 1) {
		mH = 20 * uCasePoints;
		System.out.println("The total man hours is = " + mH);
	}else if (choice == 2) {
		mH = 28 * uCasePoints;
		System.out.println("The total man hours is = "+ mH);
	}
	} while (choice < 1 || choice > 2);
	return mH;
}
}
