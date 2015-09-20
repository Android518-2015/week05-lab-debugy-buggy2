package ca.campbell.debug_buggy1;

public class Counter {
	private int result;

	public Counter() {
		result = 0;
	}
	public void resetCounter() {
		result = 0;
	}
	public int getResult() {
		return result;
	}
	//static counter no input needed
	// no logical bug in this method
	public void count() {
		for (int i = 0; i < 100; i++) {
			result += i + 1;
		}
	}	

	public void sum (int ... nums ) {
		for (int i = 0; i < nums.length; i++ )
			result += nums[1];

	}

	public void factorial(int fac) {

		if (fac == 0 ) {
			result = 1;
		} 		else {		
			for (int i = fac; i < 1 ; i++) {
				result *= i ;
			}


		}
	}
}

