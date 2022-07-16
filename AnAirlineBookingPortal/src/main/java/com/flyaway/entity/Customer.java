package com.flyaway.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Step -1 , Add @Entity and @Table
@Entity
@Table
public class Customer {

	@Id
    @GeneratedValue
    @Column(name = "cust_id",nullable = false)
	private int cust_id;
	@Column
	private String first_name;
	@Column
	private String last_Name;
	@Column
	private String email;
	@Column
	private String phone_Number;
	@Column
	private String address;
	@Column
	private String user_Name;
	@Column
	private String pasword;
	//@Column
	//private int  user_Id;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User_Id")
	private users users;
	
	//Step -1 , Add Constructor
	public Customer() {
		
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", first_name=" + first_name + ", last_Name=" + last_Name + ", email="
				+ email + ", phone_Number=" + phone_Number + ", address=" + address + ", user_Name=" + user_Name
				+ ", pasword=" + pasword + ", users=" + users + "]";
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public users getUsers() {
		return users;
	}

	public void setUsers(users users) {
		this.users = users;
	}
	
}
