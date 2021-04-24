package exercises.chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private double allottedMinutes;
    private double minutesUsed;

    public PhoneBill(){
        id = 0;
        baseCost = 89.99;
        allottedMinutes = 400;
        minutesUsed = 400;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 89.99;
        allottedMinutes = 400;
        minutesUsed = 400;
    }

    public PhoneBill(int id, double baseCost, double allottedMinutes, double minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(double allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverages(){
        if (minutesUsed <= allottedMinutes) {
            return 0;
        }
        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return (baseCost + calculateOverages()) * taxRate;
    }

    public double calculateTotalBill(){
        return baseCost + calculateOverages() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverages()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotalBill()));
    }
}
