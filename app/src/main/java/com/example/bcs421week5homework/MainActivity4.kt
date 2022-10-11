package com.example.bcs421week5homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    lateinit var mQ4b1: RadioButton
    lateinit var mQ4b2: RadioButton
    lateinit var mQ4b3: RadioButton
    lateinit var mQ4b4: RadioButton
    lateinit var mQ4btn: Button
    lateinit var mRG4: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        mQ4b1 = findViewById(R.id.q4b1)
        mQ4b2 = findViewById(R.id.q4b2)
        mQ4b3 = findViewById(R.id.q4b3)
        mQ4b4 = findViewById(R.id.q4b4)
        mQ4btn = findViewById(R.id.q4btn)
        mRG4 = findViewById(R.id.radioGroup4)

        mRG4.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.q4b1) {
                mQ4b1.setBackgroundColor(getColor(R.color.teal_200))
                mQ4b2.setBackgroundColor(getColor(R.color.white))
                mQ4b3.setBackgroundColor(getColor(R.color.white))
                mQ4b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q4b2) {
                mQ4b1.setBackgroundColor(getColor(R.color.white))
                mQ4b2.setBackgroundColor(getColor(R.color.teal_200))
                mQ4b3.setBackgroundColor(getColor(R.color.white))
                mQ4b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q4b3) {
                mQ4b1.setBackgroundColor(getColor(R.color.white))
                mQ4b2.setBackgroundColor(getColor(R.color.white))
                mQ4b3.setBackgroundColor(getColor(R.color.teal_200))
                mQ4b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q4b4) {
                mQ4b1.setBackgroundColor(getColor(R.color.white))
                mQ4b2.setBackgroundColor(getColor(R.color.white))
                mQ4b3.setBackgroundColor(getColor(R.color.white))
                mQ4b4.setBackgroundColor(getColor(R.color.teal_200))
            }
            mQ4btn.setOnClickListener {
                val intent = Intent(this,MainActivity5::class.java )
                startActivity(intent)
                if (checkedId == R.id.q4b1){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q4b2){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q4b3){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q4b4){
                    Toast.makeText(this, "CORRECT! You earned $100", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}