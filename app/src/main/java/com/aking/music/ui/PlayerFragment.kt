package com.aking.music.ui

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.aking.base.base.BaseFragment
import com.aking.music.R
import com.aking.music.databinding.FragmentPlayerBinding
import com.aking.music.vm.PlayerViewModel

/**
 * Description: 播放页面
 * Created by Rick at 2024-09-08 16:38.
 */
class PlayerFragment : BaseFragment<FragmentPlayerBinding>(R.layout.fragment_player) {

    companion object {
        fun newInstance() = MusicListFragment()
    }

    private val viewModel: PlayerViewModel by viewModels()

    override fun FragmentPlayerBinding.initView() {
        root.setOnClickListener {
            findNavController().navigate(R.id.action_player_to_music_list)
        }
    }

}