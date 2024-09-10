package com.aking.music

import android.graphics.drawable.Drawable
import android.util.Log
import android.view.View
import androidx.databinding.BindingAdapter

/**
 * @author Ak
 * 2024/9/10 17:54
 */



@BindingAdapter(value = ["android:background"], requireAll = true)
fun View.bindLiveBackground(text: String) {
    Log.e("live", "bindLiveBackground: $text")

}