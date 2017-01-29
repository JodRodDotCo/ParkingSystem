package com.mfu.parkingsystem;

public class CalculateBankNote {

	public int[] receiveMoney(int money) {
		int retuneBill[] = new int[5];
		int bankMoney[] = {500,100,50,20,10};
		
		for (int i = 0; i< bankMoney.length; i++) {
			retuneBill[i] = money/bankMoney[i];
			money %= bankMoney[i];
		}
		
		return retuneBill;
	}
}
