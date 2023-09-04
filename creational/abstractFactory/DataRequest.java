package creational.abstractFactory;

public class DataRequest implements Request{
    private String request;

    public DataRequest(){}
    public DataRequest(String request){
        this.request = request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @Override
    public String sendRequest() {
        return "Date request: " + request;
    }
}
