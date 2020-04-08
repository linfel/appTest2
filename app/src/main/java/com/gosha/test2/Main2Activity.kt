package com.gosha.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

const val LOGIN = "com.gosha.test2.LOGIN"
const val PASSWORD = "com.gosha.test2.PASSWORD"


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val greeting = intent.getStringExtra(LOGIN)

        greeting_text.text = "Hello, user $greeting"
    }
}

