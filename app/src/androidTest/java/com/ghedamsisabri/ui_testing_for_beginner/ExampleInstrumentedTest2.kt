package com.ghedamsisabri.ui_testing_for_beginner

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.ghedamsisabri.ui_testing_for_beginner.steps.MainPageSteps
import com.ghedamsisabri.ui_testing_for_beginner.steps.SecondPageSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ExampleInstrumentedTest2 {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun MainActivityTest() {
        MainPageSteps.checkMainTitleVisibility()
        MainPageSteps.checkNextButtonVisibility()
        MainPageSteps.clickOnNextButton()
        SecondPageSteps.checkSecondTitleVisibility()
        SecondPageSteps.checkBackButtonVisibility()
    }

    @Test
    fun SecondaryActivityTest() {
        MainPageSteps.checkMainTitleVisibility()
        MainPageSteps.checkNextButtonVisibility()
        MainPageSteps.clickOnNextButton()
        SecondPageSteps.clickOnNextButton()
        MainPageSteps.checkMainTitleVisibility()
        MainPageSteps.checkNextButtonVisibility()
    }
}

