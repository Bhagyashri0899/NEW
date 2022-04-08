package com.cg.shoppingmall.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetails implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
    private int id;
	
	@Column(name="dateOfPurchase")
    private String dateOfPurchase;
	
	@Column(name="total")
    private float total;
	
//@ManyToOne
	//@JoinColumn(name="customer_id")
	//private Customer customer_id;
	
	//@Column(name="shop")
    // private Shop shop_id;
	@Column( name="paymentmode")
	private String paymentMode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

}
