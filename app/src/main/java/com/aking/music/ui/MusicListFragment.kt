package com.aking.music.ui

import androidx.fragment.app.viewModels
import com.aking.base.base.BaseFragment
import com.aking.music.R
import com.aking.music.databinding.FragmentMusicListBinding
import com.aking.music.vm.BlankViewModel

/**
 * Description: 歌曲列表页面
 * Created by Rick at 2024-09-08 16:38.
 */
class MusicListFragment : BaseFragment<FragmentMusicListBinding>(R.layout.fragment_music_list) {

    companion object {
        fun newInstance() = MusicListFragment()
    }

    private val viewModel: BlankViewModel by viewModels()

    override fun FragmentMusicListBinding.initView() {
    }
}