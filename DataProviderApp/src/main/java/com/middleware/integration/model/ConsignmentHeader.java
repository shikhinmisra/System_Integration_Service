package com.middleware.integration.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Controller;

@XmlRootElement
@Controller
@Entity(name="CONSIGNMENT_HEADER")
public class ConsignmentHeader {
	
	@Id
	@Column(name="CONSIGNMENT_ID")
	private int consignmentId;
	@Column(name="ORDER_ID")
	private int orderId;
	@Column(name="BU_CODE")
	private String buCode;
	@Column(name="DATE_OF_ORDER")
	private Date dateOfOrder;
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	public ConsignmentHeader() {
		
	}
	
	
public int getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(int consignmentId) {
		this.consignmentId = consignmentId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getBuCode() {
		return buCode;
	}
	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


}
