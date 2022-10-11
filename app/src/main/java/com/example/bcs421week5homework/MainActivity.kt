package com.example.bcs421week5homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var mQ1b1: RadioButton
    lateinit var mQ1b2: RadioButton
    lateinit var mQ1b3: RadioButton
    lateinit var mQ1b4: RadioButton
    lateinit var mQ1btn: Button
    lateinit var mRG1: RadioGroup
    lateinit var mTV2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mQ1b1 = findViewById(R.id.q1b1)
        mQ1b2 = findViewById(R.id.q1b2)
        mQ1b3 = findViewById(R.id.q1b3)
        mQ1b4 = findViewById(R.id.q1b4)
        mQ1btn = findViewById(R.id.q1btn)
        mRG1 = findViewById(R.id.radioGroup)
        mTV2 = findViewById(R.id.earned2)

        val num1 = 0
        //val totalNum

        mRG1.setOnCheckedChangeListener {group, checkedId -> //when a radio button is selected,
            if (checkedId == R.id.q1b1) {                    //the button selected has it's background
                mQ1b1.setBackgroundColor(getColor(R.color.teal_200)) //changed to teal while the other
                mQ1b2.setBackgroundColor(getColor(R.color.white))  //buttons backgrounds are changed
                mQ1b3.setBackgroundColor(getColor(R.color.white))  //to white
                mQ1b4.setBackgroundColor(getColor(R.color.white))
                num1.plus(100)
            }
            if (checkedId == R.id.q1b2) {
                mQ1b1.setBackgroundColor(getColor(R.color.white))
                mQ1b2.setBackgroundColor(getColor(R.color.teal_200))
                mQ1b3.setBackgroundColor(getColor(R.color.white))
                mQ1b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q1b3) {
                mQ1b1.setBackgroundColor(getColor(R.color.white))
                mQ1b2.setBackgroundColor(getColor(R.color.white))
                mQ1b3.setBackgroundColor(getColor(R.color.teal_200))
                mQ1b4.setBackgroundColor(getColor(R.color.white))
            }
            if (checkedId == R.id.q1b4) {
                mQ1b1.setBackgroundColor(getColor(R.color.white))
                mQ1b2.setBackgroundColor(getColor(R.color.white))
                mQ1b3.setBackgroundColor(getColor(R.color.white))
                mQ1b4.setBackgroundColor(getColor(R.color.teal_200))
            }
            mQ1btn.setOnClickListener {
                val intent = Intent(this,MainActivity2::class.java ).also {
                    intent.putExtra("KEY", num1) }
                startActivity(intent)
                if (checkedId == R.id.q1b1){
                    Toast.makeText(this, "CORRECT! You earned $100", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q1b2){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q1b3){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
                if (checkedId == R.id.q1b4){
                    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}