package com.example.techcorp;

import com.example.techcorp.domain.Company;

public class Main {

    public static void main(String[] args) {

        Company blueSoft = new Company(
                "BlueSoft",
                40000,
                22000,
                5000,
                3000,
                4000    // marketing
        );

        Company redTech = new Company(
                "RedTech",
                50000,
                25000,
                6000,
                4000,
                3000
        );

        System.out.println("=== BLUE SOFT ===");
        blueSoft.printSummary();

        System.out.println();
        System.out.println("=== RED TECH ===");
        redTech.printSummary();

        System.out.println();
        if (blueSoft.calculateProfit() > redTech.calculateProfit()) {
            System.out.println("BlueSoft is more profitable.");
        } else {
            System.out.println("RedTech is more profitable.");
        }
    }
}