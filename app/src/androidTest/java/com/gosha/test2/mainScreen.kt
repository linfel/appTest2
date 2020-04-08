package com.gosha.test2

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView

object mainScreen: Screen<mainScreen>() {

    val greeting_text: KTextView = KTextView {withId(R.id.greeting_text)}
}