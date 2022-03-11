package com.binar.challenge2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Shopee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopee)
        val shopeeFragment = ShopeeFragment()
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.botNav)
        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->makeCurrentFragment(shopeeFragment)

            }
            true
        }
        makeCurrentFragment(shopeeFragment)

    }
    private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout, fragment)
            commit()
        }
    }
}