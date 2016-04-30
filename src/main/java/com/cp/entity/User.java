package com.cp.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String usericon;

	private String username;

	private String userpsd;

	public User() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsericon() {
		return this.usericon;
	}

	public void setUsericon(String usericon) {
		this.usericon = usericon;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpsd() {
		return this.userpsd;
	}

	public void setUserpsd(String userpsd) {
		this.userpsd = userpsd;
	}

}