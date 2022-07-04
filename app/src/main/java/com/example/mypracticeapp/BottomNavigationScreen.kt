package com.example.mypracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationScreen : AppCompatActivity() {

    lateinit  var bottomNavigation : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        if (savedInstanceState == null) {
            loadFragment(HomeFragment());

        }
        setContentView(R.layout.activity_bottom_navigation_screen)



        bottomNavigation =  findViewById(R.id.bottom_nav) as BottomNavigationView

        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> {
                    loadFragment(HomeFragment())
                    return@setOnItemSelectedListener true
                }
                    R.id.view -> {
                        loadFragment(ViewFragment())
                    return@setOnItemSelectedListener true
                    }
                    R.id.settings -> {
                        loadFragment(SettingFragment())
                        return@setOnItemSelectedListener true
                }

            }

            false;
        }


    }


    private  fun loadFragment(fragment: Fragment){
        val transition = supportFragmentManager.beginTransaction();
        transition.replace(R.id.container, fragment);
        transition.addToBackStack(null);
        transition.commit();
    }
}