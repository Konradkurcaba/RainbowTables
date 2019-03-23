package core;

import remote.SendHelloImpl;
import remote.interfaces.SendHelloIf;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends SendHelloImpl {

    public Server(){}
    public static void main(String... args){

        try
        {
            SendHelloImpl hello = new SendHelloImpl();
            SendHelloIf stub = (SendHelloIf) UnicastRemoteObject.exportObject(hello, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("SendHelloIf",stub);

        }catch (Exception aEx){
            aEx.printStackTrace();
        }



    }



}
