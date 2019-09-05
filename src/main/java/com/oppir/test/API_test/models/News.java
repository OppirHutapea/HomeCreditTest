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
public class News {
	@Id
	private int newsid;
	private String namanews;
	private String contentnews;
	private Date tglnews;
	private String status;
	
	
	public News() {
		super();
	}


	public News(int newsid, String namanews, String contentnews, Date tglnews, String status) {
		super();
		this.newsid = newsid;
		this.namanews = namanews;
		this.contentnews = contentnews;
		this.tglnews = tglnews;
		this.status = status;
	}


	public int getNewsid() {
		return newsid;
	}


	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}


	public String getNamanews() {
		return namanews;
	}


	public void setNamanews(String namanews) {
		this.namanews = namanews;
	}


	public String getContentnews() {
		return contentnews;
	}


	public void setContentnews(String contentnews) {
		this.contentnews = contentnews;
	}


	public Date getTglnews() {
		return tglnews;
	}


	public void setTglnews(Date tglnews) {
		this.tglnews = tglnews;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
