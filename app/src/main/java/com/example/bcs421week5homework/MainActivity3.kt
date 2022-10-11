package com.example.bcs421week5homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    lateinit var mQ3b1: RadioButton
    lateinit var mQ3b2: RadioButton
    lateinit var mQ3b3: RadioButton
    lateinit var mQ3b4: RadioButton
    lateinit var mQ3btn: Button
    lateinit var mRG3: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        mQ3b1 = findViewById(R.id.q3b1)
        mQ3b2 = findViewById(R.id.q3b2)
        mQ3b3 = findViewById(R.id.q3b3)
        mQ3b4 = findViewById(R.id.q3b4)
        mQ3btn = findViewById(R.id.q3btn)
        mRG3 = findViewById(R.id.radioGroup3)

        mRG3.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.q3b1) {
                mQ3b1.setBackgroundColor(getColor(R.color.teal_200))
                mQ3b2.setBackgroundColor(getColor(R.color.white))
                mQ3b3.setBackgroundColor(getColor(R.color.white))
                mQ3b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q3b2) {
                mQ3b1.setBackgroundColor(getColor(R.color.white))
                mQ3b2.setBackgroundColor(getColor(R.color.teal_200))
                mQ3b3.setBackgroundColor(getColor(R.color.white))
                mQ3b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q3b3) {
                mQ3b1.setBackgroundColor(getColor(R.color.white))
                mQ3b2.setBackgroundColor(getColor(R.color.white))
                mQ3b3.setBackgroundColor(getColor(R.color.teal_200))
                mQ3b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q3b4) {
                mQ3b1.setBackgroundColor(getColor(R.color.white))
                mQ3b2.setBackgroundColor(getColor(R.color.white))
                mQ3b3.setBackgroundColor(getColor(R.color.white))
                mQ3b4.setBackgroundColor(getColor(R.color.teal_200))
            }
            mQ3btn.setOnClickListener {
                val intent = Intent(this,MainActivity4::class.java )
                startActivity(intent)
                if (checkedId == R.id.q3b1){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q3b2){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q3b3){
                    Toast.makeText(this, "CORRECT! You earned $100", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q3b4){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}