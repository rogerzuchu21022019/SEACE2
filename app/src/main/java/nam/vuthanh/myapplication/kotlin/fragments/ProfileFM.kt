package nam.vuthanh.myapplication.kotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nam.vuthanh.myapplication.R
import nam.vuthanh.myapplication.databinding.FragmentHomeBinding
import nam.vuthanh.myapplication.databinding.FragmentProfileBinding


class ProfileFM : Fragment() {
    lateinit var fmProfileFM: FragmentProfileBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fmProfileFM = FragmentProfileBinding.inflate(layoutInflater)
        return fmProfileFM.root
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}