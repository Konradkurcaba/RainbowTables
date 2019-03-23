package remote;

import remote.interfaces.SendHelloIf;

public class SendHelloImpl implements SendHelloIf {

    public void sendMessage() {
        System.out.println("Hello");
    }
}
