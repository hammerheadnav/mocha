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
    fun test() {

        testAction("email status text should be invisible") {
            action {
                find {
                    id = R.id.emailStatusText
                }
                expect {
                    visibility = ViewMatchers.Visibility.GONE
                }
            }
        }

        testAction("it should make email status text visible") {
            action {
                click {
                    id = R.id.fab
                }
                expect {
                    visibility = ViewMatchers.Visibility.VISIBLE
                }
            }
        }
    }
}
