package com.project.chesskotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.project.chesskotlin.fragment.HomeFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gotohome();


    }

    private fun gotohome() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val fragmentTransaction = supportFragmentManager
                .beginTransaction()
        val homeFragment = HomeFragment()//the fragment you want to show
        //profileFragment.setArguments(bundle)
        fragmentTransaction
                .replace(R.id.content_frame, homeFragment)//R.id.content_frame is the layout you want to replace
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}



