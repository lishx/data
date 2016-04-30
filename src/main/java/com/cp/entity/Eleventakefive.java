package com.cp.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eleventakefive database table.
 * 
 */
@Entity
@NamedQuery(name="Eleventakefive.findAll", query="SELECT e FROM Eleventakefive e")
public class Eleventakefive implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String eid;

	private String bai;

	private String ge;

	private String qian;

	private String qihao;

	private String shi;

	private String wan;

	public Eleventakefive() {
	}

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getBai() {
		return this.bai;
	}

	public void setBai(String bai) {
		this.bai = bai;
	}

	public String getGe() {
		return this.ge;
	}

	public void setGe(String ge) {
		this.ge = ge;
	}

	public String getQian() {
		return this.qian;
	}

	public void setQian(String qian) {
		this.qian = qian;
	}

	public String getQihao() {
		return this.qihao;
	}

	public void setQihao(String qihao) {
		this.qihao = qihao;
	}

	public String getShi() {
		return this.shi;
	}

	public void setShi(String shi) {
		this.shi = shi;
	}

	public String getWan() {
		return this.wan;
	}

	public void setWan(String wan) {
		this.wan = wan;
	}

}