package com.mfu.parkingsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPlateNumberTest {

	@Test
	public void FindPlateNumberAndReturnFounded() {
		CheckPlateNumber checkPlateNumber = new CheckPlateNumber();
		String plateNumber = "กอก 123";
		assertEquals(true, checkPlateNumber.find(plateNumber));
	}
	
	@Test
	public void FindPlateNumberAndReturnNotFound() {
		CheckPlateNumber checkPlateNumber = new CheckPlateNumber();
		String plateNumber = "กอก 999";
		assertEquals(false, checkPlateNumber.find(plateNumber));
	}

}
