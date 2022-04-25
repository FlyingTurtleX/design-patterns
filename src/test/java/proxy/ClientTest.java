package proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    Client client = new Client();

    @Test
    void proxy() {
        client.proxy();
    }
}