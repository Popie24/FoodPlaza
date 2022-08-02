package foodplaza.test;

import java.io.IOException;
import java.util.Scanner;

import foodplaza.dao.FoodDaoImp;

public class FoodTest {
    
    static void Menue(){
        System.out.println("1. Add Food.");
        System.out.println("2. Update Food.");
        System.out.println("3. Delete Food.");
        System.out.println("4. Display All Food Items.");
        System.out.println("5. Search Food By Id.");
        System.out.println("0. Exit.");
    }

    public static void main(String[] args) throws IOException {
        
        try (Scanner sc = new Scanner(System.in)) {
            FoodDaoImp fdi = new FoodDaoImp();
            int Input;
            while (true) {
                Menue();
                System.out.println("Enter Your Choice: ");
                Input = sc.nextInt();
                switch (Input) {
                    case 1:
                        fdi.AddFood();
                        break;
                    
                    case 2:
                        fdi.UpdateFood();
                        break;

                    case 3:
                        fdi.DeleteFood();
                        break;

                    case 4:
                        fdi.ShowFoods();
                        break;

                    case 5:
                        fdi.SearchFoodId();
                        break;

                    case 0:
                        System.out.println("Exit Successfully: ");
                        System.exit(0);
                
                    default:
                        break;
                }
            }
        }

        
    }
}
