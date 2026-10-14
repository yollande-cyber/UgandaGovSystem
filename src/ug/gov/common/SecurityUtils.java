package ug.gov.common;

public class SecurityUtils {
    public static void verifyClearance(String department) {
        System.out.println("[SECURE ACCESS] Verified clearance for government department: " + department);
    }
}