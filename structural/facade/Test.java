package structural.facade;

public class Test {

    public static void main(String args[]) {
        IntCache intCache = new IntCache();
        intCache.addInt(1);
        intCache.addInt(2);
        StringCache stringCache = new StringCache();
        stringCache.addData("Kasra");
        stringCache.addData("100");
        intCache.showAll();
        stringCache.showAll();
        FacadeClass facadeClass = new FacadeClass(intCache, stringCache);
        facadeClass.storeIntToStringCache(0);
        stringCache.showAll();
        facadeClass.storeStringToIntCache(1);
        intCache.showAll();
    }

}
