package com.atilsamancioglu.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val kullaniciAdi = SecondFragmentArgs.fromBundle(it).username
            textView2.text = kullaniciAdi
        }

        button2.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}