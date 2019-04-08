package com.nexp.pavel.sber_ui_test.PageObjects;


import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;

import com.nexp.pavel.sber_ui_test.R;

public class InfoTest {

    public void checkFio(){
        Espresso.onView(ViewMatchers.withId(R.id.info_fio)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}