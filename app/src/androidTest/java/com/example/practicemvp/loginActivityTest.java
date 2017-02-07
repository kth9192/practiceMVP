package com.example.practicemvp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressBack;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by kth919 on 2017-02-06.
 */

@RunWith(AndroidJUnit4.class)
public class loginActivityTest {

    @Rule
    public ActivityTestRule<LoginAcitivty> loginAcitivtyActivityTestRule = new ActivityTestRule<LoginAcitivty>(LoginAcitivty.class);

    @Test
    public void loginTest(){

        onView(withId(R.id.emailBox)).perform(typeText("kth919"));

        onView(withId(R.id.PasswordBox)).perform(typeText("1234"), pressBack());

        onView(withId(R.id.login_button)).perform(click());

        onView(withId(R.id.emailBox)).check(matches(withText("kth919")));

        onView(withId(R.id.PasswordBox)).check(matches(withText("1234")));


    }
}
