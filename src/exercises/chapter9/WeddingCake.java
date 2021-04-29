package exercises.chapter9;

public class WeddingCake extends Cake{
    int tiers;

    public WeddingCake(String flavor){
        super(flavor);
        setPrice(49.99);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
