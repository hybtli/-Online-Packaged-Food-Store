public class Corn {

    private static final int NET_WEIGHT = 220;
    private static final int DRAINED_WEIGHT = 132;
    private static final String PRODUCTION_COUNTRY = "Turkey";
    private String expirationDate;


    public Corn(String expirationDate){
        this.expirationDate = expirationDate;
    }

    public static int getNetWeight() {
        return NET_WEIGHT;
    }

    public static int getDrainedWeight() {
        return DRAINED_WEIGHT;
    }

    public static String getProductionCountry() {
        return PRODUCTION_COUNTRY;
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
                "Production Country: " + PRODUCTION_COUNTRY + ", " +
                "Expiration Date: " + expirationDate;
    }

}
