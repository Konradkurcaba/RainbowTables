package remote;

import remote.interfaces.SendHelloIf;

import java.rmi.RemoteException;

public class SendHelloImpl implements SendHelloIf {

    public void sendMessage() {
        System.out.println("Hello");
    }

    public byte[] compute(String[] aWords) throws RemoteException {
        int wordArraySize = aWords.length;
        byte[] hashes = new byte[wordArraySize];
        for(int i = 0;i<wordArraySize;i++)
        {
            hashes[i] = 1;
        }

        return hashes;
    }


}
