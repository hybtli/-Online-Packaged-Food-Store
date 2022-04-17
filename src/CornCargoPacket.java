public class CornCargoPacket {

    private int id;

    private String processDate;

    private String expirationDate;

    public CornCargoPacket(int id, String processDate, String expirationDate){
        this.id = id;
        this.processDate = processDate;
        this.expirationDate = expirationDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public String getProcessDate() {
        return processDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " +
                "Process Date: " + processDate + ", " +
                "Expiration Date: " + expirationDate
                ;
    }

}
