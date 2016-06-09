import org.junit.Test;


/**
 * @author Jonas Weigt
 *	09.06.2016
 *  15:26:12
 *  Ist sicher noch erweiterbar!
 */

public class MinMaxCalculatorTest{

	private void erfolgreich(){
		System.out.println("Test erfolgreich!");
	}
	
	private void nichtEfolgreich(){
		System.err.println("Test nicht erfolgreich!");
	}
	
	@Test
	public void test() {
		
		
		int[] testArray001 = {-200, -25, 25, 200};
		int[] testArray002 = {0,10,25,2,3,5};
		int[] testArray003 = {-12,-2,-6, 0};
		int[] testArray004 = {-12, -3,-5,-7,-8};
		MinMaxCalculator testCalc001 = new MinMaxCalculator(testArray001);
		MinMaxCalculator testCalc002 = new MinMaxCalculator(testArray002);
		MinMaxCalculator testCalc003 = new MinMaxCalculator(testArray003);
		MinMaxCalculator testCalc004 = new MinMaxCalculator(testArray004);
		
		/*
		 * Testcase1
		 * negative Zahl ist Minimum und positive ist Maximum
		 */
		if(testCalc001.getMin() == -200 && testCalc001.getMax() == 200){
			erfolgreich();
		}else{
			nichtEfolgreich();
		}
		/*
		 * Testcase2 
		 * negative Zahl ist Minimum und negative Zahl ist Maximum
		 */
		if(testCalc004.getMin() == -12 && testCalc004.getMax() == -3){
			erfolgreich();
		}else{
			nichtEfolgreich();
		}
		
		/*
		 * Testcase3
		 * 0 ist Minimum und positive Zahl ist Maimum
		 */
		if(testCalc002.getMin() == 0 && testCalc002.getMax() == 25){
			erfolgreich();
		}else{
			nichtEfolgreich();
		}
		/*
		 * Testcase4
		 * negative Zahl ist Minimum und 0 ist Maximum 
		 */
		if(testCalc003.getMin() == -12 && testCalc003.getMax() == 0){
			erfolgreich();
		}else{
			nichtEfolgreich();
		}
	}
	

}

