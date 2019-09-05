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
public class Modulekategori {
	@Id
	private int modulekategoriid;
	private String namamodule;
	private int moduleorder;
	private int groupid;
	
	public Modulekategori() {
		super();
	}

	public Modulekategori(int modulekategoriid, String namamodule, int moduleorder, int groupid) {
		super();
		this.modulekategoriid = modulekategoriid;
		this.namamodule = namamodule;
		this.moduleorder = moduleorder;
		this.groupid = groupid;
	}

	public int getModulekategoriid() {
		return modulekategoriid;
	}

	public void setModulekategoriid(int modulekategoriid) {
		this.modulekategoriid = modulekategoriid;
	}

	public String getNamamodule() {
		return namamodule;
	}

	public void setNamamodule(String namamodule) {
		this.namamodule = namamodule;
	}

	public int getModuleorder() {
		return moduleorder;
	}

	public void setModuleorder(int moduleorder) {
		this.moduleorder = moduleorder;
	}

	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
}
