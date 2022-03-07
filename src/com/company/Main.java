package com.company;

import java.util.*;
import java.text.DecimalFormat;


public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00"); //Decimal format for money
        Scanner user = new Scanner(System.in); //User input
        double amount, currency, Pound, Euro, Yen, AUD, CAD, MXN; //Defined variables



        System.out.println("Hi! Welcome to my Currency Converter!"); //Welcome message

        //CURRENCY THE USER WANTS TO CONVERT TO
        System.out.println("Select a currency to be converted (Select a number) "); //Select a currency
        System.out.println("1.USD to Pound \n2.USD to Euro \n3.USD to Yen \n4.USD to AUD " +
                "\n5.USD to CAD \n6.USD to MXN ");//Currency Options
        currency = user.nextInt(); // Wait for response


        //AMOUNT OF MONEY BEING USED
        System.out.println("How much money are you using today? (Just the number)"); //Choose amount of money
        amount = user.nextFloat(); // Wait for response

        //CURRENCY CONVERSIONS
        if (currency == 1) {
            Pound = amount * 0.76;

            System.out.println(amount + " US Dollars" + " is " + df.format(Pound) + " Pounds");//POUNDS CONVERSION

        } else if (currency == 2) {
            Euro = amount * 0.88;

            System.out.println(amount + " Dollars" + " is " + df.format(Euro) + " Euros");//EURO CONVERSION
        } else if (currency == 3) {
            Yen = amount * 113.72;

            System.out.println(amount + " Dollars" + " is " + df.format(Yen) + " Yens");//YENS CONVERSION
        } else if (currency == 4) {
            AUD = amount * 1.39;

            System.out.println(amount + " Dollars" + " is " + df.format(AUD) + " AUD");//AUD CONVERSION
        } else if (currency == 5) {
            CAD = amount * 1.27;

            System.out.println(amount + " Dollars" + " is " + df.format(CAD) + " CAD");//CAD CONVERSION
        } else if (currency == 6) {
            MXN = amount * 20.94;

            System.out.println(amount + " Dollars" + " is " + df.format(MXN) + " MXN");//MXN CONVERSION
        }
    }
}







