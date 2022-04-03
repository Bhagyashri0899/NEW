package com.cg.shopping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="shop")
public class Shop
{
	@Id
    private int shopId;
    private String shopCategory;   
    private Employee shopEmployeeId;    
    private String shopName;
    private String customers;
    private String shopStatus;  
    private ShopOwner shopOwner;    
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
