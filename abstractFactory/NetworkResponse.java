package abstractFactory;

public class NetworkResponse implements Response {
    private String response;

    public NetworkResponse() {
    }

    public NetworkResponse(String response) {
        this.response = response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String sendResponse() {
        return "Network response: " + response;
    }
}
