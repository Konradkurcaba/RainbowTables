package remote.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SendHelloIf extends Remote {
    void sendMessage() throws RemoteException;
}
