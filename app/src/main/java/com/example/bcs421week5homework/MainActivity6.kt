package com.example.bcs421week5homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity6 : AppCompatActivity() {
    lateinit var mQ6b1: RadioButton
    lateinit var mQ6b2: RadioButton
    lateinit var mQ6b3: RadioButton
    lateinit var mQ6b4: RadioButton
    lateinit var mQ6btn: Button
    lateinit var mRG6: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        mQ6b1 = findViewById(R.id.q6b1)
        mQ6b2 = findViewById(R.id.q6b2)
        mQ6b3 = findViewById(R.id.q6b3)
        mQ6b4 = findViewById(R.id.q6b4)
        mQ6btn = findViewById(R.id.q6btn)
        mRG6 = findViewById(R.id.radioGroup6)

        mRG6.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.q6b1) {
                mQ6b1.setBackgroundColor(getColor(R.color.teal_200))
                mQ6b2.setBackgroundColor(getColor(R.color.white))
                mQ6b3.setBackgroundColor(getColor(R.color.white))
                mQ6b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q6b2) {
                mQ6b1.setBackgroundColor(getColor(R.color.white))
                mQ6b2.setBackgroundColor(getColor(R.color.teal_200))
                mQ6b3.setBackgroundColor(getColor(R.color.white))
                mQ6b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q6b3) {
                mQ6b1.setBackgroundColor(getColor(R.color.white))
                mQ6b2.setBackgroundColor(getColor(R.color.white))
                mQ6b3.setBackgroundColor(getColor(R.color.teal_200))
                mQ6b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q6b4) {
                mQ6b1.setBackgroundColor(getColor(R.color.white))
                mQ6b2.setBackgroundColor(getColor(R.color.white))
                mQ6b3.setBackgroundColor(getColor(R.color.white))
                mQ6b4.setBackgroundColor(getColor(R.color.teal_200))
            }
            mQ6btn.setOnClickListener {
                val intent = Intent(this,MainActivity7::class.java )
                startActivity(intent)
                if (checkedId == R.id.q6b1){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q6b2){
                    Toast.makeText(this, "CORRECT! You earned $100", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q6b3){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q6b4){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}