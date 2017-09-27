package com.emp.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="OPS_INFORM")
public class Inform {
	
	@Id
	@GeneratedValue
	private int nid;
	
	@Column(name="firstname")
	private String informName;
	
	@Column(name="lastname")
	private String informSurname;

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getInformName() {
		return informName;
	}

	public void setInformName(String informName) {
		this.informName = informName;
	}

	public String getInformSurname() {
		return informSurname;
	}

	public void setInformSurname(String informSurname) {
		this.informSurname = informSurname;
	}

	public Inform(int nid, String informName, String informSurname) {
		super();
		this.nid = nid;
		this.informName = informName;
		this.informSurname = informSurname;
	}

	public Inform() {
		super();
	}
	
	

}
