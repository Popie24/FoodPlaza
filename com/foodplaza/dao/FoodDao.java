package foodplaza.dao;

import java.io.IOException;

public interface FoodDao {
    abstract void AddFood() throws IOException;
    abstract void ShowFoods();
    abstract void UpdateFood();
    abstract void DeleteFood();
    abstract void SearchFoodId();
}
