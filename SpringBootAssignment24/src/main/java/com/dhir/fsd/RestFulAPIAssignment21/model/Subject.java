package com.dhir.fsd.RestFulAPIAssignment21.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//@Entity
//@Table(name = "subject")
public class Subject implements Serializable{

	private static final long serialVersionUID = 1L;

//	@Id
  //  @Column(name = "subjectId")
	private long subjectId;
    
    //@Column(name = "subtitle")
    private String subtitle;
	
    //@Column(name = "durationInHours")
    private int durationInHours;
	
   //private Set<Book> references;

	public Subject(long subjectId, String subtitle, int durationInHours) {
		super();
		this.subjectId = subjectId;
		this.subtitle = subtitle;
		this.durationInHours = durationInHours;
	//	this.references = references;
	}
    
	public Subject() {
	}

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public int getDurationInHours() {
		return durationInHours;
	}

	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}

/*	public Set<Book> getReferences() {
		return references;
	}
	public void setReferences(Set<Book> references) {
		this.references = references;
	}*/

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subtitle=" + subtitle + ", durationInHours=" + durationInHours + "]";
	}
}
