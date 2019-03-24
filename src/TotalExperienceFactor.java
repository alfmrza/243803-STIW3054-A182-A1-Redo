import java.util.Scanner;
public class TotalExperienceFactor extends ExperienceFactor{
double tEF;
public void calcEF() {
	Scanner scan = new Scanner(System.in);
	display();
	System.out.println("Rate your system between 1-5, E1: ");
	ef1 = scan.nextDouble();
	System.out.println("Rate your system between 1-5, E2: ");
	ef2 = scan.nextDouble();
	System.out.println("Rate your system between 1-5, E3: ");
	ef3 = scan.nextDouble();
	System.out.println("Rate your system between 1-5, E4: ");
	ef4 = scan.nextDouble();
	System.out.println("Rate your system between 1-5, E5: ");
	ef5 = scan.nextDouble();
	System.out.println("Rate your system between 1-5, E6: ");
	ef6 = scan.nextDouble();
	System.out.println("Rate your system between 1-5, E7: ");
	ef7 = scan.nextDouble();
	System.out.println("Rate your system between 1-5, E8: ");
	ef8 = scan.nextDouble();
	tEF = (ef1 * 1 + (ef2 * 0.5) + (ef3 * 1) + (ef4 * 0.5) + (ef5 * 0) + (ef6 * 2) + (ef7 * (-1)) + (ef8 * (-1)));
	System.out.println("The total experience factor is = " + tEF);
}
public double getEF() {
	return tEF;
}
}
