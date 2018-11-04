package lab5_pck;

import org.junit.Test;
import java.util.*;
public class SmartTest {

	@Test
	public void SmartTest() {

		
		Scanner input = new Scanner(System.in);
		
		Room r1= new Room();
		System.out.println("Input the first room's name please : ");
		r1.setName(input.nextLine());
		
		Room r2 = new Room();
		System.out.println("Input the second room's name please : ");
		r2.setName(input.nextLine());
		
		
		SmartLightBulb l1=new SmartLightBulb();
		System.out.println("First light bulb !");
		l1.setName("Bulb1");
		System.out.println("LightBulb color = ");
		l1.setColor(input.nextLine());
		System.out.println("LightBulb intensity = ");
		l1.setIntensity(input.nextInt());
		input.nextLine();
		
		
		
		SmartLightBulb l2=new SmartLightBulb();
		System.out.println("Second light bulb !");
		l2.setName("Bulb2");
		System.out.println("LightBulb color = ");
		l2.setColor(input.nextLine());
		System.out.println("LightBulb intensity = ");
		l2.setIntensity(input.nextInt());
		input.nextLine();
		
		
		SmartLightBulb l3=new SmartLightBulb();
		System.out.println("Third light bulb !");
		l3.setName("Bulb3");
		System.out.println("LightBulb color = ");
		l3.setColor(input.nextLine());
		System.out.println("LightBulb intensity = ");
		l3.setIntensity(input.nextInt());
		input.nextLine();
		
			
		SmartThermometer t1= new SmartThermometer();
		System.out.println("First termometer !");
		t1.setName("Termo1");
		System.out.println("Termo temperature = ");
		t1.setTemperature(input.nextDouble());
		input.nextLine();
		
		SmartThermometer t2= new SmartThermometer();
		System.out.println("Second termometer !");
		t2.setName("Termo2");
		System.out.println("Termo temperature = ");
		t2.setTemperature(input.nextDouble());
		input.nextLine();
		
// add devices to rooms		
		r1.addSmartDevice(l1);
		r1.addSmartDevice(t1);
		
		r2.addSmartDevice(l2);
		r2.addSmartDevice(l3);
		r2.addSmartDevice(t2);
		
// turn on some devices
		l1.turnOn();
		l2.turnOn();
		t2.turnOn();
		MainController mc1 = new MainController();
		
		
		mc1.addRoom(r1);
		mc1.addRoom(r2);
		
// get status from some devices
		System.out.println(l1.getStatus());
		System.out.println(l2.getStatus());
		System.out.println(t1.getStatus());
		System.out.println(t2.getStatus());
		
// get status from rooms
		
		System.out.println(r1.getStatus());
		System.out.println(r2.getStatus());
		
// main controller methods
		
		System.out.println("We turned on : " + mc1.turnOnAllSmartDevices() + " devices ! Now all devices are turned ON");
		
		
		

		input.close();
		
	}
}
