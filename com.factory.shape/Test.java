package com.factory.shape;

import java.util.Scanner;

interface Vehicle{
	void driveVehicle();
}
//Implemented Class
class TwoWheeler implements Vehicle{
	public void driveVehicle(){
		System.out.println("Driving Two Wheeler:");
	}
}
//Implemented Class
class FourWheeler implements Vehicle{
	public void driveVehicle() {
		System.out.println("Driving Four Wheeler:");
	}
}
//Implemented Class
class SixWheeler implements Vehicle{
	public void driveVehicle() {
		System.out.println("Driving Six Wheeler:");
	}
}
class FactoryVehicle{
	public static Vehicle testVehicle(String us) {
		if(us.equals("Two")) {
			return new TwoWheeler();
		}
		else if(us.equals("Four")){
			return new FourWheeler();
		}
		else {
			return null;
		}
	}
}
class User{
	
	public void drive() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Vehicle Want to drive:");
		String Veh = scan.next();
		Vehicle rs = FactoryVehicle.testVehicle(Veh);
		rs.driveVehicle();
	}
}

public class Test {

	public static void main(String[] args) {
		User usr = new User();
		usr.drive();
	}

}
