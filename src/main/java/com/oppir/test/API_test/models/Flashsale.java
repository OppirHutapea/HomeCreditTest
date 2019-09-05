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
public class Flashsale {
	@Id
	private int flashsaleid;
	private String namafalshsale;
	private double besarflashsale;
	private Date startdate;
	private Date enddate;
	private String deskripsi;
	private int kategoriid;
	
	
	public Flashsale() {
		super();
	}


	public Flashsale(int flashsaleid, String namafalshsale, double besarflashsale, Date startdate, Date enddate,
			String deskripsi, int kategoriid) {
		super();
		this.flashsaleid = flashsaleid;
		this.namafalshsale = namafalshsale;
		this.besarflashsale = besarflashsale;
		this.startdate = startdate;
		this.enddate = enddate;
		this.deskripsi = deskripsi;
		this.kategoriid = kategoriid;
	}


	public int getFlashsaleid() {
		return flashsaleid;
	}


	public void setFlashsaleid(int flashsaleid) {
		this.flashsaleid = flashsaleid;
	}


	public String getNamafalshsale() {
		return namafalshsale;
	}


	public void setNamafalshsale(String namafalshsale) {
		this.namafalshsale = namafalshsale;
	}


	public double getBesarflashsale() {
		return besarflashsale;
	}


	public void setBesarflashsale(double besarflashsale) {
		this.besarflashsale = besarflashsale;
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
