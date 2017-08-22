package com.project.chesskotlin.fragment

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.project.chesskotlin.R


/**
 * Created by Belgacem on 19/08/2017.
 */

class HomeFragment : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.home_view, container, false)
    }
}