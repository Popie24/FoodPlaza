package foodplaza.pojo;

public class Food {
    private int FoodId;
    private String FoodName;
    private String FoodType;
    private String FoodCategory;
    private double Price;

    public Food(int FoodId, String FoodName, String FoodType, String FoodCategory, double Price) {
        this.FoodId = FoodId;
        this.FoodName = FoodName;
        this.FoodType = FoodType;
        this.FoodCategory = FoodCategory;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "FoodID: " + FoodId + "\nFood Name: " + FoodName + "\nFood Type: " + FoodType + "\nFood Category: "
                + FoodCategory + "\nPrice: " + Price;
    }

    public int getFoodId() {
        return FoodId;
    }

    public String getFoodName() {
        return FoodName;
    }

    public String getFoodType() {
        return FoodType;
    }

    public String getFoodCategory() {
        return FoodCategory;
    }

    public double getPrice() {
        return Price;
    }

    public void setFoodId(int foodId) {
        this.FoodId = foodId;
    }

    public void setFoodName(String foodName) {
        this.FoodName = foodName;
    }

    public void setFoodCategory(String foodCategory) {
        this.FoodCategory = foodCategory;
    }

    public void setFoodType(String foodType) {
        this.FoodType = foodType;
    }

    public void setPrice(double price) {
        this.Price = price;
    }
    // Basic Class.
}