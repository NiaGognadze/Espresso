package com.ghedamsisabri.ui_testing_for_beginner.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.ghedamsisabri.ui_testing_for_beginner.R

object SecondPage {
    private val secondTitleTextView = withId(R.id.activity_secondary_title)
    private val backButton = withId(R.id.button_back)

    fun checkSecondTitleVisibility() {
        onView(secondTitleTextView).check(matches(isDisplayed()))
    }

    fun checkBackButtonVisibility() {
        onView(backButton).check(matches(isDisplayed()))
    }

    fun clickOnBackButton() {
        onView((backButton)).perform(click())

        //something
    }
}