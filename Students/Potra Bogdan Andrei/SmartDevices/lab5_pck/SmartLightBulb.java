package lab5_pck;

public class SmartLightBulb extends SmartDevice {

	private String color;
	private int intensity;

	public SmartLightBulb() {
		this.color = "default-color";
		this.intensity = 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}
	
	@Override
	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder(super.getStatus());
		return stringBuilder.append("Color = ")
							.append(color)
							.append(", light intensity = ")
							.append(intensity)
							.append(". ")
							.toString();
	}

}
