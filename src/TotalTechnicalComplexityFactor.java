public class TotalTechnicalComplexityFactor{
	double tTCF;

	public double calcTCF() {
		TotalTechnicalFactor tTF = new TotalTechnicalFactor();
		tTF.calcTF();
		tTCF = 0.6 + (0.01 * tTF.getTTF());
		System.out.println("The total technical complexity factor is = " + tTCF);
		return tTCF;
	}

	public double getTTCF() {
		return tTCF;
	}
}
