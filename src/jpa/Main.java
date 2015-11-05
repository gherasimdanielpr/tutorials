package jpa;

/**
 * Created by daniel.gherasim on 10/23/2015.
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        String clientData = client.processing();

        Server server = new Server();
        String serverData = server.processing(clientData);
        System.out.println("clientData"+clientData);
        System.out.println("serverData:"+serverData);

    }
}
