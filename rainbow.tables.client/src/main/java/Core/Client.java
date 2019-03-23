package Core;

import remote.interfaces.SendHelloIf;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String... args){

        try {
            Registry registry = LocateRegistry.getRegistry(null);
            SendHelloIf stub = (SendHelloIf) registry.lookup("SendHelloIf");
            stub.sendMessage();
        }catch (Exception aEx)
        {

        }
    }

}
