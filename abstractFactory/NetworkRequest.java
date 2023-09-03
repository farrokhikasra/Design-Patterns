package abstractFactory;

public class NetworkRequest implements Request {
    private String request;

    public NetworkRequest() {
    }

    public NetworkRequest(String request) {
        this.request = request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @Override
    public String sendRequest() {
        return "Network request: " + request;
    }
}
