package com.emp.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name="OPS_LAWBREAKER")
public class LawBreaker {
	
	@Id
	private int id;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name="LAWBREAKER_OPSNOTICE")
	private Opsnotice owner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Opsnotice getOwner() {
		return owner;
	}

	public void setOwner(Opsnotice owner) {
		this.owner = owner;
	}

	public LawBreaker(int id, String firstName, String lastName, Opsnotice owner) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.owner = owner;
	}

	public LawBreaker() {
		super();
	}

	@Override
	public String toString() {
		return "LawBreaker [firstName=" + firstName + "]";
	}

	



}
