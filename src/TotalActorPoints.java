import java.util.Scanner;

public class TotalActorPoints extends Actor {
	private int totAP = 0;
	public int calcAP() {
		Scanner scan = new Scanner (System.in);
		System.out.println("How many simple actors does your system have?");
		simpleA = scan.nextInt();
		System.out.println("How many average actors does your system have?");
		averageA = scan.nextInt();
		System.out.println("How many complex actors does your system have?");
		complexA = scan.nextInt();
		totAP = (simpleA * 1) + (averageA * 2) + (complexA * 3);
		return totAP;
	}
	public int getAP() {
		return totAP;
	}
	public String toString() {
		return "The total actor points is = " + totAP;
	}
}