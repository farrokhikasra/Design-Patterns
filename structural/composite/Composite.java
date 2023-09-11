package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Equipment{
    List<Equipment> equimpents;

    public Composite(String name){
        super(name, 0);
        equimpents = new ArrayList<>();
    }

    public Composite addEquipment(Equipment equipment){
        equimpents.add(equipment);
        return this;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (Equipment equipment : equimpents){
            sum += equipment.getPrice();
        }
        return sum;
    }

}
