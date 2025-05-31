package com;

public class Testdriver {
	public static void main(String[] args) {
		Driver driver1 = new Driver (1, "vijay","car",8000);
		Driver driver2 = new Driver (2, "varchas","lorry",6000);
		Driver driver3 = new Driver (3, "rohan","auto",7000);
		Driver driver4 = new Driver (4, "gowhtam","auto",8000);
		Driver driver5 = new Driver (5, "vijay","car",8000);
	
		Travel travel = new Travel();
		Driver[]driver= {driver1, driver2,driver3,driver4,driver5};
	
		boolean isCarDriver = travel.isCarDriver(driver4);
		System.out.println("Is " + driver4.getdrivername() + " a car driver? -> " + isCarDriver);
		System.out.println();
		String retrivebyDriverid = travel.retrivebyDriverid(driver,5);
		System.out.println(retrivebyDriverid);
		System.out.println("");

		int Count = travel.retrieveCountOfDriver(driver, "car");
		System.out.println("Number of car drivers: " + Count);
		System.out.println();
	
        Driver[] autoDriver = travel.retrivedriver(driver, "car");
        System.out.println("Drivers with category 'car':");
        for (Driver d : autoDriver) {
        System.out.println(d);
           }
       System.out.println();
       Driver maxdistancetraveldriver= travel.retriveMaximumDistanceTravelledDriver(driver);
       System.out.println(maxdistancetraveldriver);
}	
}
