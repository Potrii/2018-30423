package lab5_pck;

public class MainController {

	private Room[] rooms;
	private int maxRooms;
	private int roomNumber;

	public MainController() {
		this.maxRooms = 10;
		this.roomNumber = 0;
		this.rooms = new Room[maxRooms];
	}

	public String getStatus() {
		return "a";
	}

	public int turnOffAllSmartDevices() {
		int i, j;
		int counter = 0; 
		for (i = 0; i < roomNumber; i++) {
			for (j = 0; j < rooms[i].getNumberOfDevice(); j++) {
				if (rooms[i].getSmartDevice()[j].isTurnedOn() == true) {
					counter++;
					rooms[i].getSmartDevice()[j].turnOff();
				}
			}
		}
		return counter;
	}
	
	public int turnOnAllSmartDevices() {
		int i, j;
		int counter = 0; 
		for (i = 0; i < roomNumber; i++) {
			for (j = 0; j < rooms[i].getNumberOfDevice(); j++) {
				if (rooms[i].getSmartDevice()[j].isTurnedOn() == false) {
					counter++;
					rooms[i].getSmartDevice()[j].turnOn();
				}
			}
		}
		return counter;
	}
	
	public SmartDevice[] getAllSmartDevices()
	{
		SmartDevice[] allDevices= new SmartDevice[50];
		int i,j,k=0;
		for(i=0;i<roomNumber;i++)
		{
			for(j=0;j<rooms[i].getNumberOfDevice();j++)
			{
				allDevices[k]=rooms[i].getSmartDevice()[j];
				k++;
			}
		}
		return allDevices;
	}
	
	public void addRoom(Room room)
	{
		if(this.roomNumber < maxRooms) 
		{
			rooms[roomNumber]=room;
			roomNumber++;
		}
		
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getRoomNumber() {
		return this.roomNumber;
	}

	public void setMaxRooms(int maxRooms) {
		this.maxRooms = maxRooms;
	}

	public int getMaxRooms() {
		return maxRooms;
	}
}
