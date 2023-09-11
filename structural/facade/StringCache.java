package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class StringCache {
    private List<String> dataList;

    public StringCache() {
        dataList = new ArrayList<>();
    }

    public void addData(String data) {
        dataList.add(data);
    }

    public void removeData(String data) {
        for (String s : dataList) {
            if (s.equals(data)) {
                dataList.remove(s);
            }
        }
    }

    public String getData(int index) {
        return dataList.get(index);
    }

    public void showAll() {
        for (String s : dataList) {
            System.out.println(s);
        }
    }
}
