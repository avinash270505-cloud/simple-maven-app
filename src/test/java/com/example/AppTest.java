package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(9, app.add(6, 3));
    }
}