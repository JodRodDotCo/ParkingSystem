package com.mfu.parkingsystem;

public class CalculateParkingChange {

	public int getChange(int reciveMoney ,int parkingPrice) {
		if((reciveMoney-parkingPrice)>=0){
			return reciveMoney-parkingPrice;
		}
		return -1;
		 	
	}

}
