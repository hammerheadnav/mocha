package io.hammerhead.mocha

import android.support.test.espresso.matcher.ViewMatchers
import io.hammerhead.mocha.dsl.*


class DSTTest {
    fun test() {

        testAction("dummy test") {

            setup {
                lauchActivity {
                    packageName = "xxxxx"
                }
            }

            action {
                click {
                    id = 1234
                }

                expect {
                    visibility = ViewMatchers.Visibility.VISIBLE
                }
            }
        }
    }
}
