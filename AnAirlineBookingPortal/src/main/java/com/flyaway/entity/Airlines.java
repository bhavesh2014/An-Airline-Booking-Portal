package com.flyaway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Airlines {

	//Step -2 , Add @Column annotation for columns
	@Id
	@GeneratedValue
	@Column(name = "Airlines_Id",nullable = false)
	private int airlinesId;
	
	@Column(name = "Airlines_Name")
	private String airlinesName;
	
	public int getAirlinesId() {
		return airlinesId;
	}
	public void setAirlinesId(int airlinesId) {
		this.airlinesId = airlinesId;
	}
	public String getAirlinesName() {
		return airlinesName;
	}
	public void setAirlinesName(String airlinesName) {
		this.airlinesName = airlinesName;
	}
	@Override
	public String toString() {
		return "Airlines [airlinesId=" + airlinesId + ", airlinesName=" + airlinesName + ", getAirlinesId()="
				+ getAirlinesId() + ", getAirlinesName()=" + getAirlinesName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Airlines(int airlinesId, String airlinesName) {
		super();
		this.airlinesId = airlinesId;
		this.airlinesName = airlinesName;
	}
	public Airlines() {
		super();
	}
	 
	

}
