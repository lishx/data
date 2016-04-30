package com.cp.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cqssc database table.
 * 
 */
@Entity
@NamedQuery(name="Cqssc.findAll", query="SELECT c FROM Cqssc c")
public class Cqssc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String eid;

	private String bai;

	private String cqsscnum;

	@Lob
	private String firstnmh;

	private String fiveduibi;

	private String ge;

	@Lob
	private String last11new8;

	@Lob
	private String last200;

	@Lob
	private String last4200;

	@Lob
	private String last4jdjh;

	@Lob
	private String last4jx;

	@Lob
	private String last4jxjh;

	@Lob
	private String last4kdh;

	@Lob
	private String last4lxh;

	@Lob
	private String last4nmhh;

	@Lob
	private String last4xth;

	@Lob
	private String last5jx;

	@Lob
	private String lastcount;

	@Lob
	private String lastsho;

	@Lob
	private String lastshuzhu301;

	@Lob
	private String lastshuzhu302;

	@Lob
	private String lastshuzhu303;

	@Lob
	private String lastshuzhu304;

	@Lob
	private String lastshuzhu305;

	@Lob
	private String lastshuzhu306;

	@Lob
	private String lastshuzhu307;

	@Lob
	private String lastshuzhu308;

	@Lob
	private String lastshuzhu309;

	@Lob
	private String lastshuzhu310;

	@Lob
	private String lastshuzhu311;

	@Lob
	private String lastshuzhu312;

	@Lob
	private String lastshuzhu313;

	@Lob
	private String lastshuzhu314;

	@Lob
	private String lastshuzhu315;

	@Lob
	private String lastshuzhu316;

	@Lob
	private String lastshuzhu317;

	@Lob
	private String lastshuzhu318;

	@Lob
	private String lastshuzhu319;

	@Lob
	private String lastshuzhu320;

	@Lob
	private String lastshuzhu321;

	@Lob
	private String lastshuzhu322;

	@Lob
	private String lastshuzhu323;

	@Lob
	private String lastshuzhu324;

	@Lob
	private String lastshuzhu325;

	@Lob
	private String lastshuzhu326;

	@Lob
	private String lastshuzhu327;

	@Lob
	private String lastshuzhu328;

	@Lob
	private String lastshuzhu329;

	@Lob
	private String lastshuzhu330;

	@Lob
	private String lastshuzhu331;

	@Lob
	private String lastshuzhu332;

	@Lob
	private String lastshuzhu333;

	@Lob
	private String lastshuzhu334;

	@Lob
	private String lastshuzhu335;

	@Lob
	private String lastshuzhu336;

	@Lob
	private String lastshuzhu337;

	@Lob
	private String lastshuzhu338;

	@Lob
	private String lastshuzhu339;

	@Lob
	private String lastshuzhu340;

	@Lob
	private String lastshuzhu341;

	@Lob
	private String lastshuzhu342;

	@Lob
	private String lastshuzhu343;

	@Lob
	private String lastshuzhu344;

	@Lob
	private String lastshuzhu442a;

	@Lob
	private String lastshuzhu444a;

	@Lob
	private String lastshuzhu498012;

	private String qian;

	private String qihao;

	private String shi;

	private String threeduibi;

	private String wan;

	public Cqssc() {
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

	public String getCqsscnum() {
		return this.cqsscnum;
	}

	public void setCqsscnum(String cqsscnum) {
		this.cqsscnum = cqsscnum;
	}

	public String getFirstnmh() {
		return this.firstnmh;
	}

	public void setFirstnmh(String firstnmh) {
		this.firstnmh = firstnmh;
	}

	public String getFiveduibi() {
		return this.fiveduibi;
	}

	public void setFiveduibi(String fiveduibi) {
		this.fiveduibi = fiveduibi;
	}

	public String getGe() {
		return this.ge;
	}

	public void setGe(String ge) {
		this.ge = ge;
	}

	public String getLast11new8() {
		return this.last11new8;
	}

	public void setLast11new8(String last11new8) {
		this.last11new8 = last11new8;
	}

	public String getLast200() {
		return this.last200;
	}

	public void setLast200(String last200) {
		this.last200 = last200;
	}

	public String getLast4200() {
		return this.last4200;
	}

	public void setLast4200(String last4200) {
		this.last4200 = last4200;
	}

	public String getLast4jdjh() {
		return this.last4jdjh;
	}

	public void setLast4jdjh(String last4jdjh) {
		this.last4jdjh = last4jdjh;
	}

	public String getLast4jx() {
		return this.last4jx;
	}

	public void setLast4jx(String last4jx) {
		this.last4jx = last4jx;
	}

	public String getLast4jxjh() {
		return this.last4jxjh;
	}

	public void setLast4jxjh(String last4jxjh) {
		this.last4jxjh = last4jxjh;
	}

	public String getLast4kdh() {
		return this.last4kdh;
	}

	public void setLast4kdh(String last4kdh) {
		this.last4kdh = last4kdh;
	}

	public String getLast4lxh() {
		return this.last4lxh;
	}

	public void setLast4lxh(String last4lxh) {
		this.last4lxh = last4lxh;
	}

	public String getLast4nmhh() {
		return this.last4nmhh;
	}

	public void setLast4nmhh(String last4nmhh) {
		this.last4nmhh = last4nmhh;
	}

	public String getLast4xth() {
		return this.last4xth;
	}

	public void setLast4xth(String last4xth) {
		this.last4xth = last4xth;
	}

	public String getLast5jx() {
		return this.last5jx;
	}

	public void setLast5jx(String last5jx) {
		this.last5jx = last5jx;
	}

	public String getLastcount() {
		return this.lastcount;
	}

	public void setLastcount(String lastcount) {
		this.lastcount = lastcount;
	}

	public String getLastsho() {
		return this.lastsho;
	}

	public void setLastsho(String lastsho) {
		this.lastsho = lastsho;
	}

	public String getLastshuzhu301() {
		return this.lastshuzhu301;
	}

	public void setLastshuzhu301(String lastshuzhu301) {
		this.lastshuzhu301 = lastshuzhu301;
	}

	public String getLastshuzhu302() {
		return this.lastshuzhu302;
	}

	public void setLastshuzhu302(String lastshuzhu302) {
		this.lastshuzhu302 = lastshuzhu302;
	}

	public String getLastshuzhu303() {
		return this.lastshuzhu303;
	}

	public void setLastshuzhu303(String lastshuzhu303) {
		this.lastshuzhu303 = lastshuzhu303;
	}

	public String getLastshuzhu304() {
		return this.lastshuzhu304;
	}

	public void setLastshuzhu304(String lastshuzhu304) {
		this.lastshuzhu304 = lastshuzhu304;
	}

	public String getLastshuzhu305() {
		return this.lastshuzhu305;
	}

	public void setLastshuzhu305(String lastshuzhu305) {
		this.lastshuzhu305 = lastshuzhu305;
	}

	public String getLastshuzhu306() {
		return this.lastshuzhu306;
	}

	public void setLastshuzhu306(String lastshuzhu306) {
		this.lastshuzhu306 = lastshuzhu306;
	}

	public String getLastshuzhu307() {
		return this.lastshuzhu307;
	}

	public void setLastshuzhu307(String lastshuzhu307) {
		this.lastshuzhu307 = lastshuzhu307;
	}

	public String getLastshuzhu308() {
		return this.lastshuzhu308;
	}

	public void setLastshuzhu308(String lastshuzhu308) {
		this.lastshuzhu308 = lastshuzhu308;
	}

	public String getLastshuzhu309() {
		return this.lastshuzhu309;
	}

	public void setLastshuzhu309(String lastshuzhu309) {
		this.lastshuzhu309 = lastshuzhu309;
	}

	public String getLastshuzhu310() {
		return this.lastshuzhu310;
	}

	public void setLastshuzhu310(String lastshuzhu310) {
		this.lastshuzhu310 = lastshuzhu310;
	}

	public String getLastshuzhu311() {
		return this.lastshuzhu311;
	}

	public void setLastshuzhu311(String lastshuzhu311) {
		this.lastshuzhu311 = lastshuzhu311;
	}

	public String getLastshuzhu312() {
		return this.lastshuzhu312;
	}

	public void setLastshuzhu312(String lastshuzhu312) {
		this.lastshuzhu312 = lastshuzhu312;
	}

	public String getLastshuzhu313() {
		return this.lastshuzhu313;
	}

	public void setLastshuzhu313(String lastshuzhu313) {
		this.lastshuzhu313 = lastshuzhu313;
	}

	public String getLastshuzhu314() {
		return this.lastshuzhu314;
	}

	public void setLastshuzhu314(String lastshuzhu314) {
		this.lastshuzhu314 = lastshuzhu314;
	}

	public String getLastshuzhu315() {
		return this.lastshuzhu315;
	}

	public void setLastshuzhu315(String lastshuzhu315) {
		this.lastshuzhu315 = lastshuzhu315;
	}

	public String getLastshuzhu316() {
		return this.lastshuzhu316;
	}

	public void setLastshuzhu316(String lastshuzhu316) {
		this.lastshuzhu316 = lastshuzhu316;
	}

	public String getLastshuzhu317() {
		return this.lastshuzhu317;
	}

	public void setLastshuzhu317(String lastshuzhu317) {
		this.lastshuzhu317 = lastshuzhu317;
	}

	public String getLastshuzhu318() {
		return this.lastshuzhu318;
	}

	public void setLastshuzhu318(String lastshuzhu318) {
		this.lastshuzhu318 = lastshuzhu318;
	}

	public String getLastshuzhu319() {
		return this.lastshuzhu319;
	}

	public void setLastshuzhu319(String lastshuzhu319) {
		this.lastshuzhu319 = lastshuzhu319;
	}

	public String getLastshuzhu320() {
		return this.lastshuzhu320;
	}

	public void setLastshuzhu320(String lastshuzhu320) {
		this.lastshuzhu320 = lastshuzhu320;
	}

	public String getLastshuzhu321() {
		return this.lastshuzhu321;
	}

	public void setLastshuzhu321(String lastshuzhu321) {
		this.lastshuzhu321 = lastshuzhu321;
	}

	public String getLastshuzhu322() {
		return this.lastshuzhu322;
	}

	public void setLastshuzhu322(String lastshuzhu322) {
		this.lastshuzhu322 = lastshuzhu322;
	}

	public String getLastshuzhu323() {
		return this.lastshuzhu323;
	}

	public void setLastshuzhu323(String lastshuzhu323) {
		this.lastshuzhu323 = lastshuzhu323;
	}

	public String getLastshuzhu324() {
		return this.lastshuzhu324;
	}

	public void setLastshuzhu324(String lastshuzhu324) {
		this.lastshuzhu324 = lastshuzhu324;
	}

	public String getLastshuzhu325() {
		return this.lastshuzhu325;
	}

	public void setLastshuzhu325(String lastshuzhu325) {
		this.lastshuzhu325 = lastshuzhu325;
	}

	public String getLastshuzhu326() {
		return this.lastshuzhu326;
	}

	public void setLastshuzhu326(String lastshuzhu326) {
		this.lastshuzhu326 = lastshuzhu326;
	}

	public String getLastshuzhu327() {
		return this.lastshuzhu327;
	}

	public void setLastshuzhu327(String lastshuzhu327) {
		this.lastshuzhu327 = lastshuzhu327;
	}

	public String getLastshuzhu328() {
		return this.lastshuzhu328;
	}

	public void setLastshuzhu328(String lastshuzhu328) {
		this.lastshuzhu328 = lastshuzhu328;
	}

	public String getLastshuzhu329() {
		return this.lastshuzhu329;
	}

	public void setLastshuzhu329(String lastshuzhu329) {
		this.lastshuzhu329 = lastshuzhu329;
	}

	public String getLastshuzhu330() {
		return this.lastshuzhu330;
	}

	public void setLastshuzhu330(String lastshuzhu330) {
		this.lastshuzhu330 = lastshuzhu330;
	}

	public String getLastshuzhu331() {
		return this.lastshuzhu331;
	}

	public void setLastshuzhu331(String lastshuzhu331) {
		this.lastshuzhu331 = lastshuzhu331;
	}

	public String getLastshuzhu332() {
		return this.lastshuzhu332;
	}

	public void setLastshuzhu332(String lastshuzhu332) {
		this.lastshuzhu332 = lastshuzhu332;
	}

	public String getLastshuzhu333() {
		return this.lastshuzhu333;
	}

	public void setLastshuzhu333(String lastshuzhu333) {
		this.lastshuzhu333 = lastshuzhu333;
	}

	public String getLastshuzhu334() {
		return this.lastshuzhu334;
	}

	public void setLastshuzhu334(String lastshuzhu334) {
		this.lastshuzhu334 = lastshuzhu334;
	}

	public String getLastshuzhu335() {
		return this.lastshuzhu335;
	}

	public void setLastshuzhu335(String lastshuzhu335) {
		this.lastshuzhu335 = lastshuzhu335;
	}

	public String getLastshuzhu336() {
		return this.lastshuzhu336;
	}

	public void setLastshuzhu336(String lastshuzhu336) {
		this.lastshuzhu336 = lastshuzhu336;
	}

	public String getLastshuzhu337() {
		return this.lastshuzhu337;
	}

	public void setLastshuzhu337(String lastshuzhu337) {
		this.lastshuzhu337 = lastshuzhu337;
	}

	public String getLastshuzhu338() {
		return this.lastshuzhu338;
	}

	public void setLastshuzhu338(String lastshuzhu338) {
		this.lastshuzhu338 = lastshuzhu338;
	}

	public String getLastshuzhu339() {
		return this.lastshuzhu339;
	}

	public void setLastshuzhu339(String lastshuzhu339) {
		this.lastshuzhu339 = lastshuzhu339;
	}

	public String getLastshuzhu340() {
		return this.lastshuzhu340;
	}

	public void setLastshuzhu340(String lastshuzhu340) {
		this.lastshuzhu340 = lastshuzhu340;
	}

	public String getLastshuzhu341() {
		return this.lastshuzhu341;
	}

	public void setLastshuzhu341(String lastshuzhu341) {
		this.lastshuzhu341 = lastshuzhu341;
	}

	public String getLastshuzhu342() {
		return this.lastshuzhu342;
	}

	public void setLastshuzhu342(String lastshuzhu342) {
		this.lastshuzhu342 = lastshuzhu342;
	}

	public String getLastshuzhu343() {
		return this.lastshuzhu343;
	}

	public void setLastshuzhu343(String lastshuzhu343) {
		this.lastshuzhu343 = lastshuzhu343;
	}

	public String getLastshuzhu344() {
		return this.lastshuzhu344;
	}

	public void setLastshuzhu344(String lastshuzhu344) {
		this.lastshuzhu344 = lastshuzhu344;
	}

	public String getLastshuzhu442a() {
		return this.lastshuzhu442a;
	}

	public void setLastshuzhu442a(String lastshuzhu442a) {
		this.lastshuzhu442a = lastshuzhu442a;
	}

	public String getLastshuzhu444a() {
		return this.lastshuzhu444a;
	}

	public void setLastshuzhu444a(String lastshuzhu444a) {
		this.lastshuzhu444a = lastshuzhu444a;
	}

	public String getLastshuzhu498012() {
		return this.lastshuzhu498012;
	}

	public void setLastshuzhu498012(String lastshuzhu498012) {
		this.lastshuzhu498012 = lastshuzhu498012;
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

	public String getThreeduibi() {
		return this.threeduibi;
	}

	public void setThreeduibi(String threeduibi) {
		this.threeduibi = threeduibi;
	}

	public String getWan() {
		return this.wan;
	}

	public void setWan(String wan) {
		this.wan = wan;
	}

}