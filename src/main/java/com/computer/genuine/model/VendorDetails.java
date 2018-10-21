package com.computer.genuine.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vishal Chhetri
 *
 */
@Entity
@Table(name="VENDOR_DETAILS")
public class VendorDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private long user_id;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="PRIMARY_CONTACT_NO")
	private String primaryContactNo;
	@Column(name="SECONDARY_CONTACT_NO")
	private String secondaryContactNo;
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;
	@Column(name = "ACTIVE")
	private int status;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public VendorDetails() {
		super();
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrimaryContactNo() {
		return primaryContactNo;
	}
	public void setPrimaryContactNo(String primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
	}
	public String getSecondaryContactNo() {
		return secondaryContactNo;
	}
	public void setSecondaryContactNo(String secondaryContactNo) {
		this.secondaryContactNo = secondaryContactNo;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	
	
	
}
