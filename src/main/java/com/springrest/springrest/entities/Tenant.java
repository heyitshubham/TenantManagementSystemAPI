package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tenant {
	
	@Id
	private long tenantId;
	private String name;
	private String phone;
	private String address;
	private Boolean isActive;
	private int roomNum;
	private int houseNum;
	private int rentAmount;
//	private String joiningDate;
	private int prevReading;
	private int currReading;
	private int dueBal;
	private int meterBill;
	
	
	public Tenant(long tenantId, String name, String phone, String address, Boolean isActive, int roomNum, int rentAmount, int prevReading, int currReading, int dueBal, int meterBill, int houseNum) {
		super();
		this.tenantId = tenantId;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.isActive = isActive;
		this.roomNum = roomNum;
		this.houseNum = houseNum;
		this.rentAmount = rentAmount;
//		this.joiningDate = joiningDate;
		this.prevReading = prevReading;
		this.currReading = currReading;
		this.dueBal = dueBal;
		this.meterBill = meterBill;
	}


	public Tenant(int houseNum) {
		super();
		this.houseNum = houseNum;
	}


	public Tenant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return tenantId;
	}


	public void setId(long tenantId) {
		this.tenantId = tenantId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public int getRoomNum() {
		return roomNum;
	}


	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}


	public int getRentAmount() {
		return rentAmount;
	}


	public void setRentAmount(int rentAmount) {
		this.rentAmount = rentAmount;
	}


//	public String getJoiningDate() {
//		return joiningDate;
//	}
//
//
//	public void setJoiningDate(String joiningDate) {
//		this.joiningDate = joiningDate;
//	}


	public int getPrevReading() {
		return prevReading;
	}


	public void setPrevReading(int prevReading) {
		this.prevReading = prevReading;
	}


	public int getCurrReading() {
		return currReading;
	}


	public void setCurrReading(int currReading) {
		this.currReading = currReading;
	}


	public int getDueBal() {
		return dueBal;
	}


	public void setDueBal(int dueBal) {
		this.dueBal = dueBal;
	}


	public int getMeterBill() {
		return meterBill;
	}


	public void setMeterBill(int meterBill) {
		this.meterBill = meterBill;
	}


	@Override
	public String toString() {
		return "Tenant [tenantId1=" + tenantId + ", name=" + name + ", phone=" + phone + ", address=" + address + ", isActive="
				+ isActive + ", roomNum=" + roomNum + ", rentAmount=" + rentAmount + ", prevReading=" + prevReading + ", currReading=" + currReading + ", dueBal=" + dueBal
				+ ", meterBill=" + meterBill + "]";
	}


	public int getHouseNum() {
		return houseNum;
	}


	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}


}
