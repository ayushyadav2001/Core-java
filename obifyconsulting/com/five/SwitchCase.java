package com.obifyconsulting.com.five;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        String i=sc;
        int day=9;
        switch (day){
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
                case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;

            case 7:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Holiday");
                break;
        }

    }
}
