
package com.example;

import static org.junit.Assert.fail;
import org.junit.Test;

public class AppTest {

    @Test
    public void applicationRunsWithoutError() {
        try {
            App.main(new String[]{});
        } catch (Exception e) {
            fail("Application threw an exception: " + e.getMessage());
        }
    }
}
