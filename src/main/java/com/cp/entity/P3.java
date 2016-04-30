package com.cp.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the p3 database table.
 * 
 */
@Entity
@NamedQuery(name="P3.findAll", query="SELECT p FROM P3 p")
public class P3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String kbai;

	private String kge;

	private String kshi;

	private String qihao;

	public P3() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKbai() {
		return this.kbai;
	}

	public void setKbai(String kbai) {
		this.kbai = kbai;
	}

	public String getKge() {
		return this.kge;
	}

	public void setKge(String kge) {
		this.kge = kge;
	}

	public String getKshi() {
		return this.kshi;
	}

	public void setKshi(String kshi) {
		this.kshi = kshi;
	}

	public String getQihao() {
		return this.qihao;
	}

	public void setQihao(String qihao) {
		this.qihao = qihao;
	}

}