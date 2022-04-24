package strategy;

import org.junit.jupiter.api.Test;

class RefactorTest {

    Refactor1st refactor1st = new Refactor1st();
    Refactor2nd refactor2nd = new Refactor2nd();

    @Test
    void cashierClick1st() {
        refactor1st.cashierClick(new Item("banana", 5.0, 2.5, "normal"));
        refactor1st.cashierClick(new Item("pork", 33.6, 10, "150-30"));
        refactor1st.cashierClick(new Item("perfume", 5009, 1, "20%-off"));
        refactor1st.billPrint();
    }

    @Test
    void cashierClick2nd() {
        refactor2nd.cashierClick(new Item("banana", 5.0, 2.5, "normal"));
        refactor2nd.cashierClick(new Item("pork", 33.6, 10, "150-30"));
        refactor2nd.cashierClick(new Item("perfume", 5009, 1, "30%-off"));
        refactor2nd.billPrint();
    }
}