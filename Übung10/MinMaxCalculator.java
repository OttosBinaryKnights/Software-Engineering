/**
 * @author Jonas Weigt
 *	&09.06.2016
 *  15:24:52
 *
 *  Aufgabe4
 *  Zum Testen bitte in ein Java-Projekt einf�gen
 */

public class MinMaxCalculator {

	private int[] inputArray = null;

	public MinMaxCalculator(int[] inputArray) {
		this.inputArray = inputArray;
	}

//Existieren nur negative Werte im Array wird das falsche Ergebnis ausgegeben
	public int getMax() {
		int maxValue = -1;//hier muss Integer.MinValue() hin
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

//das Erste Element im Array wird übergangen
	public int getMin() {
		int minValue = Integer.MAX_VALUE;
		for (int i = 1; i < inputArray.length; i++) {// hier muss i = 0 und length-1 stehen
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}

	public static void main(String args[]) throws InterruptedException {
		MinMaxCalculatorTest test = new MinMaxCalculatorTest();
		test.test();
		Thread.sleep(100);
		/*
		 * bei �nderungen im Code (siehe Kommentare) schlagen die Teste nicht mehr fehl!
		 */
		MinMaxCalculator mmc = new MinMaxCalculator(new int[] { 10, 13, 8, 2, 25, 123 });
		System.out.println("Maximum Value is: " + mmc.getMax());
		System.out.println("Minimum Value is: " + mmc.getMin());
	}
}
