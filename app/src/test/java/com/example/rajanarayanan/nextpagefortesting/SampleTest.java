package com.example.rajanarayanan.nextpagefortesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class SampleTest {
    Sample sample = new Sample();

    @Test
    public void testAdd() {
        int result = sample.add(0, 0);
        Assert.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme