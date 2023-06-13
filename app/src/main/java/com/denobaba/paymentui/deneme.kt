package com.denobaba.paymentui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.denobaba.paymentui.databinding.ActivityDenemeBinding

class deneme : AppCompatActivity() {
    private lateinit var binding: ActivityDenemeBinding
    private lateinit var listhere: ArrayList<modelhere>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_deneme)
        binding = ActivityDenemeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        listhere = ArrayList<modelhere>()

        val name1 = modelhere("deniz")
        listhere.add(name1)

        for (i in listhere){
            println(i)
        }

        binding.name.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do something or nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Do something or nothing.
            }

            override fun afterTextChanged(s: Editable) {
                binding.goeshere.text = s.toString()
            }
        })
    }



    }
