package oop.first.pkg;

public class Bus {

	
	// those are privates
	private String brand;
	private String color;
	private int nbOfSeats;
	private int number;
	
	public Bus()
	{
		this.brand="default-brand";
		this.color="default-color";
		this.nbOfSeats=52;
		System.out.println("Creating a new bus !\n");
	}
	public Bus(String brand,String color, int nbOfSeats, int number)
	{
		this.brand=brand;
		this.color=color;
		this.nbOfSeats=nbOfSeats;
		this.number=number;
	}
	
	public void drive(String sourceCity, String destinationCity)
	{
		System.out.println("I'll drive from " + sourceCity + " to " + destinationCity);
	}
	
	public void setBrand(String Brand)
	{
		this.brand=Brand;
	}
	public void setColor(String Color)
	{
		this.color =Color;
	}
	public void setSeats(int nbOfSeats)
	{
		this.nbOfSeats=nbOfSeats;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getColor()
	{
		return color;
	}
	public int getSeats()
	{
		return nbOfSeats;
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number =number;
	}
	
	public void showInfo()
	{
		System.out.println("I am bus number " + number + " brand = " + this.brand + " , color = "+ this.color + ", seats = " + this.nbOfSeats);
	}
	
}
