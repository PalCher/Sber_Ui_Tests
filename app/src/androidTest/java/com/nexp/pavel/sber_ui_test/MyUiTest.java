package com.nexp.pavel.sber_ui_test;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.nexp.pavel.sber_ui_test.PageObjects.LoginTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MyUiTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    @After
    public void clearDb(){
        App.getInstance().getDatabase().getFioDAO().clearDb();
    }

    @Test
    public void useAppContext() {
        checkFullApp();
    }

    private void checkFullApp(){
        new LoginTest().testLogin().testListOnClick().checkFio();
    }
}