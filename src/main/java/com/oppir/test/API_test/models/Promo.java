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

public class Promo {
	@Id
	private int promoid;
	private String namapromo;
	private double besarpromo;
	private Date startdate;
	private Date enddate;
	private String deskripsi;
	private int kategoriid;
	
	
	public Promo() {
		super();
	}

	public Promo(int promoid, String namapromo, double besarpromo, Date startdate, Date enddate, String deskripsi,
		int kategoriid) {
		super();
		this.promoid = promoid;
		this.namapromo = namapromo;
		this.besarpromo = besarpromo;
		this.startdate = startdate;
		this.enddate = enddate;
		this.deskripsi = deskripsi;
		this.kategoriid = kategoriid;
	}

	public int getPromoid() {
		return promoid;
	}

	public void setPromoid(int promoid) {
		this.promoid = promoid;
	}

	public String getNamapromo() {
		return namapromo;
	}

	public void setNamapromo(String namapromo) {
		this.namapromo = namapromo;
	}

	public double getBesarpromo() {
		return besarpromo;
	}

	public void setBesarpromo(double besarpromo) {
		this.besarpromo = besarpromo;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}

	public int getKategoriid() {
		return kategoriid;
	}

	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}
	
	
}
