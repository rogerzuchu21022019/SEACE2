package nam.vuthanh.myapplication.kotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nam.vuthanh.myapplication.R
import nam.vuthanh.myapplication.databinding.FragmentFavoriteBinding
import nam.vuthanh.myapplication.databinding.FragmentHomeBinding


class FavoriteFM : Fragment() {
    lateinit var fmFavoriteBinding: FragmentFavoriteBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fmFavoriteBinding = FragmentFavoriteBinding.inflate(layoutInflater)
        return fmFavoriteBinding.root
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}