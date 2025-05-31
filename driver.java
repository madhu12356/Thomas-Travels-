package com;

public class Driver {
	private String category;
	private int    driverid;
	private String drivername;
	private double totaldistance;
	
	public Driver(int driverid, String drivername,String category, double totaldistance ) {
		super();
		this.category = category;
		this.driverid= driverid;	
		this.drivername=drivername;
		this.totaldistance=totaldistance;
	}
	 public String getcategory () {
		 return category;
	}
	 public void setcategory(String category) {
		this.category = category;
	 }
     public int getdriverid(){
        return driverid;
     }
     public void setdriverid (int driverid) {
    	 this.driverid= driverid;
     }
     public String getdrivername () {
    	 return drivername;
     }
     public void setdrivername1 (String drivername) {
    	 this.drivername=drivername;
     }
     public double gettotaldistance() {
    	 return totaldistance;
     }
     public void settotaldisctance(double totaldisctance) {
        this.totaldistance = totaldistance;
     }
	@Override
	public String toString() {
		return "Driver [category=" + category + ", driverid=" + driverid + ", drivername=" + drivername
				+ ", totaldistance=" + totaldistance + "]";
	}
    
     }
