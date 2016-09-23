package com.emi.elp.jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TD_USERS database table.
 * 
 */
@Entity
@Table(name="TD_USERS")
@NamedQueries({
    @NamedQuery(name="UserBean.findAll",
                query="SELECT c FROM UserPersistenceBean c"),
    @NamedQuery(name="UserBean.findByName",
                query="SELECT c FROM UserPersistenceBean c WHERE c.username = :username")
}) 
public class UserPersistenceBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String username;

	private String address;

	private String country;

	private String email;

	private String firstname;

	private String lastname;

	private String middlename;

	private String password;

	private String phone;

	public UserPersistenceBean() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}