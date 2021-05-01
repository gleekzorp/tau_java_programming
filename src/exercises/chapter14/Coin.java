package exercises.chapter14;

import java.util.Random;

public class Coin {
    private String side;
    private final String HEADS = "Heads";
    private final String TAILS = "Tails";

    public String getSide() {
        return side;
    }

    public String getHEADS() {
        return HEADS;
    }

    public String getTAILS() {
        return TAILS;
    }

    public void flip(){
        String[] coinOptions = {HEADS, TAILS};
        Random random = new Random();
        side = coinOptions[random.nextInt(coinOptions.length)];
    }
}
