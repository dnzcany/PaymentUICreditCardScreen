package com.denobaba.paymentui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.denobaba.paymentui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main),

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.namee.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do something or nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Do something or nothing.
            }

            override fun afterTextChanged(s: Editable) {
                binding.yourname.text = s.toString().uppercase()
            }
        })

        binding.validthru.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do something or nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Do something or nothing.
            }

            override fun afterTextChanged(s: Editable) {
                binding.validthruhere.text = s.toString()
            }
        })



        binding.bankcardnumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do something or nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Do something or nothing.
            }

            override fun afterTextChanged(s: Editable) {
                val text = s.toString()
                binding.bankcardnumber1.text = if (text.length >= 4) text.substring(0, 4) else text
            }
        })


        binding.bankcardnumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do something or nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Do something or nothing.
            }

            override fun afterTextChanged(s: Editable) {
                val text = s.toString()
                if (text.length >= 8) {
                    binding.bankcardnumber2.text = text.substring(4, 8)
                } else if (text.length > 4) {
                    binding.bankcardnumber2.text = text.substring(4, text.length)
                } else {
                    binding.bankcardnumber2.text = ""
                }
            }
        })

        binding.bankcardnumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do something or nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Do something or nothing.
            }

            override fun afterTextChanged(s: Editable) {
                val text = s.toString()
                if (text.length >= 12) {
                    binding.bankcardnumber3.text = text.substring(8, 12)
                } else if (text.length > 8) {
                    binding.bankcardnumber3.text = text.substring(8, text.length)
                } else {
                    binding.bankcardnumber3.text = ""
                }
            }
        })

        binding.bankcardnumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do something or nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Do something or nothing.
            }

            override fun afterTextChanged(s: Editable) {
                val text = s.toString()
                if (text.length >= 16) {
                    binding.bankcardnumber4.text = text.substring(12, 16)
                } else if (text.length > 12) {
                    binding.bankcardnumber4.text = text.substring(12, text.length)
                } else {
                    binding.bankcardnumber4.text = ""
                }
            }
        })

        binding.cvv.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do something or nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Do something or nothing.
            }

            override fun afterTextChanged(s: Editable) {
                binding.cvvhere.text = s.toString()
            }
        })









    }

}