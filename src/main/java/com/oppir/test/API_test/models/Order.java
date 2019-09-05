package com.oppir.test.API_test.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Order {
	@Id
	private int orderid;
	private int userid;
	private int produkid;
	private double potongan;
	private double totalharga;
	private int jlhorder;
	private Date tglorder;
	
	
	public Order() {
		super();
	}


	public Order(int orderid, int userid, int produkid, double potongan, double totalharga, int jlhorder,
			Date tglorder) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.produkid = produkid;
		this.potongan = potongan;
		this.totalharga = totalharga;
		this.jlhorder = jlhorder;
		this.tglorder = tglorder;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public int getProdukid() {
		return produkid;
	}


	public void setProdukid(int produkid) {
		this.produkid = produkid;
	}


	public double getPotongan() {
		return potongan;
	}


	public void setPotongan(double potongan) {
		this.potongan = potongan;
	}


	public double getTotalharga() {
		return totalharga;
	}


	public void setTotalharga(double totalharga) {
		this.totalharga = totalharga;
	}


	public int getJlhorder() {
		return jlhorder;
	}


	public void setJlhorder(int jlhorder) {
		this.jlhorder = jlhorder;
	}


	public Date getTglorder() {
		return tglorder;
	}


	public void setTglorder(Date tglorder) {
		this.tglorder = tglorder;
	}
	
	
	
}
