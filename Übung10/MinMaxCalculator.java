public class MinMaxCalculator {

	private int[] inputArray = null;

	public MinMaxCalculator(int[] inputArray) {
		this.inputArray = inputArray;
	}

	public int getMax() {
		int maxValue = -1;														//Existieren nur negative Werte im Array wird das falsche Ergebnis ausgegeben
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	public int getMin() {
		int minValue = Integer.MAX_VALUE;
		for (int i = 1; i < inputArray.length; i++) {		//das Erste Element im Array wird übergangen
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}

	public static void main(String args[]) {
		MinMaxCalculator mmc = new MinMaxCalculator(new int[] { 10, 13, 8, 2, 25, 123 });
		System.out.println("Maximum Value is: " + mmc.getMax());
		System.out.println("Minimum Value is: " + mmc.getMin());
	}
}
