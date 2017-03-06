package io.hammerhead.mocha

import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import io.hammerhead.mocha.dsl.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    public val mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testSpinner() {
        testAction("it should check default spinner text") {
            action {
                expect {
                    on {
                        id = R.id.spinnerView
                    }
                    assert {
                        spinnerText = "Espresso"
                    }
                }
            }
        }
    }

    @Test
    fun testTextChange() {

        testAction("text should be visible") {
            action {
                expect {
                    on {
                        id = R.id.mochaTextView
                    }
                    assert {
                        visibility = ViewMatchers.Visibility.VISIBLE
                        textResId = R.string.mocha_is_awesome
                    }
                }
            }
        }

        testAction("text should change when button is clicked") {
            action {
                click {
                    id = R.id.changeTextButton
                }
                expect {
                    on {
                        id = R.id.mochaTextView
                    }
                    assert {
                        visibility = ViewMatchers.Visibility.VISIBLE
                        textResId = R.string.mocha_still_awesome
                    }
                }

                click {
                    id = R.id.changeTextButton
                }
                expect {
                    on {
                        id = R.id.mochaTextView
                    }
                    assert {
                        visibility = ViewMatchers.Visibility.VISIBLE
                        textResId = R.string.mocha_is_awesome
                    }
                }
            }
        }
    }
}
