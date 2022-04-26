package decorator;

import org.junit.jupiter.api.Test;

class RefactorTest {

    Refactor refactor = new Refactor();

    @Test
    void decorate() {
        refactor.decorate();
    }
}