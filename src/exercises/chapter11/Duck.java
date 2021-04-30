package exercises.chapter11;

public class Duck extends Animal {

    @Override
    void makeSound() {
        System.out.println("The duck makes a quak quak sound");
    }

    @Override
    public void eat() {
        System.out.println("The duck eats insects");
    }
}
