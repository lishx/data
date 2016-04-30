package com.cp.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ssc database table.
 * 
 */
@Entity
@NamedQuery(name="Ssc.findAll", query="SELECT s FROM Ssc s")
public class Ssc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nd2;

	private String qihao;

	private String rd3;

	private String st1;

	private String th4;

	private String th5;

	private String th6;

	private String th7;

	public Ssc() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNd2() {
		return this.nd2;
	}

	public void setNd2(String nd2) {
		this.nd2 = nd2;
	}

	public String getQihao() {
		return this.qihao;
	}

	public void setQihao(String qihao) {
		this.qihao = qihao;
	}

	public String getRd3() {
		return this.rd3;
	}

	public void setRd3(String rd3) {
		this.rd3 = rd3;
	}

	public String getSt1() {
		return this.st1;
	}

	public void setSt1(String st1) {
		this.st1 = st1;
	}

	public String getTh4() {
		return this.th4;
	}

	public void setTh4(String th4) {
		this.th4 = th4;
	}

	public String getTh5() {
		return this.th5;
	}

	public void setTh5(String th5) {
		this.th5 = th5;
	}

	public String getTh6() {
		return this.th6;
	}

	public void setTh6(String th6) {
		this.th6 = th6;
	}

	public String getTh7() {
		return this.th7;
	}

	public void setTh7(String th7) {
		this.th7 = th7;
	}

}