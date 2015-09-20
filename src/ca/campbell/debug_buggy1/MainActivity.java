package ca.campbell.debug_buggy1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
/*
 * this code does not work properly
 * first run it without debugging, see the results
 * second read it to see what it is doing with the UI and code
 * there is an "error" in the xml, can you find it ?
 * hint: use the graphical layout vie
 * 
 * third set break points and use the debugger to find
 * the problems and fix them, set a breakpoints and watch the variables
 * 
 * Buttons:
 * Count will run a count method, result should always be 5050, ignores input
 * Factorial will calculate the factorial of the number input
 * Sum will return the sum of number input + 5 + 10 + 15
 */

public class MainActivity extends Activity {	
	EditText number;
	TextView result;
	Counter counter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		number = (EditText) findViewById(R.id.number);
		result = (TextView) findViewById(R.id.result);
		counter = new Counter();
	}

	public void countItUp(View view) {
		counter.count();
		// put the result in the result field
		result.setText(counter.getResult());
	}

	public void factorial(View view) {
		int inputnum;
		CharSequence cseq;
		cseq = number.getText();
		if (cseq != null && cseq.length() > 0) {
			inputnum = Integer.parseInt(cseq.toString());
			counter.factorial(inputnum);
			result.setText("factorial of : " + inputnum + " = " + counter.getResult());
		} else {
			result.setText("Invalid number input");
		}
	}
	protected void sum(View view) {
		int inputnum;
		CharSequence cseq;
		cseq = number.getText();
		if (cseq != null && cseq.length() > 0) {
			inputnum = Integer.parseInt(cseq.toString());
			counter.sum(5,10,15,inputnum);
			result.setText("sum of : " + inputnum + " +5+10+15 = " + counter.getResult());
		} else {
			result.setText("Invalid number input");
		}
	}
}