package com.nexp.pavel.sber_ui_test.PageObjects;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.matcher.ViewMatchers;

import com.nexp.pavel.sber_ui_test.R;
import com.nexp.pavel.sber_ui_test.matchers.ViewHolderMatcher;

public class ListTest {

    public ListTest(){
        Espresso.onView(ViewMatchers.withId(R.id.fio_rv)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    public InfoTest testListOnClick(){
        Espresso.onView(ViewMatchers.withId(R.id.fio_rv)).perform(RecyclerViewActions.actionOnHolderItem(new ViewHolderMatcher(), ViewActions.click()));
        return new InfoTest();
    }
}
