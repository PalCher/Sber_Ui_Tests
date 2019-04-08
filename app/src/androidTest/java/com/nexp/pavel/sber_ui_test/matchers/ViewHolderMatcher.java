package com.nexp.pavel.sber_ui_test.matchers;

import android.support.v7.widget.RecyclerView;

import com.nexp.pavel.sber_ui_test.FioRvAdapter;
import com.nexp.pavel.sber_ui_test.PageObjects.LoginTest;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class ViewHolderMatcher extends TypeSafeMatcher<RecyclerView.ViewHolder> {

    @Override
    public void describeTo(Description description) {

    }

    @Override
    protected boolean matchesSafely(RecyclerView.ViewHolder item) {
        return ((FioRvAdapter.FioViewHolder) item).getFio().equals(LoginTest.TEST_FIO);
    }
}