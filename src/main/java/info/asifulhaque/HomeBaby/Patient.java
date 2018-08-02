package info.asifulhaque.HomeBaby;

public class Patient {
	private int patientId;
	private String patientName;
	private Address address;
	
	public static Patient getInstance(int patientId, String patientName) {
		System.out.println("Creating Patient using factory method ");
		return new Patient(123,"Jyoti");
	}
	public void onCreate() {
		System.out.println("Patient Created:-" + this);
	}

	public void onDestroy() {
		System.out.println("Patient Object Destroyed :( ");
	}

	public Patient() {

	}

	public Patient(int patientId, String patientName) {
		this.patientId = patientId;
		this.patientName = patientName;

	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", address=" + address + "]";
	}

}
