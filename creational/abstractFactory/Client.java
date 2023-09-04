package creational.abstractFactory;

public class Client {
    DataNetworkCommunicate communicate;

    public Client(DataNetworkCommunicate communicate) {
        this.communicate = communicate;
    }

    public String request() {
        return communicate.sendRequest();
    }

    public String response() {
        return communicate.sendResponse();
    }

}
