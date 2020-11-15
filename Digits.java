package com.company;
import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<Integer>();
        if(num == 0){
            digitList.add(0);
        }
        while(num > 0) {
            digitList.add(0, num % 10);
            num = num / 10;
        }
    }

    public ArrayList<Integer> returnDigitList() {
        return digitList;
    }

    public boolean isStrictlyIncreasing() {
        for(int i = 0; i < digitList.size() - 1; i++) {
            if (digitList.get(i) >= digitList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Digits newDigit = new Digits(11234);
        System.out.println(newDigit.returnDigitList());
        System.out.println(newDigit.isStrictlyIncreasing());
    }
}
