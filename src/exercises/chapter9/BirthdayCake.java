package exercises.chapter9;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake(String flavor){
        super(flavor);
        setPrice(19.99);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
