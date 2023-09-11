package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class IntCache {
    private List<Integer> ints;

    public IntCache() {
        ints = new ArrayList<>();
    }

    public void addInt(int i){
        ints.add(i);
    }

    public int getInt(int index){
        return ints.get(index);
    }

    public void removedata(int i){
        for (int x:ints) {
            if (x == i){
                ints.remove(i);
            }
        }
    }

    public void showAll(){
        for (int i:ints) {
            System.out.println(i);
        }
    }

}
