package com.emi.elp.ejb.testEjb;

import javax.ejb.Stateless;

import com.emi.elp.ejb.testInterfaces.TestEJBLocal;
import com.emi.elp.ejb.testInterfaces.TestEJBRemote;

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
	public String returnSomething() {
		return "Raspuns de la EJB";
	}

}
