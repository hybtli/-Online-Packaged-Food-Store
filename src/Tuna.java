import java.util.Arrays;

public class Tuna{

    private static final int NET_WEIGHT = 75;
    private static final int DRAINED_WEIGHT = 50;
    private static final String[] INGREDIENTS = {"tuna","sunflower","oil","salt"};
    private String expirationDate;


    public Tuna(String expirationDate){
        this.expirationDate = expirationDate;
    }


    public static int getNetWeight() {
        return NET_WEIGHT;
    }

    public static int getDrainedWeight() {
        return DRAINED_WEIGHT;
    }

    public static String[] getINGREDIENTS() {
        return INGREDIENTS;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return  "Net Weight: " + NET_WEIGHT + " GR, " +
                "Drained Weight: " + DRAINED_WEIGHT + " GR, " +
                "Ingredients: " + Arrays.toString(INGREDIENTS) + ", " +
                "Expiration Date: " + expirationDate;
    }

}
