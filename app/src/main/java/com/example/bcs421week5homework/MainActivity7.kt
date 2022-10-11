package com.example.bcs421week5homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity7 : AppCompatActivity() {
    lateinit var mQ7b1: RadioButton
    lateinit var mQ7b2: RadioButton
    lateinit var mQ7b3: RadioButton
    lateinit var mQ7b4: RadioButton
    lateinit var mQ7btn: Button
    lateinit var mRG7: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        mQ7b1 = findViewById(R.id.q7b1)
        mQ7b2 = findViewById(R.id.q7b2)
        mQ7b3 = findViewById(R.id.q7b3)
        mQ7b4 = findViewById(R.id.q7b4)
        mQ7btn = findViewById(R.id.q7btn)
        mRG7 = findViewById(R.id.radioGroup7)

        mRG7.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.q7b1) {
                mQ7b1.setBackgroundColor(getColor(R.color.teal_200))
                mQ7b2.setBackgroundColor(getColor(R.color.white))
                mQ7b3.setBackgroundColor(getColor(R.color.white))
                mQ7b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q7b2) {
                mQ7b1.setBackgroundColor(getColor(R.color.white))
                mQ7b2.setBackgroundColor(getColor(R.color.teal_200))
                mQ7b3.setBackgroundColor(getColor(R.color.white))
                mQ7b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q7b3) {
                mQ7b1.setBackgroundColor(getColor(R.color.white))
                mQ7b2.setBackgroundColor(getColor(R.color.white))
                mQ7b3.setBackgroundColor(getColor(R.color.teal_200))
                mQ7b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q7b4) {
                mQ7b1.setBackgroundColor(getColor(R.color.white))
                mQ7b2.setBackgroundColor(getColor(R.color.white))
                mQ7b3.setBackgroundColor(getColor(R.color.white))
                mQ7b4.setBackgroundColor(getColor(R.color.teal_200))
            }
            mQ7btn.setOnClickListener {
                val intent = Intent(this,MainActivity8::class.java )
                startActivity(intent)
                if (checkedId == R.id.q7b1){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q7b2){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q7b3){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q7b4){
                    Toast.makeText(this, "CORRECT! You earned $100", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}