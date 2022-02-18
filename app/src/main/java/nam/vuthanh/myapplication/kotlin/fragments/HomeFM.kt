package nam.vuthanh.myapplication.kotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nam.vuthanh.myapplication.R
import nam.vuthanh.myapplication.databinding.FragmentHomeBinding


class HomeFM : Fragment() {
    lateinit var fmHomeBinding: FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fmHomeBinding = FragmentHomeBinding.inflate(layoutInflater)
        return fmHomeBinding.root
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}