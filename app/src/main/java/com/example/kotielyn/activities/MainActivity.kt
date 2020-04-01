package com.example.kotielyn.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotielyn.R
import com.example.kotielyn.adapters.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val items: ArrayList<String> = ArrayList()
    private val TAG: String = MainActivity::class.java.simpleName;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate")

        recyclerView.layoutManager = LinearLayoutManager(this)
        // recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = ItemAdapter(items = items, context = this)

        populateItems()
    }

    private fun populateItems() {
        for (i in 0..20) {
            items.add(i.toString())
        }

        // recyclerView.adapter?.notifyDataSetChanged();
    }
}
