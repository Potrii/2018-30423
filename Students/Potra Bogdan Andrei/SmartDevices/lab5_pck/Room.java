package lab5_pck;

public class Room {

	private String name;
	private SmartDevice[] smartDevices;
	private int numberOfDevice;
	private int maxDevices;

	public Room() {
		this.name = "default-name";
		this.numberOfDevice = 0;
		this.maxDevices = 5;
		this.smartDevices = new SmartDevice[maxDevices];
	}

	public boolean addSmartDevice(SmartDevice device) {
		if (numberOfDevice < maxDevices) {
			smartDevices[numberOfDevice] = device;
			numberOfDevice++;
			return true;
		}
		return false;
	}

	public SmartDevice[] getSmartDevice() {
		return smartDevices;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMaxDevices(int maxDevices) {
		this.maxDevices = maxDevices;
	}

	public int getMaxDevices() {
		return maxDevices;
	}

	public int getNumberOfDevice() {
		return numberOfDevice;
	}

	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Room specifications : name = ").append(name).append("\n");
		
		for (int i = 0; i < numberOfDevice; i++) {
				stringBuilder.append("\t")
							.append(smartDevices[i].getStatus())
							.append("\n");
		}
		return stringBuilder.toString();
	}
}
