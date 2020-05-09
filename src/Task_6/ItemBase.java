package Task_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ItemBase {

    private HashMap<Double,ArrayList<Item>> items;
    private ArrayList<Double> values;

    public ArrayList<Double> getValues() {
        return values;
    }

    public void setValues(ArrayList<Double> values) {
        this.values = values;
    }

    public void setItems(HashMap<Double, ArrayList<Item>> items) {
        this.items = items;
    }

    public HashMap<Double, ArrayList<Item>> getItems() {
        return items;
    }
    public ItemBase(){
        setItems(new HashMap<>());
        setValues(new ArrayList<>());
    }

    public void AddItem(Item newItem){
        HashMap<Double,ArrayList<Item>>newMap = getItems();
        ArrayList<Item> items;
        ArrayList<Double> values;
        if(getItems().containsKey(newItem.getValue())){
            items=newMap.get(newItem.getValue());
        }
        else{
            items=new ArrayList<>();
        }
        items.add(newItem);
        newMap.put(newItem.getValue(),items);
        setItems(newMap);
        Sort(newItem.getValue());
        values=getValues();
        values.add(newItem.getValue());
        setValues(values);
        SortValues();
    }
    public void RemoveItem(Item delItem){
        HashMap<Double,ArrayList<Item>>newMap = getItems();
        ArrayList<Item> items;
        if(!getItems().containsKey(delItem.getValue())){
            return;
        }
        else{
            items=newMap.get(delItem.getValue());
            items.remove(delItem);
            newMap.put(delItem.getValue(),items);
            setItems(newMap);
        }
    }
    private void Sort(Double value){
        HashMap<Double,ArrayList<Item>>newMap = getItems();
        ArrayList<Item> items=newMap.get(value);
        items.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o1.getWeight(),o2.getWeight());
            }
        });
        newMap.put(value,items);
        setItems(newMap);
    }
    private void SortValues(){
        ArrayList<Double> sortedValues=getValues();
        sortedValues.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }
        });
        setValues(sortedValues);
    }
}
