package com.mfu.parkingsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateParkingChangeTest {
	CalculateParkingChange money = new CalculateParkingChange(); 
	
	//getChange(reciveMoney ,parkingPrice)
	@Test
	public void Calculate_PayMoney_100_Cost10() {
		assertEquals(90, money.getChange(100,10));
	}
	
	@Test
	public void Calculate_PayMoney_1000_Cost400() {
		assertEquals(600, money.getChange(1000,400));
	}
	
	@Test
	public void Calculate_PayMoney_fail() {
		assertEquals(-1, money.getChange(10,999));
		
		
	}

}
