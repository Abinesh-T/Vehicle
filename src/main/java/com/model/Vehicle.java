package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String Sno;
	private String vID;
	private String vSpeed;
	private String vLt;
	private String vLg;
	public String getvID() {
		return vID;
	}
	public void setvID(String vID) {
		this.vID = vID;
	}
	public String getvSpeed() {
		return vSpeed;
	}
	public void setvSpeed(String vSpeed) {
		this.vSpeed = vSpeed;
	}
	public String getvLt() {
		return vLt;
	}
	public void setvLt(String vLt) {
		this.vLt = vLt;
	}
	public String getvLg() {
		return vLg;
	}
	public void setvLg(String vLg) {
		this.vLg = vLg;
	}
	
	
	
}
