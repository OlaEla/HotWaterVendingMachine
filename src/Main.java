package HotWaterVendingMachine.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // BottleOfWater b = new BottleOfWater(123, "123", 1);
        // System.out.println(b);

        List<Product> productList = new ArrayList<>();

        // productList.add(new BottleOfWater(123, "qwe", 100));
        // productList.add(new BottleOfWater(200, "qwe", 150));
        // productList.add(new BottleOfWater(500, "zxcg", 1000));
        // productList.add(new BottleOfWater(123, "qaffwe", 10));

        productList.add(new HotDrink(250, "Coffee", 250, 85));
        productList.add(new HotDrink(200, "Espresso", 300, 85));
        productList.add(new HotDrink(150, "BlackTea", 250, 80));
        productList.add(new HotDrink(100, "HerbalTea", 200, 75));
        productList.add(new HotDrink(200, "Grog", 400, 85));
        productList.add(new HotDrink(150, "Mulletwine", 450, 80));

        // BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);

        // System.out.println(vendingMachine.getProduct("qwe", 150));
        // System.out.println(vendingMachine.getProduct("qwe"));

        
        System.out.println(vendingMachine.getProduct("Coffee"));
        System.out.println(vendingMachine.getProduct("Espresso"));
        System.out.println(vendingMachine.getProduct("HerbalTea"));
        System.out.println(vendingMachine.getProduct("Mulletwine"));
        
    }
}
