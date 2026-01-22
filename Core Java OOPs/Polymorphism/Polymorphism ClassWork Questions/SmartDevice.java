// 30/12/25

public class SmartDevice {
	String deviceName;
	String os;
	int batteryCapacity;
	
	public SmartDevice() {
		this.deviceName = "Name";
		this.os = "Andriod";
		this.batteryCapacity = 890;
	}
	
	public SmartDevice(String deviceName) {
		this();
		this.deviceName = deviceName;
	}
	public SmartDevice(String deviceName, String os) {
		this();
		this.deviceName = deviceName;
		this.os = os;
	}
	public SmartDevice(String deviceName, String os, int batteryCapacity) {
		this.deviceName = deviceName;
		this.os = os;
		this.batteryCapacity = batteryCapacity;
	}
}
