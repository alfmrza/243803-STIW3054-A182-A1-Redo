import java.util.Scanner;

public class TotalTechnicalFactor extends TechnicalFactor {
	double tTF;
	public void calcTF() {
		Scanner scan = new Scanner(System.in);
		display();
		System.out.println("Rate your system between 1-5, T1: ");
		tf1 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T2: ");
		tf2 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T3: ");
		tf3 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T4: ");
		tf4 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T5: ");
		tf5 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T6: ");
		tf6 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T7: ");
		tf7 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T8: ");
		tf8 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T9: ");
		tf9 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T10: ");
		tf10 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T11: ");
		tf11 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T12: ");
		tf12 = scan.nextDouble();
		System.out.println("Rate your system between 1-5, T13: ");
		tf13 = scan.nextDouble();
		tTF = (tf1 * 2) + (tf2 * 1) + (tf3 * 1) + (tf4 * 1) + (tf5 * 1) + (tf6 * 0.5) + (tf7 * 0.5) + (tf8 * 2)
				+ (tf9 * 1) + (tf10 * 1) + (tf11 * 1) + (tf12 * 1) + (tf13 * 1);
		System.out.println("The total technical factor is = " + tTF);
	}
	public double getTTF() {
		return tTF;
	}
}