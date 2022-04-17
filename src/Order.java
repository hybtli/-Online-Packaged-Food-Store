import java.util.Arrays;

public class Order {

    private int id;
    private String date;
    private String[] foodCategory;

    public Order(int id, String date, String[] foodCategory){
        this.id = id;
        this.date = date;
        this.foodCategory = foodCategory;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setFoodCategory(String[] foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String[] getFoodCategory() {
        return foodCategory;
    }

    @Override
    public String toString() {
        return  "ID: " + id + ", " +
                "Order Date: " + date + ", " +
                "Food Categories: " + Arrays.toString(foodCategory);
    }
}
