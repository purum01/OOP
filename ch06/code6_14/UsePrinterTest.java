package bookcode.ch06.code6_14;


/*
 * 코드 6-14
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UsePrinterTest {

    @Test
    void testDoSomething() {
        FakePrinter fake = new FakePrinter();
        UsePrinter u = new UsePrinter();
        u.doSomething(fake);
        assertEquals("this is a test", fake.get());
    }
}