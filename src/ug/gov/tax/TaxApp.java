package ug.gov.tax;

import ug.gov.common.SecurityUtils;

public class TaxApp {
    public static void main(String[]args) {
        System.out.println("Initializing Uganda Revenue Authority (URA) Tax Collection Service ...");
        SecurityUtils.verifyClearance("Tax Collection & Compliance Department");

        System.out.println("Tax records processed and secured successfully");
    }
}