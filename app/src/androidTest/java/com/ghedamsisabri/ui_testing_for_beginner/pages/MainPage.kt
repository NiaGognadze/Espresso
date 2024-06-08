package com.ghedamsisabri.ui_testing_for_beginner.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.ghedamsisabri.ui_testing_for_beginner.R

object MainPage {
    private val mainTitleTextView = withId(R.id.activity_main_title)
    private val nextButton = withId(R.id.button_next_activity)

    fun checkMainTitleVisibility() {
        onView(mainTitleTextView).check(matches(isDisplayed()))
    }

    fun checkNextButtonVisibility() {
        onView(nextButton).check(matches(isDisplayed()))
    }

    fun clickOnNextButton() {
        onView((nextButton)).perform(click())
    }
}