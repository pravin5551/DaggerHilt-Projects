package com.example.nobrokerdaggerhilt.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.nobrokerdaggerhilt.R
import kotlinx.android.synthetic.main.activity_after_click.*

class AfterClickActivity : AppCompatActivity() {
    private var url = ""
    private var title = ""
    private var subtitle = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_click)
        getIntentData()

        //finish the activity after clicking back button
        imgBack.setOnClickListener {
            finish()
        }
    }

    private fun getIntentData() {
        url = intent.getStringExtra("url")!!
        title = intent.getStringExtra("title")!!
        subtitle = intent.getStringExtra("subtitle")!!
        getDataToUI()
    }

    private fun getDataToUI() {
        Glide.with(image).load(url).into(image)
        textViewTitle.text = title
        textViewSubtitle.text = subtitle
    }
}