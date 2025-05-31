package com;


public class Travel  {
	public boolean isCarDriver (Driver driver) {
		if(driver.getcategory()=="Car"){
		return true;
	}
		return false;			
     }
	public String retrivebyDriverid(Driver[] driver,int driverid) {
		for (Driver d: driver) {
		if (driverid ==d.getdriverid()){
			return "Drivername is:"+ d.getdrivername()+"belonging to the categoary:"+ d.getcategory();
			
		}
		}
		return  "Driver is not found for given ID.";
	}
		
	 public int retrieveCountOfDriver(Driver[] drivers, String category) {
		 int count =0;
	     for (Driver d:drivers) {
	     if (d.getcategory().equals(category)){
	     count++;
	           }
	     }
	     System.out.println(count);
		return count;
		
	 }	
   	 public Driver[]retrivedriver(Driver[]driver,String category){
   	 Driver arr[] = new Driver[2];
   	 int j=0;
	 for(Driver d:driver) {
	  if(category==d.getcategory()) {
	    arr[j]= d;
	    j++;
	    }
		}
	 
		return arr;
   	 }
	
		public Driver retriveMaximumDistanceTravelledDriver(Driver[] driver) {
        double distance =0;
	    Driver maxdistancetravelobject= null;
	    for(Driver d:driver) {
	    if (d.gettotaldistance()>distance) {
	    maxdistancetravelobject=d;
	    distance =d.gettotaldistance();
	    }
	    }
	    return maxdistancetravelobject;
	    }
     	 
   	}				
		
		
	
