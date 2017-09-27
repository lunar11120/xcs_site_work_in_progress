package com.emp.mvc.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity(name="OPS_LOCATION")
public class OpsLocation {
	
	@Id
	@GeneratedValue
	@Column(name="LOCATION_ID")
	private int locationid;
		
	@Column(name="LOCATION_NAME")
	private String locationName;
	
	@Column(name="LOCATION_BUILDING")
	private String locationBuilding;
	
	@Column(name="LOCATION_SUBDISTRICTCODE")
	private String locationCode;

	public int getLocationid() {
		return locationid;
	}

	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationBuilding() {
		return locationBuilding;
	}

	public void setLocationBuilding(String locationBuilding) {
		this.locationBuilding = locationBuilding;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public OpsLocation(int locationid, String locationName, String locationBuilding, String locationCode) {
		super();
		this.locationid = locationid;
		this.locationName = locationName;
		this.locationBuilding = locationBuilding;
		this.locationCode = locationCode;
	}

	public OpsLocation() {
		super();
	}

	@Override
	public String toString() {
		return "OpsLocation [locationid=" + locationid + ", locationName=" + locationName + ", locationBuilding="
				+ locationBuilding + ", locationCode=" + locationCode + "]";
	}
	
	

	


}
