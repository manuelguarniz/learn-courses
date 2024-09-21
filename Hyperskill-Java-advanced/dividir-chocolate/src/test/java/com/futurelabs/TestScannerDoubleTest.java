package com.futurelabs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestScannerDoubleTest {

    @Test
    void testCalculateLiquidPressure() {
      double spec = 91.63;
      double actual = TestScannerDouble.liquidPressure(1.7, 5.5);
      assertEquals(spec, actual);
    }

    @Test
    void testScannerAndMultiplier() {
        double spec = 11920.375;
        double actual = TestScannerDouble.scannerAndMultiplier(22.5);

        assertEquals(spec, actual);
    }
}