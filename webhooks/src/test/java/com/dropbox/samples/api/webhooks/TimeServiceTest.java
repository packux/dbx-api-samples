package com.dropbox.samples.api.webhooks;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class TimeServiceTest {

    @Test
    public void canGetTime() {
        Object time = new TimeService().getTime();
        assertEquals(LocalTime.class, time.getClass());
    }

}
