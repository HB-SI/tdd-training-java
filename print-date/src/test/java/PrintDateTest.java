import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class PrintDateTest {
    @Test
    public void printDate() throws Exception {
        final boolean[] called = {
            false
        };
        PrintDate printDate = new PrintDate(new Printer() {
            @Override
            public void print(Date date) {
                called[0] = true;
            }
        });
        printDate.printCurrentDate();

        assertEquals(true, called[0]);
    }

    private class MockPrinter extends Printer {
        boolean called;

        @Override
        public void print(Date date) {
            called = true;
        }

        public boolean isCalled() {
            return called;
        }
    }

    @Test
    public void testWithProxy() {
        MockPrinter printer = new MockPrinter();
        PrintDate printDate = new PrintDate(printer);
        printDate.printCurrentDate();

        assertEquals(true, printer.isCalled());
    }
}
