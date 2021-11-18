package com.tomgregory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ApplicationTest {
    @Test
    public void canRunApplication() {
        Application.main(new String[]{});
    }

    @Test
    public void oops() {
        fail();
    }
}
