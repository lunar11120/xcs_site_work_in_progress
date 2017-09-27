package com.emp.mvc.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="MAS_PRODUCTGROUP")
public class Products {
	
	@Id
	@Column(name="PRODUCTID")
	private int pid;
	
	@Column(name="GROUPNAMETH")
	private String pname;
	
	@OneToMany(targetEntity = LineProduct.class , mappedBy = "productName" , fetch=FetchType.EAGER)
	private List<LineProduct> line;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<LineProduct> getLine() {
		return line;
	}

	public void setLine(List<LineProduct> line) {
		this.line = line;
	}

	public Products(int pid, String pname, List<LineProduct> line) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.line = line;
	}

	public Products() {
		super();
	}

	@Override
	public String toString() {
		return "Products [pname=" + pname + "]";
	}

	
	
	
}
