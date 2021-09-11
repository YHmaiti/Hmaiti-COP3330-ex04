/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// Create a simple mad-lib program that prompts for a noun, a verb,
// an adverb, and an adjective and injects those into a story
// as described by the assignment prompt.

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // prompt the user for a noun and store it in a string
        // variable called noun
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        // prompt the user for a verb and store it in a string
        // variable called verb
        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        // prompt the user for an adjective and store it in a string
        // variable called adjective
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        // prompt the user for an adverb and store it in a string
        // variable called adverb
        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        // Output statement built based on the assignment indications
        // using string interpolation
        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "?" + " That's hilarious!" );

    }
}
