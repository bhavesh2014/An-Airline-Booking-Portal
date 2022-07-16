package com.flyaway.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Step -1 , Add @Entity and @Table
@Entity
@Table
public class users {

	//Step -2 , Add @Column annotation for columns
	@Id
    @GeneratedValue
    @Column(name = "User_Id",nullable = false)
    private int User_Id;
	@Column
	private String Email_address;
	@Column
	private String User_type;
	
	@OneToMany(mappedBy="users",cascade=CascadeType.ALL)
	private List<Customer> customer;


	//Step -3 , Add Constructor
	public users() {
		
	}
	//Step -5 , Add toString() methods
	@Override
	public String toString() {
		return "users [User_Id=" + User_Id + ", Email_address=" + Email_address + ", User_type=" + User_type
				+ ", customer=" + customer + "]";
	}
	//Step -4 , Add Getter(0 and Setter() methods
	public int getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}

	public String getEmail_address() {
		return Email_address;
	}

	public void setEmail_address(String email_address) {
		Email_address = email_address;
	}

	public String getUser_type() {
		return User_type;
	}

	public void setUser_type(String user_type) {
		User_type = user_type;
	}
	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

}
