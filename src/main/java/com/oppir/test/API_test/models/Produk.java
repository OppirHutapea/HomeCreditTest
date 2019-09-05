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
public class Produk {
	@Id
	private int produkid;
	private String namaproduk;
	private int jumlahproduk;
	private String deskripsiproduk;
	private double hargaproduk;
	private int kategoriid;
	
	
	public Produk() {
	}


	public Produk(int produkid, String namaproduk, int jumlahproduk, String deskripsiproduk, double hargaproduk,
			int kategoriid) {
		super();
		this.produkid = produkid;
		this.namaproduk = namaproduk;
		this.jumlahproduk = jumlahproduk;
		this.deskripsiproduk = deskripsiproduk;
		this.hargaproduk = hargaproduk;
		this.kategoriid = kategoriid;
	}


	public int getProdukid() {
		return produkid;
	}


	public void setProdukid(int produkid) {
		this.produkid = produkid;
	}


	public String getNamaproduk() {
		return namaproduk;
	}


	public void setNamaproduk(String namaproduk) {
		this.namaproduk = namaproduk;
	}


	public int getJumlahproduk() {
		return jumlahproduk;
	}


	public void setJumlahproduk(int jumlahproduk) {
		this.jumlahproduk = jumlahproduk;
	}


	public String getDeskripsiproduk() {
		return deskripsiproduk;
	}


	public void setDeskripsiproduk(String deskripsiproduk) {
		this.deskripsiproduk = deskripsiproduk;
	}


	public double getHargaproduk() {
		return hargaproduk;
	}


	public void setHargaproduk(double hargaproduk) {
		this.hargaproduk = hargaproduk;
	}


	public int getKategoriid() {
		return kategoriid;
	}


	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}
	
	
	
	
}
