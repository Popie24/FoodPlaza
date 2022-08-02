package foodplaza.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import foodplaza.pojo.Food;

public class FoodDaoImp implements FoodDao {


    ArrayList<Food> list = new ArrayList<>();
    Iterator<Food> It;
    int FoodId;
    String FoodName, FoodType, FoodCategory;
    double Price;

    Scanner sc = new Scanner(System.in);
    InputStreamReader str = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(str);

    @Override
    public void AddFood() throws IOException {
        System.out.println("Enter Food Id: ");
        FoodId = sc.nextInt();
        System.out.println("Enter Food Name: ");
        FoodName = br.readLine();
        System.out.println("Enter Food Type: ");
        FoodType = br.readLine();
        System.out.println("Enter Food Category: ");
        FoodCategory = br.readLine();
        System.out.println("Enter Food Price: ");
        Price = sc.nextDouble();
        Food food = new Food(FoodId,FoodName,FoodType,FoodCategory,Price);
        list.add(food);
        System.out.println("Food Added Successfully........ :)");
        
    }

    @Override
    public void ShowFoods() {
        System.out.println("________________ ** All Records ** _________________");
        It = list.iterator();
        while (It.hasNext()) {
            System.out.println(It.next());
        }
        
    }

    @Override
    public void UpdateFood() throws IOException {
        System.out.println("Enter Food Id to Update: ");
        int id = sc.nextInt();
        It = list.iterator();
        boolean b = false;
        while (It.hasNext()) {
            Food f = It.next();
            if (f != null && f.getFoodId() == id) {
                System.out.println("Enter Food Name To Update: ");
                FoodName = br.readLine();
                f.setFoodName(FoodName);
                System.out.println("Enter Food Type To Update: ");
                FoodType = br.readLine();
                f.setFoodType(FoodType);
                System.out.println("Enter Food Category To Update: ");
                FoodCategory = br.readLine();
                f.setFoodCategory(FoodCategory);
                System.out.println("Enter Food Price To Update: ");
                Price = sc.nextDouble();
                f.setPrice(Price);
                System.out.println("Food Updated Successfully.......... :)");
                System.out.println(f);
                b = false;
            }else{
                b = true;
            }
        }

        if(b){
            System.out.println("XXXXXXXXXX------ Id Does Not Exit -----XXXXXXXXX");
            UpdateFood();
        }
        
    }

    @Override
    public void DeleteFood() {
        System.out.println("Enter Existing Id To delete the Food Item: ");
        int id = sc.nextInt();
        It = list.iterator();
        boolean b = false;
        while (It.hasNext()) {
            Food f = It.next();
            if(f != null && f.getFoodId() == id){
                It.remove();
                System.out.println("Food Deleted Successfully....... :(");
                b = false;
            }else{
                b = true;
            }
        }

        if(b){
            System.out.println("Details Not Found.");
            DeleteFood();
        }
        
    }

    @Override
    public void SearchFoodId() {
        It = list.iterator();
        System.out.println("Enter Id to Search Food: ");
        int id = sc.nextInt();
        boolean b = false;
        while (It.hasNext()) {
            Food f = It.next();
            if(f != null && f.getFoodId() == id){
                System.out.println("Here is Your Food..........");
                System.out.println(f);
                b=false;
            }else{
                b =true;
            }
        }

        if(b){
            System.out.println("Details Not Found ");
            SearchFoodId();
        }
        
    }

}
