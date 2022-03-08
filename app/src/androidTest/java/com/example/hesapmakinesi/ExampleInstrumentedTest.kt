package com.example.hesapmakinesi

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.core.StringContains.containsString

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import kotlin.reflect.typeOf

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class HesapMakinesiTests {

    @get:Rule()
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun toplama_islemi_test() {
        onView(withId(R.id.editTextSayi1))
            .perform(typeText("20"))
        onView(withId(R.id.editTextSayi2))
            .perform(typeText("10"))
        onView(withId(R.id.buttonTopla)).perform(click())
        onView(withId(R.id.textViewSonuc))
            .check(matches(withText(containsString("30"))))
    }

    @Test
    fun carpma_islemi_test() {
        onView(withId(R.id.editTextSayi1))
            .perform(typeText("20"))
        onView(withId(R.id.editTextSayi2))
            .perform(typeText("10"))
        onView(withId(R.id.buttonCarp)).perform(click())
        onView(withId(R.id.textViewSonuc))
            .check(matches(withText(containsString("200"))))
    }

    @Test
    fun cikarma_islemi_test() {
        onView(withId(R.id.editTextSayi1))
            .perform(typeText("20"))
        onView(withId(R.id.editTextSayi2))
            .perform(typeText("10"))
        onView(withId(R.id.buttonCikar)).perform(click())
        onView(withId(R.id.textViewSonuc))
            .check(matches(withText(containsString("10"))))
    }

    @Test
    fun bolme_islemi_test() {
        onView(withId(R.id.editTextSayi1))
            .perform(typeText("20"))
        onView(withId(R.id.editTextSayi2))
            .perform(typeText("10"))
        onView(withId(R.id.buttonBol)).perform(click())
        onView(withId(R.id.textViewSonuc))
            .check(matches(withText(containsString("2"))))
    }
}