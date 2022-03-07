
public class ElectricityBill {
	private int meterNo;
	private String name;
	private String address;
	public int getMeterNo() {
		return meterNo;
	}
	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return meterNo + " " + name + " " + address; 
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ElectricityBill) {
			ElectricityBill eb = (ElectricityBill) obj;
			if(meterNo == eb.meterNo && name.equals(eb.name) && address.equals(eb.address)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Integer.valueOf(meterNo).hashCode() + name.hashCode() + address.hashCode();
	}

}
