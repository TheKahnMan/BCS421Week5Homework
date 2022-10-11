package com.example.bcs421week5homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    lateinit var mQ5b1: RadioButton
    lateinit var mQ5b2: RadioButton
    lateinit var mQ5b3: RadioButton
    lateinit var mQ5b4: RadioButton
    lateinit var mQ5btn: Button
    lateinit var mRG5: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        mQ5b1 = findViewById(R.id.q5b1)
        mQ5b2 = findViewById(R.id.q5b2)
        mQ5b3 = findViewById(R.id.q5b3)
        mQ5b4 = findViewById(R.id.q5b4)
        mQ5btn = findViewById(R.id.q5btn)
        mRG5 = findViewById(R.id.radioGroup5)

        mRG5.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.q5b1) {
                mQ5b1.setBackgroundColor(getColor(R.color.teal_200))
                mQ5b2.setBackgroundColor(getColor(R.color.white))
                mQ5b3.setBackgroundColor(getColor(R.color.white))
                mQ5b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q5b2) {
                mQ5b1.setBackgroundColor(getColor(R.color.white))
                mQ5b2.setBackgroundColor(getColor(R.color.teal_200))
                mQ5b3.setBackgroundColor(getColor(R.color.white))
                mQ5b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q5b3) {
                mQ5b1.setBackgroundColor(getColor(R.color.white))
                mQ5b2.setBackgroundColor(getColor(R.color.white))
                mQ5b3.setBackgroundColor(getColor(R.color.teal_200))
                mQ5b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q5b4) {
                mQ5b1.setBackgroundColor(getColor(R.color.white))
                mQ5b2.setBackgroundColor(getColor(R.color.white))
                mQ5b3.setBackgroundColor(getColor(R.color.white))
                mQ5b4.setBackgroundColor(getColor(R.color.teal_200))
            }
            mQ5btn.setOnClickListener {
                val intent = Intent(this,MainActivity6::class.java )
                startActivity(intent)
                if (checkedId == R.id.q5b1){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q5b2){
                    Toast.makeText(this, "CORRECT! You earned $100", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q5b3){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q5b4){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}