package creational.abstractFactory;

public class DataCommunicate implements DataNetworkCommunicate {
    private Request request;
    private Response response;

    public DataCommunicate(String request, String response){
        this.request = new DataRequest(request);
        this.response = new DataResponse(response);
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
