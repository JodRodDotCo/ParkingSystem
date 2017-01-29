package com.mfu.parkingsystem;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateBankNoteTest {
	
	CalculateBankNote money = new CalculateBankNote();
	@Test
	public void CalculateBankGet500(){
		int[] expectedResult = {1,0,0,0,0};
		assertArrayEquals(expectedResult,money.receiveMoney(500));
		
	}

	@Test
	public void CalculateBankGet100(){
		int[] expectedResult = {0,1,0,0,0};
		assertArrayEquals(expectedResult,money.receiveMoney(100));
		
	}

	@Test
	public void CalculateBankGet50(){
		int[] expectedResult = {0,0,1,0,0};
		assertArrayEquals(expectedResult,money.receiveMoney(50));
		
	}
	
	@Test
	public void CalculateBankGet20(){
		int[] expectedResult = {0,0,0,1,0};
		assertArrayEquals(expectedResult,money.receiveMoney(20));
		
	}
	
	@Test
	public void CalculateBankGet10(){
		int[] expectedResult = {0,0,0,0,1};
		assertArrayEquals(expectedResult,money.receiveMoney(10));
		
	}
	
	@Test
	public void CalculateBankGet780(){
		int[] expectedResult = {1,2,1,1,1};
		assertArrayEquals(expectedResult,money.receiveMoney(780));
		
	}
	
	@Test
	public void CalculateBankGet910(){
		int[] expectedResult = {1,4,0,0,1};
		assertArrayEquals(expectedResult,money.receiveMoney(910));
		
	}

}
