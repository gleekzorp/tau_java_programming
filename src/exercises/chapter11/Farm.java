package exercises.chapter11;

public class Farm {

    public static void main(String[] args){
        Pig pig = new Pig();
        pig.makeSound();
        pig.eat();

        Animal pig2 = new Pig();
        pig2.makeSound();
        pig2.eat();

        Duck duck = new Duck();
        duck.makeSound();
        duck.eat();
    }
}
