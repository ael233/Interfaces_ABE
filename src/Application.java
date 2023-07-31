
public class Application {
	public static void main(String[] args) {
		RationalNumber numberA = new RationalNumber(4,6);
		RationalNumber numberB = new RationalNumber(7,8);
		RationalNumber numberC = new RationalNumber(1,3);
		RationalNumber numberD = new RationalNumber(2,6);
		
		System.out.println("numA: " + numberA + " | written as point value: " + ((double)numberA.getNumerator() / (double)numberA.getDenominator()));
		System.out.println("numB: " + numberB + " | written as point value: " + ((double)numberB.getNumerator() / (double)numberB.getDenominator()));
		System.out.println("numC: " + numberC + " | written as point value: " + ((double)numberC.getNumerator() / (double)numberC.getDenominator()));
		System.out.println("numD: " + numberD + " | written as point value: " + ((double)numberD.getNumerator() / (double)numberD.getDenominator()));
		
		int comparison1 = numberA.compareTo(numberB);
		int comparison2 = numberB.compareTo(numberC);
		int comparison3 = numberC.compareTo(numberA);
		int comparison4 = numberC.compareTo(numberD);
		
		System.out.println("Comparing A and B: " + comparison1);
		System.out.println("Comparing B and C: " + comparison2);
		System.out.println("Comparing A and C: " + comparison3);
		System.out.println("Comparing C and D: " + comparison4);
		
	}//end main
}//end class
