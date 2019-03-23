package Core;

import remote.interfaces.SendHelloIf;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;

public class Client {

    public static void main(String... args){

        try {
            Registry registry = LocateRegistry.getRegistry(null);
            System.out.print(Arrays.toString(registry.list()));

            SendHelloIf stub = (SendHelloIf) registry.lookup("SendHelloIf");
            byte[] lool = stub.compute(new String[100]);
            System.out.print(Arrays.toString(lool));
        }catch (Exception aEx)
        {

        }
    }

}
