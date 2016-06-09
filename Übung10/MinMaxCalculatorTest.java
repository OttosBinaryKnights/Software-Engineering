import org.junit.Test;


/**
 * @author Jonas Weigt
 *	09.06.2016
 *  15:26:12
 *  
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
		
		
		int[] arr200 = {-200, -25, 25, 200};
		int[] arr000 = {0,10,25,2,3,5};
		int[] arr001 = {-12,-2,-6, 0};
		MinMaxCalculator calc200 = new MinMaxCalculator(arr200);
		MinMaxCalculator calc000 = new MinMaxCalculator(arr000);
		MinMaxCalculator calc001 = new MinMaxCalculator(arr001);
		
		/*
		 * Testcase1
		 */
		if(calc200.getMin() == -200 && calc200.getMax() == 200){
			erfolgreich();
		}else{
			nichtEfolgreich();
		}
		/*
		 * Testcase2
		 */
		if(calc000.getMin() == 0 && calc000.getMax() == 25){
			erfolgreich();
		}else{
			nichtEfolgreich();
		}
		/*
		 * Testcase3
		 */
		if(calc001.getMin() == -12 && calc001.getMax() == 0){
			erfolgreich();
		}else{
			nichtEfolgreich();
		}
	}
	

}

