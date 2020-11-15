package com.company;

public class BatteryCharger {

    private int[] rateTable;

    public BatteryCharger() {
        rateTable = new int[]{50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200,
                180, 180, 140, 100, 80, 60};
    }

    private int getChargingCost(int startHour, int chargeTime) {
        int totalCost = 0;
        for(int i = startHour; i < startHour + chargeTime; i++) {
            totalCost += rateTable[i % 24];
        }
        return totalCost;
    }

    public int getChargeStartTime(int chargeTime) {
        int minCost = getChargingCost(0, chargeTime);
        int startTime = 0;
        for(int i = 1; i <= 23; i++) {
            if(getChargingCost(i, chargeTime) < minCost) {
                minCost = getChargingCost(i, chargeTime);
                startTime = i;
            }
        }
        return startTime;
    }

    public static void main(String[] args) {
	    BatteryCharger newCar = new BatteryCharger();
	    System.out.println(newCar.getChargingCost(22, 7));
	    System.out.println(newCar.getChargeStartTime(7));
    }
}
