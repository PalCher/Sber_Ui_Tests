package com.nexp.pavel.sber_ui_test.PageObjects;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;

import com.nexp.pavel.sber_ui_test.R;

public class LoginTest {

    public static final String TEST_FIO = "Pavel Chernyavsky";

    public ListTest testLogin(){
        Espresso.onView(ViewMatchers.withId(R.id.approve)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(R.id.fio)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));;
        Espresso.onView(ViewMatchers.withId(R.id.fio)).perform(ViewActions.typeText(TEST_FIO));

        Espresso.onView(ViewMatchers.withId(R.id.approve)).perform(ViewActions.click());

        return new ListTest();
    }
}