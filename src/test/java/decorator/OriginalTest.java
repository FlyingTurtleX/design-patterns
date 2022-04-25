package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OriginalTest {

    Original original = new Original();

    @Test
    void decorate() {
        original.decorate();
    }
}