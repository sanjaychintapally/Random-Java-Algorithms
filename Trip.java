package com.company;

public class Trip {

    public int getDuration() {
        if(flights.size() > 0) {
            return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size() - 1).getArrivalTime());
        }
        else {
            return 0;
        }
    }

    public int getShortestLayover() {
        int shortestLayover = flights.get(0).getArrivalTime().minutesUntil(flights.get(1).getDepartureTime());
        if(flights.size() >= 2) {
            for(int i = 1; i < flights.size() - 1; i++) {
                if(flights.get(i).getArrivalTime().minutesUntil(flights.get(i + 1).getDepartureTime()) < shortestLayover) {
                    shortestLayover =
                            flights.get(i).getArrivalTime().minutesUntil(flights.get(i + 1).getDepartureTime());
                    return shortestLayover;
                }
            }
        }
        else {
            return -1;
        }
    }



    public static void main(String[] args) {
	// write your code here
    }
}
