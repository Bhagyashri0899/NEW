package com.cg.shoppingmall.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import javax.persistence.InheritanceType;


@Entity
@Table(name="shop")
@Inheritance(strategy=InheritanceType.JOINED)
public class Shop 
{
	
	@Id
	@Column(name="shopId")
    private int shopId;
	
	@Column(name="shopCategory")
    private String shopCategory;  
	
	@Column(name="shopEmployeeId")
    private Employee shopEmployeeId; 
	
	@Column(name="shopName")
    private String shopName;
	
	@Column(name="customers")
    private String customers;
	
	@Column(name="shopStatus")
    private String shopStatus;
	
	@Column(name="shopOwner")
    private ShopOwner shopOwner;
	
	@Column(name="leaseStatus")
    private String leaseStatus;
    
    
    
    
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	
	public Employee getShopEmployeeId() {
		return shopEmployeeId;
	}
	public void setShopEmployeeId(Employee shopEmployeeId) {
		this.shopEmployeeId = shopEmployeeId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCustomers() {
		return customers;
	}
	public void setCustomers(String customers) {
		this.customers = customers;
	}
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
	
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	public ShopOwner getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}

	
	
}