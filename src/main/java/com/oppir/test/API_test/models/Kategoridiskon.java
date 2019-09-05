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
public class Kategoridiskon {
	@Id
	private int kategoriid;
	private String tipe;
	
	
	public Kategoridiskon() {
		super();
	}


	public Kategoridiskon(int kategoriid, String tipe) {
		super();
		this.kategoriid = kategoriid;
		this.tipe = tipe;
	}


	public int getKategoriid() {
		return kategoriid;
	}


	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}


	public String getTipe() {
		return tipe;
	}


	public void setTipe(String tipe) {
		this.tipe = tipe;
	}
	
	
}
