package exercises.chapter6;

public class PhoneBillCalculator {

    public static void main(String[] arg){
        PhoneBillTeacherSolution bill1 = new PhoneBillTeacherSolution();
        bill1.printItemizedBill();
        System.out.println("-----------");

        PhoneBillTeacherSolution bill2 = new PhoneBillTeacherSolution(123);
        bill2.printItemizedBill();
        System.out.println("-----------");

        PhoneBillTeacherSolution bill3 = new PhoneBillTeacherSolution(123, 79.99, 500, 600);
        bill3.printItemizedBill();
        System.out.println("-----------");

        PhoneBillTeacherSolution bill4 = new PhoneBillTeacherSolution(1234, 79.99, 500, 600);
        bill4.setId(12345);
        bill4.setBaseCost(69.99);
        bill4.setAllottedMinutes(1000);
        bill4.setMinutesUsed(1250);
        System.out.println(bill4.getId());
        System.out.println(bill4.getBaseCost());
        System.out.println(bill4.getAllottedMinutes());
        System.out.println(bill4.getMinutesUsed());
        bill4.printItemizedBill();
    }
}
