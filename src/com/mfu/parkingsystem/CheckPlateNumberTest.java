package com.mfu.parkingsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPlateNumberTest {
	CheckPlateNumber checkPlateNumber = new CheckPlateNumber();
	@Test
	public void FindPlateNumberAndReturnFounded() {
		String plateNumber = "กอก 123";
		assertEquals(true, checkPlateNumber.find(plateNumber));
	}
	
	@Test
	public void FindPlateNumberAndReturnNotFound() {
		String plateNumber = "กอก 999";
		assertEquals(false, checkPlateNumber.find(plateNumber));
	}

}
