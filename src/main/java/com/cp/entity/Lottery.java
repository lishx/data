package com.cp.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the lottery database table.
 * 
 */
@Entity
@NamedQuery(name="Lottery.findAll", query="SELECT l FROM Lottery l")
public class Lottery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String lid;

	private BigInteger id;

	private int issue;

	private String kbai;

	private String kge;

	private String kshi;

	private String lotteryNumbers;

	private String qihao;

	private String sbai;

	private String sge;

	private String shijihao;

	private String sshi;

	public Lottery() {
	}

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public int getIssue() {
		return this.issue;
	}

	public void setIssue(int issue) {
		this.issue = issue;
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

	public String getLotteryNumbers() {
		return this.lotteryNumbers;
	}

	public void setLotteryNumbers(String lotteryNumbers) {
		this.lotteryNumbers = lotteryNumbers;
	}

	public String getQihao() {
		return this.qihao;
	}

	public void setQihao(String qihao) {
		this.qihao = qihao;
	}

	public String getSbai() {
		return this.sbai;
	}

	public void setSbai(String sbai) {
		this.sbai = sbai;
	}

	public String getSge() {
		return this.sge;
	}

	public void setSge(String sge) {
		this.sge = sge;
	}

	public String getShijihao() {
		return this.shijihao;
	}

	public void setShijihao(String shijihao) {
		this.shijihao = shijihao;
	}

	public String getSshi() {
		return this.sshi;
	}

	public void setSshi(String sshi) {
		this.sshi = sshi;
	}

}