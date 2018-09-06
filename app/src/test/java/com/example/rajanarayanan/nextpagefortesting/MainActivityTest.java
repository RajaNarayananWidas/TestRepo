package com.example.rajanarayanan.nextpagefortesting;

import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.ViewModelStore;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.app.FragmentController;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.SupportActivity;
import android.support.v4.util.SimpleArrayMap;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.app.AppCompatDelegate;

import org.apache.tools.ant.Main;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.mockito.Mockito.*;


@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {


    MainActivity activity = Robolectric.setupActivity(MainActivity.class);
    @Before
    public void setUp() {

    }

    @Test
    public void testOnCreate() throws Exception {
//        activity.onCreate(null);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme