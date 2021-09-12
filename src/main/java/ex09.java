/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex09 {
    // square feet 1 gallon of paint covers
    static final int COVERAGE = 350;
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("How many feet long? ");
        int length = inScan.nextInt();
        System.out.print("How many feet wide?");
        int width = inScan.nextInt();
        int area = length * width;
        int neededGal = area / COVERAGE;
        if (area % COVERAGE != 0){
            neededGal ++;
        }
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.\n", neededGal, area);
    }
}
