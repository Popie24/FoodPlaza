package foodplaza.dao;

public interface FoodDao {
    abstract void AddFood();
    abstract void ShowFoods();
    abstract void UpdateFood();
    abstract void DeleteFood();
    abstract void SearchFoodId();
}
