package com.emp.mvc.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.deploy.uitoolkit.impl.fx.ui.resources.Deployment;

@Entity(name="LINEPRODUCT")
public class LineProduct {
	
	@Id
	private int Id;	

	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "NID")
	private Opsnotice noticeno;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="PRODUCTID")
	private Products productName;

	public int getLineId() {
		return Id;
	}

	public void setLineId(int Id) {
		this.Id = Id;
	}

	public Opsnotice getNoticeno() {
		return noticeno;
	}

	public void setNoticeno(Opsnotice noticeno) {
		this.noticeno = noticeno;
	}

	public Products getProductName() {
		return productName;
	}

	public void setProductName(Products productName) {
		this.productName = productName;
	}

	public LineProduct() {
		super();
	}

	@Override
	public String toString() {
		return "LineProduct [productName=" + productName + "]";
	}
	
	
	
	
}