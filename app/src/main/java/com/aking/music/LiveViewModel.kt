package com.aking.music

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.map

/**
 * @author Ak
 * 2024/9/9 17:46
 */
enum class MusicTheme {
    Light, Dark
}

class LiveViewModel(private val app: Application) : AndroidViewModel(app) {

    val musicTheme = MutableLiveData(MusicTheme.Light)

    private val liveResources = musicTheme.map {
        when (it) {
            MusicTheme.Light -> app.resources
            else -> app.resources
        }
    }

    val background = liveResources.map { it }

    val bg = liveData { emit(R.drawable.ic_launcher_background) }

}