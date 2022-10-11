package com.example.bcs421week5homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    lateinit var mQ2b1: RadioButton
    lateinit var mQ2b2: RadioButton
    lateinit var mQ2b3: RadioButton
    lateinit var mQ2b4: RadioButton
    lateinit var mQ2btn: Button
    lateinit var mRG2: RadioGroup
    lateinit var mTV2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        mQ2b1 = findViewById(R.id.q2b1)
        mQ2b2 = findViewById(R.id.q2b2)
        mQ2b3 = findViewById(R.id.q2b3)
        mQ2b4 = findViewById(R.id.q2b4)
        mQ2btn = findViewById(R.id.q2btn)
        mRG2 = findViewById(R.id.radioGroup2)
        mTV2 = findViewById(R.id.earned2)

        val num2 = intent.getStringExtra("KEY")

        mRG2.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.q2b1) {
                mQ2b1.setBackgroundColor(getColor(R.color.teal_200))
                mQ2b2.setBackgroundColor(getColor(R.color.white))
                mQ2b3.setBackgroundColor(getColor(R.color.white))
                mQ2b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q2b2) {
                mQ2b1.setBackgroundColor(getColor(R.color.white))
                mQ2b2.setBackgroundColor(getColor(R.color.teal_200))
                mQ2b3.setBackgroundColor(getColor(R.color.white))
                mQ2b4.setBackgroundColor(getColor(R.color.white))
                num2.plus(100)
            }
            if (checkedId == R.id.q2b3) {
                mQ2b1.setBackgroundColor(getColor(R.color.white))
                mQ2b2.setBackgroundColor(getColor(R.color.white))
                mQ2b3.setBackgroundColor(getColor(R.color.teal_200))
                mQ2b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q2b4) {
                mQ2b1.setBackgroundColor(getColor(R.color.white))
                mQ2b2.setBackgroundColor(getColor(R.color.white))
                mQ2b3.setBackgroundColor(getColor(R.color.white))
                mQ2b4.setBackgroundColor(getColor(R.color.teal_200))
            }
            mQ2btn.setOnClickListener {
                val intent = Intent(this,MainActivity3::class.java )
                startActivity(intent)
                if (checkedId == R.id.q2b1){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q2b2){
                    Toast.makeText(this, "CORRECT! You earned $100", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q2b3){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q2b4){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}