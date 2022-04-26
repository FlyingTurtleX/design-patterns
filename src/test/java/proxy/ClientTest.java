package proxy;

import org.junit.jupiter.api.Test;

class ClientTest {

    Client client = new Client();

    @Test
    void proxy() {
        client.proxy();
    }
}