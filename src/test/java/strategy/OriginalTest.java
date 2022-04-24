package strategy;

import org.junit.jupiter.api.Test;

class OriginalTest {

    Original1 original1 = new Original1();
    Original2 original2 = new Original2();

    @Test
    void cashierClick() {
        original1.cashierClick(new Item("banana", 5.0, 2.5));
        original1.cashierClick(new Item("pork", 33.6, 10));
        original1.billPrint();
    }

    @Test
    void cashierClick2() {
        original2.cashierClick(new Item("banana", 5.0, 2.5, 1));
        original2.cashierClick(new Item("pork", 33.6, 10, 3));
        original2.billPrint();
    }

}