package lab5_pck;

import java.math.*;
import java.util.Random;

public class SmartDevice {

	private int id;
	private String name;
	private boolean turnedOn;

	public SmartDevice() {
		this.id = IdGenerator.getNextId();
		this.name = "default-name";
		this.turnedOn = false;
	}

	public void turnOn() {
		this.turnedOn = true;
	}

	public void turnOff() {
		this.turnedOn = false;
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
			StringBuilder stringBuilder = new StringBuilder();
			return stringBuilder.append("Device specifications : id = ")
								.append(id)
								.append(", name  = ")
								.append(name)
								.append(", turnedOn = ")
								.append(turnedOn)
								.append(". ")
								.toString();
	}

}
