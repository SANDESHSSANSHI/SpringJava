package com.tnsif.placement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placement {
	
	private Integer id;

	private String jobtitle;
	private float salary;
	private String company;
	
	public Placement() {
		super();
	}

	public Placement(Integer id, String jobtitle, float salary, String company) {
	    super();
	    this.id = id;
	    this.jobtitle = jobtitle;
	    this.salary = salary;
	    this.company = company; 
	}

	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Placement [id=" + id + ", jobtitle=" + jobtitle + ", salary=" + salary + ", company=" + company
				+ ", getCompany()=" + getCompany() + ", getId()=" + getId() + ", getJobtitle()=" + getJobtitle()
				+ ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
}
