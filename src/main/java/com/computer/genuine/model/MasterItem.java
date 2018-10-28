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
 *
 */
@Entity
@Table(name = "MASTER_ITEM")
public class MasterItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MASTER_ITEM_ID")
	private Long id;
	@Column(name="BRAND")
	private String brand;
	@Column(name="TYPE_ID")
	private int typeId;
	@Column(name="TYPE_NAME")
	private String typeName;
	@Column(name="QUANTITY")
	private int quantity;
	@Column(name="WARRANTY")
	private String waranty;
	@Column(name="STOCK_ON_HAND_NOTIFY")
	private int stockOnHandNotify;
	@Column(name="CREATED_DATE")
	private Date createdDate;
	@Column(name="LAST_UPDATED_DATE")
	private Date lastUpdatedDate;
	@OneToMany(targetEntity=Item.class,cascade=CascadeType.ALL)
	@JoinColumn(name="MASTER_ITEM_ID")
	private List<Item> itemList;
	
	public MasterItem() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getStockOnHandNotify() {
		return stockOnHandNotify;
	}

	public void setStockOnHandNotify(int stockOnHandNotify) {
		this.stockOnHandNotify = stockOnHandNotify;
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
	
	
	public String getWaranty() {
		return waranty;
	}

	public void setWaranty(String waranty) {
		this.waranty = waranty;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	
}
