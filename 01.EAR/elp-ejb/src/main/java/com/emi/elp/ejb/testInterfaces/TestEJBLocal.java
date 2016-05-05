package com.emi.elp.ejb.testInterfaces;

import javax.ejb.Local;

@Local
public interface TestEJBLocal {

	String returnSomething();
	
}
