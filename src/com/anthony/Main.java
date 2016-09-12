package com.anthony;
import java.util.Scanner;
public class Main {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {

	    // Average heating bill program
        // String Array to store the months
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        // Double array to store the each months bill
        double[] heatingBills = new double[12];
        // For loop to get the
        for (int month = 0; month < months.length; month++){
            System.out.print("Enter your bill for " + months[month] + ": ");
            heatingBills[month] = numberScanner.nextDouble();
        }
        // Create variable to store the total cost for heating for the year
        double billTotal = 0;
        // Create for loop to add each months bill to a total
        for (int billMonth = 0; billMonth < months.length; billMonth++){
            billTotal += heatingBills[billMonth];
        }

        // Print table of bills with their months
        for (int month = 0; month < months.length; month++){
            if (months[month].length() < 6){
                System.out.println("The bill in " + months[month] + ": \t\t$" + heatingBills[month]);
            } else {
                System.out.println("The bill in " + months[month] + ": \t$" + heatingBills[month]);
            }
        }
        // Print the average bill per month
        System.out.println("Your average bill is: \t$" + billTotal / months.length);



//        String names[] = {"Ann", "Beth", "Cat"};
//        System.out.println("Printing names");
//        int numberOfNames = names.length;
//        System.out.println("There are " + numberOfNames + " names");
//        //Try to print out all the data
//        for (int x = 0 ; x <= 3 ; x++) {
//            System.out.println(names[x]);
//        }




        // Close Scanners
        numberScanner.close();
        stringScanner.close();
    }

}
