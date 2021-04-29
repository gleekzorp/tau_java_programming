package exercises.chapter9;

public class TasteTester {

    public static void main(String[] args){
        Cake cake = new Cake("Lemon");
        System.out.println(cake.getFlavor());
        System.out.println(cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake("Chocolate");
        System.out.println(birthdayCake.getFlavor());
        System.out.println(birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake("White");
        System.out.println(weddingCake.getFlavor());
        System.out.println(weddingCake.getPrice());
    }
}
