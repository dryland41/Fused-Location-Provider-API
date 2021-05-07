package com.namespacermcw.fused_location_provider_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var fragContainer = findViewById(R.id.fragment_container_view)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view, FirstFragment.newInstance())
            .commit()
    }
}