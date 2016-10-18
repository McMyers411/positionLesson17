package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Position refers to the placement of the Scanner within a String as it scans it.
        // The position is usually referred to as the space between two characters, not on one

        Scanner test = new Scanner("A test string");
        System.out.println(test.next());

        //This will print A since the scanner moves from the beginning of the string to the space after the A, printing whats in between
       
    }
}
