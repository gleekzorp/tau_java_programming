package exercises.chapter10;

public class Apple extends Fruit{

    public Apple(){

    }

    public Apple(int calories){
        this.calories = calories;
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }

    public void removeSeeds(){
        System.out.println("remove apple seeds");
    }
}
