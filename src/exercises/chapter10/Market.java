package exercises.chapter10;

public class Market {

    static public void main(String[] args){

        Fruit fruit = new Fruit();
        fruit.setCalories(100);
        System.out.println(fruit.getCalories());
        fruit.makeJuice();
        System.out.println("----");

        Banana banana = new Banana(200);
        System.out.println(banana.getCalories());
        banana.makeJuice();
        banana.peel();
        System.out.println("----");

        Fruit apple = new Apple(120);
        System.out.println(apple.getCalories());
        apple.makeJuice();
        ((Apple) apple).removeSeeds();
        System.out.println("----");

        squeeze(fruit);
        squeeze(banana);
        squeeze(apple);
    }

    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}
