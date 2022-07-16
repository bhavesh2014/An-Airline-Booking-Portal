package com.flyaway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Step -1 , Add @Entity(this annotation makes NewUsers object persists for the DB) and @Table
@Entity
@Table 
public class Admin_Table {

	//Step -2 , Add @Column annotation for columns
	@Id
    @GeneratedValue
    @Column(name = "Admin_Id",nullable = false)
	private int Admin_Id;
	@Column
	private String Admin_Name;
	@Column
	private String Admin_User_Name;
	@Column
	private String Admin_Pasword;
	
	public Admin_Table() {
		
	}

	@Override
	public String toString() {
		return "Admin_Table [Admin_Id=" + Admin_Id + ", Admin_Name=" + Admin_Name + ", Admin_User_Name="
				+ Admin_User_Name + ", Admin_Pasword=" + Admin_Pasword + "]";
	}

	public int getAdmin_Id() {
		return Admin_Id;
	}

	public void setAdmin_Id(int admin_Id) {
		Admin_Id = admin_Id;
	}

	public String getAdmin_Name() {
		return Admin_Name;
	}

	public void setAdmin_Name(String admin_Name) {
		Admin_Name = admin_Name;
	}

	public String getAdmin_User_Name() {
		return Admin_User_Name;
	}

	public void setAdmin_User_Name(String admin_User_Name) {
		Admin_User_Name = admin_User_Name;
	}

	public String getAdmin_Pasword() {
		return Admin_Pasword;
	}

	public void setAdmin_Pasword(String admin_Pasword) {
		Admin_Pasword = admin_Pasword;
	}
}
