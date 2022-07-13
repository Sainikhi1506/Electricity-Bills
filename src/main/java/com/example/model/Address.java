package com.example.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addressId;
	private int flatOrHouseNumber;
	private String buildingName;
	private String landmark;
	private String village;
	private String taluka;
	private String district;
	private String state;
	private String pincode;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public int getFlatOrHouseNumber() {
		return flatOrHouseNumber;
	}
	public void setFlatOrHouseNumber(int flatOrHouseNumber) {
		this.flatOrHouseNumber = flatOrHouseNumber;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addressId, buildingName, district, flatOrHouseNumber, landmark, pincode, state, taluka,
				village);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(addressId, other.addressId) && Objects.equals(buildingName, other.buildingName)
				&& Objects.equals(district, other.district) && flatOrHouseNumber == other.flatOrHouseNumber
				&& Objects.equals(landmark, other.landmark) && Objects.equals(pincode, other.pincode)
				&& Objects.equals(state, other.state) && Objects.equals(taluka, other.taluka)
				&& Objects.equals(village, other.village);
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", flatOrHouseNumber=" + flatOrHouseNumber + ", buildingName="
				+ buildingName + ", landmark=" + landmark + ", village=" + village + ", taluka=" + taluka
				+ ", district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
	}

	

}
