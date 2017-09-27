package com.emp.mvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.emp.mvc.services.NoticeUtil;


@Entity(name="OPS_NOTICE")
@NamedQuery(name="findByName",
			query="SELECT e FROM OPS_NOTICE e WHERE e.noticeNumber LIKE :text"+" OR e.department LIKE :text")
										  
public class Opsnotice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nid;
	
	@Column(name="noticeno")
	private String noticeNumber;
	
	private String department;
	
	private String noticedate;
	
	private String noticetime;
	
	
	@Column(name="OPS_PRODUCT")
	private String opsProduct;
	
	@OneToOne
	@PrimaryKeyJoinColumn 
	private Inform inform;
	
	@OneToOne
	@PrimaryKeyJoinColumn 
	private Indictment indictment;
	
	@OneToOne
	@PrimaryKeyJoinColumn 
	private OpsLocation opsLocation_external;
	
	@OneToMany(mappedBy="owner", fetch=FetchType.EAGER)
	private List<LawBreaker> LawBreakers = new ArrayList<LawBreaker>();
	
	@OneToMany(targetEntity = LineProduct.class , mappedBy = "noticeno" , fetch=FetchType.EAGER)
	private List<LineProduct> line;
	



	

	public void setLawBreakers(List<LawBreaker> lawBreakers) {
		LawBreakers = lawBreakers;
	}




	public OpsLocation getOpsLocation_external() {
		return opsLocation_external;
	}




	public void setOpsLocation_external(OpsLocation opsLocation_external) {
		this.opsLocation_external = opsLocation_external;
	}




	public List<LineProduct> getLine() {
		return line;
	}




	public void setLine(List<LineProduct> line) {
		this.line = line;
	}







	public Opsnotice(int nid, String noticeNumber, String department, String noticedate, String noticetime,
			 String opsProduct, Inform inform, Indictment indictment, List<LawBreaker> lawBreakers) {
		super();
		this.nid = nid;
		this.noticeNumber = noticeNumber;
		this.department = department;
		this.noticedate = noticedate;
		this.noticetime = noticetime;
		this.opsProduct = opsProduct;
		this.inform = inform;
		this.indictment = indictment;
		LawBreakers = lawBreakers;
	}




	public Opsnotice() {
		super();
	}




	public int getNid() {
		return nid;
	}




	public void setNid(int nid) {
		this.nid = nid;
	}




	public String getNoticeNumber() {
		return noticeNumber;
	}




	public void setNoticeNumber(String noticeNumber) {
		this.noticeNumber = noticeNumber;
	}




	public String getDepartment() {
		return department;
	}




	public void setDepartment(String department) {
		this.department = department;
	}




	public String getNoticedate() {		
		String cdate = NoticeUtil.convertDataFormat(noticedate);
		return cdate;
	}




	public void setNoticedate(String noticedate) {
		
		this.noticedate = noticedate;
	}




	public String getNoticetime() {
		return noticetime;
	}




	public void setNoticetime(String noticetime) {
		this.noticetime = noticetime;
	}




	public String getOpsProduct() {
		return opsProduct;
	}




	public void setOpsProduct(String opsProduct) {
		this.opsProduct = opsProduct;
	}


	public Inform getInform() {
		return inform;
	}

	public void setInform(Inform inform) {
		this.inform = inform;
	}


	public Indictment getIndictment() {
		return indictment;
	}


	public void setIndictment(Indictment indictment) {
		this.indictment = indictment;
	}


	public List<LawBreaker> getLawBreakers() {
		return LawBreakers;
	}




	



	
	
	

}
