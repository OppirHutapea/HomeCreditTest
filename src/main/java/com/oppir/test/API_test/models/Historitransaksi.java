package com.oppir.test.API_test.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Historitransaksi {
	@Id
	private int historitransaksi;
	private int orderid;
	private String status;
	
	
	public Historitransaksi() {
		super();
	}


	public Historitransaksi(int historitransaksi, int orderid, String status) {
		super();
		this.historitransaksi = historitransaksi;
		this.orderid = orderid;
		this.status = status;
	}


	public int getHistoritransaksi() {
		return historitransaksi;
	}


	public void setHistoritransaksi(int historitransaksi) {
		this.historitransaksi = historitransaksi;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
