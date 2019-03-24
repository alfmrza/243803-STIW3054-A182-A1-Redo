public class CalculateEXFactor {
	double eXFactor;

	public double calcEX() {
		TotalExperienceFactor tEF = new TotalExperienceFactor();
		tEF.calcEF();
		eXFactor = 1.4 + ((-0.03) * tEF.getEF());
		System.out.println("The experience factor is = " + eXFactor);
		return eXFactor;
	}

	public double getEXFactor() {
		return eXFactor;
	}
}