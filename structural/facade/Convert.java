package structural.facade;

public class Convert {
    public String convertIntToString(int x) {
        return Integer.toString(x);
    }

    public int convertStringToInt(String s) {
        return Integer.parseInt(s);
    }
}
