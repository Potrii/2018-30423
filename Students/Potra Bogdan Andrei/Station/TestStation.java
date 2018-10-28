package oop.first.pkg;
import java.util.*;

import org.junit.Test;
public class TestStation {

	@Test
	public void Test()
	{

	Scanner cin = new Scanner(System.in);
	
	String stName;
	int stCap;
	
	
	System.out.println("Input the name of the station :");
	stName=cin.nextLine();
	
	System.out.println("Input the capacity of the station ( max number of busses ) : ");
	stCap=cin.nextInt();
	cin.nextLine(); 			//  for \n
	
	Station_v2 myFristStation = new Station_v2(stName,0,stCap);
	
	myFristStation.printBusses();

	Bus b1= new Bus("Mercedes","RED",11,123);
	myFristStation.addBus(b1);
	
	Bus b2= new Bus("Aro","BLACK",33,345);
	myFristStation.addBus(b2);
	
	Bus b3= new Bus("Fiat","BLUE",44,555);
	myFristStation.addBus(b3);
	
	Bus b4= new Bus("Aro","WHITE",55,666);
	myFristStation.addBus(b4);
	
	Bus b5= new Bus("Ferrari","PINK",66,777);
	myFristStation.addBus(b5);
	
	Bus b6= new Bus("Volvo","ORANGE",23,888);
	myFristStation.addBus(b6);
	
	myFristStation.printBusses();
	
	myFristStation.getBusOut(555);
	myFristStation.getBusOut(999);
	
	myFristStation.printBusses();
	
	 cin.close();
	}
}
