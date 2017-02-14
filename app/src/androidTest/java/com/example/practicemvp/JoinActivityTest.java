package com.example.practicemvp;

import android.support.test.rule.ActivityTestRule;

import com.example.practicemvp.Join.JoinActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressBack;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by kth919 on 2017-02-14.
 */

public class JoinActivityTest {

    @Rule
    public ActivityTestRule<JoinActivity> loginAcitivtyActivityTestRule = new ActivityTestRule<JoinActivity>(JoinActivity.class);

    @Test
    public void joinUITest(){
        onView(withId(R.id.join_email)).perform(typeText("kth919"), pressBack());

        onView(withId(R.id.join_pw)).perform(typeText("1234"), pressBack());

        onView(withId(R.id.join_nick)).perform(typeText("zzz"), pressBack());

        onView(withId(R.id.join_accept)).perform(click());

        onView(withId(R.id.join_email)).check(matches(withText("kth919")));

        onView(withId(R.id.join_pw)).check(matches(withText("1234")));

        onView(withId(R.id.join_nick)).check(matches(withText("zzz")));
    }
}

