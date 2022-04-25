package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefactorTest {

    Refactor refactor = new Refactor();

    @Test
    void decorate() {
        refactor.decorate();
    }
}