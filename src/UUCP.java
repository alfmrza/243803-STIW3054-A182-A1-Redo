public class UUCP {
	int uUCP, totAP, totUC;

	public int UUCP() {
		Actor actor = new Actor();
		actor.display();
		TotalActorPoints tAP = new TotalActorPoints();
		totAP = tAP.calcAP();
		System.out.println(tAP);
		UseCase useCase = new UseCase();
		useCase.display();
		TotalUseCases tUC = new TotalUseCases();
		totUC = tUC.calcUC();
		System.out.println(tUC);
		uUCP = tAP.getAP() + tUC.getUC();
		System.out.println(("\nThe total Actor Points is = " + totAP + "\n" + "The total Use-Cases is = " + totUC + "\n"
				+ "The total Unadjusted Use Case Points is = " + uUCP + "\n"));
		return uUCP;
	}

	public int getUUCP() {
		return uUCP;
	}

}