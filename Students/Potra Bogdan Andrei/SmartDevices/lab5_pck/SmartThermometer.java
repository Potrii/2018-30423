package lab5_pck;

public class SmartThermometer extends SmartDevice {

	private double temperature;

	public SmartThermometer() {
		this.temperature = 0;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	@Override
	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder(super.getStatus());
		return stringBuilder.append("Temperature = ")
							.append(temperature)
							.append(". ")
							.toString();
	}

}
