import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestsTestCase {
    UnitTests unitTests = new UnitTests();
    UnitTests unitTests2 = new UnitTests();

    @Test
    void mainklasseTest() {
        assertNotNull(unitTests);
    }
    @Test
    void zinsBerechnung() {
        //UnitTests unitTests = new UnitTests();
        assertEquals(200,UnitTests.zinsBerechnung(1000,10,2), 0.01);
        assertTrue(1>0);

    }
    @Test
    void gesamtKapitalMitZinsen() {
        assertEquals(1200, UnitTests.gesamtKapitalMitZinsen(1000,10,2));
    }
    @Test
    void rendite() {
        assertEquals(50, UnitTests.rendite(1000,1500,2));
    }
    @Test
    void monatlicheRate() {
        assertEquals(299, UnitTests.monatlicheRate(10000,5,3), 1.0);
    }

    @Test
    void divide() {
        try {
            UnitTests.divide(10, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Division durch 0 nicht möglich", e.getMessage());
        }
        assertEquals(2, UnitTests.divide(10,5));
    }
}