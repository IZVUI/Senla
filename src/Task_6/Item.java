package Task_6;

import java.util.Objects;

public class Item {
    private double weight,cost,value;
    private String name;
    private static int fastName=0;

    public Item(double weight, double cost){
        setWeight(weight);
        setCost(cost);
        setValue(weight/cost);
        setName("Item"+fastName);
        fastName++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        if(value<0) value=0;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setCost(double cost) {
        if(cost<0)cost=0;
        this.cost = cost;
    }

    public void setWeight(double weight) {
        if(weight<0) weight=0;
        this.weight = weight;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.getWeight(), getWeight()) == 0 &&
                Double.compare(item.getCost(), getCost()) == 0 &&
                getName().equals(item.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getCost(), getName());
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", cost=" + cost +
                ", value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
