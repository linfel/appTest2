package com.gosha.test2

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton

object loginScreen: Screen<loginScreen>() {

    val login_field: KEditText = KEditText {withId(R.id.login_filed)}

    val password_field: KEditText = KEditText {withId(R.id.password_field)}

    val enter_button: KButton = KButton {withId(R.id.enter_button)}

}