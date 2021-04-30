package exercises.chapter10;

public class Banana extends Fruit{

    public Banana(){

    }

    public Banana(int calories){
        setCalories(calories);
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made with only " + calories + " Calories");
    }

    public void peel(){
        System.out.println("Peel the banana");
    }
}
