package com.example.sharedpreference_dain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import com.example.sharedpreference_dain.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        autoLoginCheckBox.setOnCheckedChangeListener { button, isChecked ->
            ContextUtil.setAutoLogin(this, isChecked)



        }
    autoLoginCheckBox.isChecked = ContextUtil.getAutoLogin(this)
    }
 }