package com.cp.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the 3d database table.
 * 
 */
@Entity
@Table(name="3d")
@NamedQuery(name="_d.findAll", query="SELECT _ FROM _d _")
public class _d implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String eight;

	private String five;

	private String four;

	private String kbai;

	private String kge;

	private String kshi;

	private String nine;

	private String one;

	private String qihao;

	private String radio;

	private String sbai;

	private String seven;

	private String sge;

	private String six;

	private String sshi;

	private String ten;

	private String three;

	private String two;

	public _d() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEight() {
		return this.eight;
	}

	public void setEight(String eight) {
		this.eight = eight;
	}

	public String getFive() {
		return this.five;
	}

	public void setFive(String five) {
		this.five = five;
	}

	public String getFour() {
		return this.four;
	}

	public void setFour(String four) {
		this.four = four;
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

	public String getNine() {
		return this.nine;
	}

	public void setNine(String nine) {
		this.nine = nine;
	}

	public String getOne() {
		return this.one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public String getQihao() {
		return this.qihao;
	}

	public void setQihao(String qihao) {
		this.qihao = qihao;
	}

	public String getRadio() {
		return this.radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public String getSbai() {
		return this.sbai;
	}

	public void setSbai(String sbai) {
		this.sbai = sbai;
	}

	public String getSeven() {
		return this.seven;
	}

	public void setSeven(String seven) {
		this.seven = seven;
	}

	public String getSge() {
		return this.sge;
	}

	public void setSge(String sge) {
		this.sge = sge;
	}

	public String getSix() {
		return this.six;
	}

	public void setSix(String six) {
		this.six = six;
	}

	public String getSshi() {
		return this.sshi;
	}

	public void setSshi(String sshi) {
		this.sshi = sshi;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getThree() {
		return this.three;
	}

	public void setThree(String three) {
		this.three = three;
	}

	public String getTwo() {
		return this.two;
	}

	public void setTwo(String two) {
		this.two = two;
	}

}