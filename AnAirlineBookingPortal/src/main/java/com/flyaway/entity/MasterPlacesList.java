package com.flyaway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_places_list")
public class MasterPlacesList {

	@Id
	@GeneratedValue
	@Column(name = "Place_Id")
	private Integer placeId;
	
	@Column(name = "Place_Name")
	private String placeName;
	
	@Column(name = "Airport_Name")
	private String airportName;
	
	@Column(name = "Country")
	private String country;
	
	public MasterPlacesList() {
	
	}
	@Override
	public String toString() {
		return "Master_Places_List [Place_Id=" + getPlaceId() + ", Place_Name=" + getPlaceName() + ", Airport_Name="
				+ getAirportName() + ", Country=" + getCountry() + "]";
	}
	public Integer getPlaceId() {
		return placeId;
	}
	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
 
	}
