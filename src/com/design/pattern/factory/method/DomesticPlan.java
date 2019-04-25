package com.design.pattern.factory.method;

//Step 2: Create the concrete classes that extends Plan abstract class. 
public class DomesticPlan extends Plan {

	@Override
	void getRate() {
		rate = 3.5;
	}

}// end of DomesticPlan class.
