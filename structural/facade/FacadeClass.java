package structural.facade;

public class FacadeClass {
    private Convert convert = new Convert();
    private IntCache intCache;
    private StringCache stringCache;

    public FacadeClass(IntCache intCache, StringCache stringCache){
        this.intCache = intCache;
        this.stringCache = stringCache;
    }

    public void storeIntToStringCache(int index) {
        int number = intCache.getInt(index);
        String s = convert.convertIntToString(number);
        stringCache.addData(s);
    }

    public void storeStringToIntCache(int index) {
        String s = stringCache.getData(index);
        int i = convert.convertStringToInt(s);
        intCache.addInt(i);
    }

    public void showBothCache() {
        System.out.println("Int cache");
        intCache.showAll();

        System.out.println("String Cache");
        stringCache.showAll();
    }
}
