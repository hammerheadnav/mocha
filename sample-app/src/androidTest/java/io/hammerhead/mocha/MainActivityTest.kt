package io.hammerhead.mocha

import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import io.hammerhead.mocha.dsl.action
import io.hammerhead.mocha.dsl.click
import io.hammerhead.mocha.dsl.expect
import io.hammerhead.mocha.dsl.testAction
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    public val mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun test() {

        testAction("email status text should be invisible") {
            action {
                expect(R.id.emailStatusText) {
                    visibility = ViewMatchers.Visibility.GONE
                }
            }
        }

        testAction("it should make email status text visible") {
            action {
                click {
                    id = R.id.fab
                }
                expect(R.id.emailStatusText) {
                    visibility = ViewMatchers.Visibility.VISIBLE
                    textResId = R.string.email_sent
                }
            }
        }
    }
}
