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
@Table(name="ITEM")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ITEM_ID")
	private Long itemId;
	@Column(name="NAME")
	private String name;
	@Column(name="MODEL_NO")
	private String modelNo;
	@Column(name="SERIAL_NO")
	private String serialNo;
	@Column(name="MANUFACTURING_DATE")
	private Date manufacturedDate;
	@Column(name="STOCK_ENTRY_DATE")
	private Date stockEntryDate;
	@Column(name="ACTUAL_PRICE")
	private double actualPrice;
	@Column(name="SELLING_PRICE")
	private double sellingPrice;
	@Column(name="SOLD_PRICE")
	private double soldPrice;
	@Column(name="SOLD_STATUS")
	private int soldStatus;//1 = sold , 0 = not sold
	@Column(name="SOLD_DATE")
	private Date soldDate;
	@Column(name="CREATED_DATE")
	private Date createdDate;
	@Column(name="LAST_UPDATED_DATE")
	private Date lastUpdatedDate;
	
	public Item() {
		super();
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public Date getStockEntryDate() {
		return stockEntryDate;
	}

	public void setStockEntryDate(Date stockEntryDate) {
		this.stockEntryDate = stockEntryDate;
	}

	public double getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(double actualPrice) {
		this.actualPrice = actualPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public double getSoldPrice() {
		return soldPrice;
	}

	public void setSoldPrice(double soldPrice) {
		this.soldPrice = soldPrice;
	}

	public int getSoldStatus() {
		return soldStatus;
	}

	public void setSoldStatus(int soldStatus) {
		this.soldStatus = soldStatus;
	}

	public Date getSoldDate() {
		return soldDate;
	}

	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
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
