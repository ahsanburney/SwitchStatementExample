package com.ahsanburney;

public class Main {

    public static void main(String[] args) {
	int value = 3;
	if (value == 1) {
        System.out.println("Value was 1");
    } else if (value == 2){
        System.out.println("Value was 2");
    }else {
        System.out.println("Value was 1 or 2");
    }

    int switchValue =1;

    switch(switchValue){
        case 1:
            System.out.println("Value was 1");
            break;

        case 2:
            System.out.println("Value was 2");
            break;

        default:
                System.out.println("Was not 1 or 2");
    }

    char ch = 'F';

    switch (ch){
        case 'A':
            System.out.println("Value was A");
            break;

        case 'B':
            System.out.println("Value was B");
            break;

        case 'C':
            System.out.println("Value was c");
            break;

        case 'D':
            System.out.println("Value was D");
            break;

        case 'E':
            System.out.println("Value was E");
            break;

        default:
            System.out.println("Any thing else");
    }

    String month = "January";
    switch (month){
        case "January":
            System.out.println("Month is january");
            break;

        default:
            System.out.println("Other month");
    }
    }
}
