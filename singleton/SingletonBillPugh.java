package singleton;

public class SingletonBillPugh {
    private SingletonBillPugh() {

    }
    public static class InnerClass{
        private static final SingletonBillPugh singletonBillPugh = new SingletonBillPugh();
    }

    private SingletonBillPugh getInstance(){
        return InnerClass.singletonBillPugh;
    }

}
