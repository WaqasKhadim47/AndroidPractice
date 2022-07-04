package com.example.mypracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.mypracticeapp.databinding.ActivityBindingFragmentExampleBinding
import com.example.mypracticeapp.databinding.ActivityMainBinding

class BindingFragmentExample : AppCompatActivity() {
    private lateinit var binding: ActivityBindingFragmentExampleBinding
    lateinit var changeButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fragment1 = HomeFragment();
        val fragment2 = SettingFragment();
        loadFragment(fragment1)


        binding = ActivityBindingFragmentExampleBinding.inflate(layoutInflater);
        setContentView(binding.root)
        binding.btn1.setOnClickListener{
            loadFragment(fragment1)
        }

        binding.btn2.setOnClickListener{
            loadFragment(fragment2)

        }


    }

    private fun loadFragment(fragment : Fragment){
        val tranition = supportFragmentManager.beginTransaction();
        tranition.replace(R.id.fragment, fragment)
        tranition.addToBackStack(null)
        tranition.commit();
    }
}