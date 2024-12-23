package server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class JaxWS
{
    public static void main(String[] args)
    {
        final int PORT = 8989;

        System.out.println("Le serveur JAX-WS écoute sur le port " + PORT);
        Endpoint.publish("http://0.0.0.0:" + PORT + "/", new BanqueService());
    }
}
