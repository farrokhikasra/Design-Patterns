package creational.abstractFactory;

public class DataResponse implements Response {
    private String response;

    public DataResponse() {
    }

    public DataResponse(String response) {
        this.response = response;
    }

    @Override
    public String sendResponse() {
        return "Data response: " + response;
    }
}
