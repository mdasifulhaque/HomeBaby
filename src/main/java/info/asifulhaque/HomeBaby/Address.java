package info.asifulhaque.HomeBaby;

public class Address {

	private String houseName, flatNo, areaName, policeStation, district, division, postCode;
	public Address() {
		
	}

	public Address(String houseName, String flatNo, String areaName, String policeStation, String district,
			String division, String postCode) {
		this.houseName = houseName;
		this.flatNo = flatNo;
		this.areaName = areaName;
		this.policeStation = policeStation;
		this.district = district;
		this.division = division;
		this.postCode = postCode;
	}

	public void destroy() {
		System.out.println("Address Destroy:- " + this);
	}

	public String getAreaName() {
		return areaName;
	}

	public String getDistrict() {
		return district;
	}

	public String getDivision() {
		return division;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public String getHouseName() {
		return houseName;
	}

	public String getPoliceStation() {
		return policeStation;
	}

	public String getPostCode() {
		return postCode;
	}

	public void init() {
		System.out.println("Address Created :-" + this);
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Address [houseName=" + houseName + ", flatNo=" + flatNo + ", areaName=" + areaName + ", policeStation="
				+ policeStation + ", district=" + district + ", division=" + division + ", postCode=" + postCode + "]";
	}

}
