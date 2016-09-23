package com.emi.elp.jpa.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.emi.elp.jpa.model.UserPersistenceBean;

public class UserPersistenceServiceDatabase{
	
	/*@PersistenceContext
	EntityManager em ;
	*/
	
	private EntityManagerFactory emf;
	
	private EntityManager em;
	
	public boolean userExists(String username) throws Exception{
		
		try{
		emf = Persistence.createEntityManagerFactory("ELPDatSource");
		
		em = emf.createEntityManager();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
		em.createNamedQuery("UserBean.findByUsername", UserPersistenceBean.class)
							.setParameter("username", username).getSingleResult();

		}catch(NoResultException e){
			return false;
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}


	public boolean emailExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	public void registerUser(UserPersistenceBean user) {
		System.out.println("sdas");
		
	}


}
