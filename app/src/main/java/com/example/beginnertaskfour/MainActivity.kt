package com.example.beginnertaskfour

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.beginnertaskfour.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvCancel.setOnClickListener { binding.etMeterValue.text.clear() }

        binding.ivBackspace.setOnClickListener { backSpace() }

        binding.ivCalculate.setOnClickListener { calculate() }

        binding.tv00.setOnClickListener { binding.etMeterValue.text.append("00") }
        binding.tv0.setOnClickListener { binding.etMeterValue.text.append("0") }
        binding.tv1.setOnClickListener { binding.etMeterValue.text.append("1") }
        binding.tv2.setOnClickListener { binding.etMeterValue.text.append("2") }
        binding.tv3.setOnClickListener { binding.etMeterValue.text.append("3") }
        binding.tv4.setOnClickListener { binding.etMeterValue.text.append("4") }
        binding.tv5.setOnClickListener { binding.etMeterValue.text.append("5") }
        binding.tv6.setOnClickListener { binding.etMeterValue.text.append("6") }
        binding.tv7.setOnClickListener { binding.etMeterValue.text.append("7") }
        binding.tv8.setOnClickListener { binding.etMeterValue.text.append("8") }
        binding.tv9.setOnClickListener { binding.etMeterValue.text.append("9") }
        binding.tvDot.setOnClickListener { binding.etMeterValue.text.append(".") }

    }

    private fun backSpace() {

        val meterValue = binding.etMeterValue.text.toString()
        if (meterValue.isNotEmpty()) {
            val meter = meterValue.substring(0, meterValue.length - 1)
            binding.etMeterValue.setText(meter)
        }
        else if (meterValue.isEmpty()) {
            binding.etMeterValue.setText("")
        }

    }

    private fun calculate() {

        val meter = binding.etMeterValue.text.toString()

        if (meter.isNotEmpty()) {
            val footResult = binding.etMeterValue.text.toString().toFloat() * 3.2808399
            binding.tvFootValue.text = footResult.toString()
        }
        else if (meter.isEmpty()) {
            binding.tvFootValue.text = ""
        }

    }

}
