package com.computer.genuine.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Vishal Chhetri
 */
@Entity
@Table(name="VENDOR")
public class Vendor {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="USER_ID")
private Long user_id;
@Column(name="NAME")
private String name;
@Column(name="CREATED_DATE")
private Date createdDate;
@Column(name="LAST_UPDATED_DATE")
private Date lastUpdDate;
@Column(name = "ACTIVE")
private int status;

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}

@OneToMany(targetEntity=VendorDetails.class,cascade=CascadeType.ALL)
@JoinColumn(name="USER_ID")
private List<VendorDetails> vendorDetailsList;

public Vendor() {
	super();
}

public Long getUser_id() {
	return user_id;
}

public void setUser_id(Long user_id) {
	this.user_id = user_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

public Date getLastUpdDate() {
	return lastUpdDate;
}

public void setLastUpdDate(Date lastUpdDate) {
	this.lastUpdDate = lastUpdDate;
}

public List<VendorDetails> getVendorDetailsList() {
	return vendorDetailsList;
}

public void setVendorDetailsList(List<VendorDetails> vendorDetailsList) {
	this.vendorDetailsList = vendorDetailsList;
}
	
}
