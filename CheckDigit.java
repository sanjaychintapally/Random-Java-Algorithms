package com.company;

public class CheckDigit {

    public int getCheck(int num) {
        int sum = 0;
        for(int i = 1; i <= getNumberOfDigits(num); i++) {
        sum = sum + (getDigit(num, i) * (8 - i));
        }
        return getDigit(sum, getNumberOfDigits(sum));
    }

    public boolean isValid(int numWithCheckDigit) {
        int lastDigit = numWithCheckDigit % 10;
        return lastDigit == getCheck(numWithCheckDigit / 10);
    }

    public int getDigit(int num, int n) {
        for(int i = 1; i <= (getNumberOfDigits(num) - n); i++) {
            num = (num / 10);

        }
        return (num % 10);
    }

    public int getNumberOfDigits(int num) {
        int digitCount = 0;
        while(num > 0) {
            num = num / 10;
            digitCount++;
        }
        return digitCount;
    }

    public static void main(String[] args) {
        CheckDigit newDigit = new CheckDigit();
        System.out.println(newDigit.getNumberOfDigits(38567));
        System.out.println(newDigit.getDigit(38567, 1));
    }
}
