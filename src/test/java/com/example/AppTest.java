
package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {

    @Test
    public void testPrimeNumbers() {
        assertTrue(App.isPrime(2));
        assertTrue(App.isPrime(3));
        assertTrue(App.isPrime(17));
        assertTrue(App.isPrime(97));
    }

    @Test
    public void testNonPrimeNumbers() {
        assertFalse(App.isPrime(4));
        assertFalse(App.isPrime(9));
        assertFalse(App.isPrime(100));
    }

    @Test
    public void testZeroAndOne() {
        assertFalse(App.isPrime(0));
        assertFalse(App.isPrime(1));
    }

    @Test
    public void testNegativeNumbers() {
        assertFalse(App.isPrime(-5));
    }
}
