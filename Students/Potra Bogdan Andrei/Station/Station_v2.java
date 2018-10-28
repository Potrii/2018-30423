package oop.first.pkg;

public class Station_v2 {

	private Bus[] arrayOfBusses;
	private int numberOfBusses;
	private String stationName;
	private int stationCapacity;
	
	// station constructor
	public Station_v2(String stationName, int numberOfBusses, int stationCapacity)
	{
		if(numberOfBusses > stationCapacity) System.out.println("Error. The busses exceed the station capacity !");
		else
		{
			this.stationName = stationName;
			this.numberOfBusses = numberOfBusses;
			this.stationCapacity =stationCapacity;
			this.arrayOfBusses= new Bus[stationCapacity];
		}
	}
	
	
	// stationName set & get
	public void setStationName( String stationName)
	{
		this.stationName=stationName;
	}
	
	public String getStationName()
	{
		return stationName;
	}
	
	// add a bus to the station
	public void addBus(Bus newBus)
	{
		if(numberOfBusses < stationCapacity)
		{
			arrayOfBusses[numberOfBusses]=newBus;
			numberOfBusses++;
		}
		else System.out.println("Tried to add bus number " + (numberOfBusses+1) +" but station is full. Can't add another bus!");
		
	}
	
	public void printBusses()
	{
		if(numberOfBusses == 0) System.out.println("Station is empty , no busses to display !");
		else
		{
			for(int i = 0; i < numberOfBusses; i++)
			{
				if(arrayOfBusses[i]!=null)
				 System.out.println("Bus number " + i + " : " + arrayOfBusses[i].getBrand() + 
						 " " + arrayOfBusses[i].getColor() + " " + arrayOfBusses[i].getNumber() + " " +arrayOfBusses[i].getSeats() );
			}
		}
	}
	
	public void getBusOut(int number)
	{
		boolean found=false;
		int position=-1;
		for(int i=0;i<this.numberOfBusses && found == false;i++)
		{
			if(this.arrayOfBusses[i].getNumber() == number)
			{
				position=i;
				found=true;
				System.out.println("We found bus " +number + " at position " + position);
			}
		}
		if(position != -1 && found == true)
		{
			for(int i=position;i<this.numberOfBusses-1;i++)
			{
				this.arrayOfBusses[i]=this.arrayOfBusses[i+1];
			}
			System.out.println("We eliminated bus " + number );
			this.numberOfBusses--;
		}
		
		
		if(found == false) System.out.println("The bus with the number " + number +" could not be found !");
	}
	
	
}
