package creational.abstractFactory;

public class NetworkCommunicate implements DataNetworkCommunicate {
    private Request request;
    private Response response;

    public NetworkCommunicate(String request, String response) {
        this.request = new NetworkRequest(request);
        this.response = new NetworkResponse(response);
    }

    @Override
    public String sendRequest() {
        return request.sendRequest();
    }

    @Override
    public String sendResponse() {
        return response.sendResponse();
    }
}
