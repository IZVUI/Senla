package Task_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_6 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ItemBase base = new ItemBase();
        while (true) {
            System.out.println("weight");
            double weight = Double.parseDouble(in.next());
            if (weight == 0) break;
            System.out.println("cost");
            double cost = Double.parseDouble(in.next());
            base.AddItem(new Item(weight,cost));
        }
        Bag bag = new Bag(10);
        bag.Fill(base);
        for (Item item:bag.getItems()
        ) {
            System.out.println(item.toString());
        }
    }
}
