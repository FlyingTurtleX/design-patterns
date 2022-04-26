package decorator;

import org.junit.jupiter.api.Test;

class OriginalTest {

    Original original = new Original();

    @Test
    void decorate() {
        original.decorate();
    }
}