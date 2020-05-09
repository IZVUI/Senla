package Task_6;

import java.util.ArrayList;
import java.util.HashSet;

public class Bag {
    private double capacity;
    private ArrayList<Item> items;

    public Bag(double capacity){
        setCapacity(capacity);
        setItems(new ArrayList<Item>());
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if(capacity<0)capacity=0;
        this.capacity = capacity;
    }

    public double TotalWeight(){
        double weight=0;
        for (Item item:getItems()
             ) {
            weight+=item.getWeight();
        }
        return weight;
    }
    public double TotalWeight(ArrayList<Item> items){
        double weight=0;
        for (Item item:items
        ) {
            weight+=item.getWeight();
        }
        return weight;
    }

    public void Fill(ItemBase base){
        ArrayList<Item> newItems=new ArrayList<>();
        for (Double value:base.getValues()
             ) {
            if(TotalWeight(newItems)==getCapacity())break;
            for (Item item:base.getItems().get(value)
                 ) {
                if(TotalWeight(newItems)+item.getWeight()>getCapacity()) break;
                if(!newItems.contains(item))newItems.add(item);
            }
        }
        setItems(newItems);
        CheckFill(base);
    }
    private void CheckFill(ItemBase base){
        ArrayList<Item> items=getItems();
        for (Item item: items
             ) {
            for (Item newItem:base.getItems().get(item.getValue())
                 ) {
                if(items.contains(newItem))continue;
                if(item.getCost()<newItem.getCost() &&
                        (TotalWeight(items)-item.getWeight()+newItem.getWeight()<=getCapacity())){
                    items.remove(item);
                    items.add(newItem);
                    break;
                }
            }
        }
        setItems(items);
    }
}
