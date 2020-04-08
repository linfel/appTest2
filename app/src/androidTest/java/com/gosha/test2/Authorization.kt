package com.gosha.test2

import android.Manifest
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.ext.junit.runners.AndroidJUnit4

import androidx.test.rule.ActivityTestRule
import androidx.test.rule.GrantPermissionRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class Authorization: TestCase() {

    //Giving permissions
    @get:Rule
    val runtimePermissionRule: GrantPermissionRule = GrantPermissionRule.grant(
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    )

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Test
    fun login() {
        before {
            activityTestRule.launchActivity(null)
        }.after {
            //
        }.run {
            step("Open Login Screen"){
            io.qameta.allure.android.step("Open login screen"){
                loginScreen {

                    login_field {
                        isVisible()
                        isClickable()
                    }

                    password_field{
                        isVisible()
                        isClickable()
                    }

                    enter_button {
                        isVisible()
                        isClickable()
                        matches { withText("Войти") }
                    }
                }
            }}
            step("Input credentials") {
            io.qameta.allure.android.step("Input credentials"){
                loginScreen {

                    login_field {
                        typeText("login12345")
                    }
                    password_field {
                        typeText("password12345")
                    }
                    closeSoftKeyboard()
                }
            }}
            step("Open Main Screen"){
            io.qameta.allure.android.step("Open Main Screen"){

                loginScreen {
                    enter_button {
                        click()
                    }
                }
              mainScreen {
                  greeting_text {
                      isVisible()
                      hasText("Hello, user login12345")

                  }
              }
            }}
        }
    }
}