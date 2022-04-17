public class Pudding {

    private static final int NET_WEIGHT = 120;

    private static final String FLAVOR = "banana";

    private String expirationDate;


    public Pudding(String expirationDate){
        this.expirationDate = expirationDate;
    }

    public static int getNetWeight() {
        return NET_WEIGHT;
    }

    public static String getFLAVOR() {
        return FLAVOR;
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
                "Flavor: " + FLAVOR + ", " +
                "Expiration Date: " + expirationDate;
    }

}
