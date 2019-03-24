import java.util.Scanner;

public class TotalUseCases extends UseCase {
	private int totUC = 0;
	public int calcUC() {
		Scanner scan = new Scanner (System.in);
		System.out.println("How many simple use-cases does your system have?");
		simpleUC = scan.nextInt();
		System.out.println("How many average use-cases does your system have?");
		averageUC = scan.nextInt();
		System.out.println("How many complex use-cases does your system have?");
		complexUC = scan.nextInt();
		totUC = (simpleUC * 5) + (averageUC * 10) + (complexUC * 15);
		return totUC;
	}


	public int getUC() {
		return totUC;
	}
	public String toString() {
		return "The total use-case points is = " + totUC;
	}
}