public class UCP {
	double uCP, sZUCase, eXFactor;
	public double calcUCP() {
		SizeofSoftware sZUC = new SizeofSoftware();
		sZUCase = sZUC.calcSZUC();
		CalculateEXFactor eXF = new CalculateEXFactor();
		eXFactor = eXF.calcEX();
		uCP = sZUCase * eXFactor;
		System.out.println("The total Use Case Point is = " + uCP);
		return uCP;
	}
	public double getUCP() {
		return uCP;
	}
}