package abstractFactory;

public class TestClient {

    public static void main(String[] args){
        Client client1 = new Client(new DataCommunicate("Hi", "Yes"));
        System.out.println(client1.request());
        System.out.println(client1.response());

        Client client2 = new Client(new NetworkCommunicate("Hi", "Yes"));
        System.out.println(client2.request());
        System.out.println(client2.response());


    }

}
