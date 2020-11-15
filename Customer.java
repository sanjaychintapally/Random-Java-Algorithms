package com.company;

public class Customer {

    private String customerName;
    private int num;

    public Customer(String name, int idNum) {
        customerName = name;
        num = idNum;
    }

    public String getName() {
        return customerName;
    }

    public int getID() {
        return num;
    }

    public int compareCustomer(Customer other) {
        int compareNum = getName().compareTo(other.getName());
        if(compareNum == 0) {
            return getID() - other.getID();
        }
        return compareNum;
    }

    public prefixMerge(Customer[] list1, Customer[] list2, Customer[] result) {
        for(int i = 0);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
