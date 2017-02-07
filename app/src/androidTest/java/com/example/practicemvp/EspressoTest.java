package com.example.practicemvp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressBack;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by kth919 on 2017-02-04.
 */

@RunWith(AndroidJUnit4.class)
public class EspressoTest {
//    @Rule
//    public ActivityTestRule<LoginAcitivty> mainActivityActivityTestRule =
//            new ActivityTestRule<LoginAcitivty>(LoginAcitivty.class);
//
//    @Test
//    public  void changeText(){
//
//        //원본 텍스트 출력 체크
//        onView(withId(R.id.top_text)).check(matches(withText("Hello World!")));
//        //에디트 텍스트로 텍스트 보내기
//        onView(withContentDescription("text_field")).perform(typeText("Whoa Espresso is easy!"), pressBack());
//        //체인지 버튼 클릭
//        onView(withId(R.id.change_button)).perform( click());
//        //
//        onView(withId(R.id.top_text)).check(matches(withText("Whoa Espresso is easy!")));
//
//    }
}
