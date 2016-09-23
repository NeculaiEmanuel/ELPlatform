package com.emi.ejb.test;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestEJB
 */
@Stateless
public class TestEJB implements TestEJBRemote, TestEJBLocal {

    /**
     * Default constructor. 
     */
    public TestEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String test() {
		return "Raspuns de la EJB";
	}

}
