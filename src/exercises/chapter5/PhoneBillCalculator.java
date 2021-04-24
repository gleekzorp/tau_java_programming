package exercises.chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        double overageRate = 0.25;
        double taxRate = 0.15;

        double planFee = getPlanFee();
        int overageMinutes = getOverageMinutes();
        scanner.close();

        double overageFees = calculateOverageFees(overageMinutes, overageRate);
        double subTotal = calculateSubTotal(overageFees, planFee);
        double tax = calculateTax(subTotal, taxRate);
        double total = calculateFinalTotal(planFee, overageFees, tax);
        printItemizedBill(planFee, overageFees, tax, total);
    }

    public static double getPlanFee(){
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }

    public static int getOverageMinutes(){
        System.out.println("Enter overage minutes:");
        return scanner.nextInt();
    }

    public static double calculateOverageFees(double overageMinutes, double overageRate){
        return overageMinutes * overageRate;
    }

    public static double calculateSubTotal(double overageFee, double planFee) {
        return overageFee + planFee;
    }

    public static double calculateTax(double subTotal, double taxRate){
        return subTotal * taxRate;
    }

    public static double calculateFinalTotal(double planFee, double overageFees, double tax){
        return planFee + overageFees + tax;
    }

    public static void printItemizedBill(double plan, double overage, double tax, double total){
        System.out.println("Plan: $" + String.format("%.2f", plan));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
