public class Noodle {

    private static final int NET_WEIGHT = 120;
    private static final int SIMMER_DURATION = 3;
    private String expirationDate;

    public Noodle(String expirationDate){
        this.expirationDate = expirationDate;
    }

    public static int getNetWeight() {
        return NET_WEIGHT;
    }

    public static int getSimmerDuration() {
        return SIMMER_DURATION;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return  "Net Weight: " + NET_WEIGHT + " GR, " +
                "Simmer Duration: " + SIMMER_DURATION + " min, " +
                "Expiration Date: " + expirationDate;
    }

}
