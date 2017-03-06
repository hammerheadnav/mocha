package io.hammerhead.mocha

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        changeTextButton.setOnClickListener {
            if (mochaTextView.text == getString(R.string.mocha_is_awesome)) {
                mochaTextView.text = getString(R.string.mocha_still_awesome)
            } else {
                mochaTextView.text = getString(R.string.mocha_is_awesome)
            }
        }
    }

}
