package com.emp.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="MAS_INDICTMENT")
public class Indictment {
	
	@Id
	@GeneratedValue
	private int nid;
	
	@Column(name="GUILT_BASE")
	private String guildBase;
	
	
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getGuildBase() {
		return guildBase;
	}
	
	
	public void setGuildBase(String guildBase) {
		this.guildBase = guildBase;
	}
	public Indictment(int nid, String guildBase) {
		super();
		this.nid = nid;
		this.guildBase = guildBase;
	}
	public Indictment() {
		super();
	}
	
	

}
