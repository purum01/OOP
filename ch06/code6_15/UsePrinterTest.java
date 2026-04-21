package bookcode.ch06.code6_15;


/*
 * 코드 6-15
 */

import org.junit.jupiter.api.Test;

class UsePrinterTest {

    @Test
    void testDoSomething() {
        FakePrinterFactory fake = new FakePrinterFactory();
        UsePrinter u = new UsePrinter();
        PrinterFactory.setPrinterFactory(fake);
        u.doSomething();
    }
}

