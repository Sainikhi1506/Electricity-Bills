package com.example.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "consumer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String aadharnumber;
    private String firstname;
    private String middlename;
    private String lastname;
    private String moblienumber;
    private String email;
    private String username;
    private String password;
    
    public Customer() {
    }

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAadharnumber() {
		return aadharnumber;
	}

	public void setAadharnumber(String aadharnumber) {
		this.aadharnumber = aadharnumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMoblienumber() {
		return moblienumber;
	}

	public void setMoblienumber(String moblienumber) {
		this.moblienumber = moblienumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aadharnumber, customerId, email, firstname, lastname, middlename, moblienumber, password,
				username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(aadharnumber, other.aadharnumber) && customerId == other.customerId
				&& Objects.equals(email, other.email) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(lastname, other.lastname) && Objects.equals(middlename, other.middlename)
				&& Objects.equals(moblienumber, other.moblienumber) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Employee [customerId=" + customerId + ", aadharnumber=" + aadharnumber + ", firstname=" + firstname
				+ ", middlename=" + middlename + ", lastname=" + lastname + ", moblienumber=" + moblienumber
				+ ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}

	
}
