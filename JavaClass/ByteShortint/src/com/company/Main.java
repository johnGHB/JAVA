package com.company;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
	    int myMinValue=-2147483648;
        int myMaxValue=2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal ="+myTotal);

        // byte has a width of 8
        byte mybytevalue=-128;
        byte myNewByteValue = (byte) (mybytevalue/2);
        System.out.println("myNewByteValue ="+myNewByteValue);

        // short has a width of 16
        short myshortvalue=32767;

        // long a width of 64
        long mylongvalue=100L;

    }
}
