package com.gosha.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onLogin(view: View) {
        val login = login_filed.text.toString()
        val password = password_field.text.toString()

        if (login == "login12345" && password == "password12345") {
            val intent = Intent(this, Main2Activity::class.java).apply {
                putExtra(LOGIN, login)
                putExtra(PASSWORD, password)
            }
            startActivity(intent)
        } else {
            Toast.makeText(this, "Wrong credentials", Toast.LENGTH_LONG).show()
        }
    }
}
