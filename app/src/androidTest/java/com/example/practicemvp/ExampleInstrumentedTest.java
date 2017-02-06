package com.example.practicemvp;

import android.app.Activity;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private LoginAcitivty loginAcitivty;

    @Rule
    public ActivityTestRule<LoginAcitivty> mActivityRules
            = new ActivityTestRule<LoginAcitivty>(LoginAcitivty.class);
    @Before
    public void setUp(){
        this.loginAcitivty = mActivityRules.getActivity();
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.practicemvp", appContext.getPackageName());
    }
}
