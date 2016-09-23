package com.emi.ejb.test;

import javax.ejb.Local;

@Local
public interface TestEJBLocal {

	String test();
	
}
