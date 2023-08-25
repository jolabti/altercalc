package com.example.emobcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.example.emobcalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var stringToCount: String = ""
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAddId.setOnClickListener(this)
        binding.buttonMinusId.setOnClickListener(this)
        binding.buttonDevideId.setOnClickListener(this)
        binding.buttonComasId.setOnClickListener(this)
        binding.buttonTimesId.setOnClickListener(this)
        binding.buttonCalculateId.setOnClickListener(this)
        binding.buttonResetId.setOnClickListener(this)

        binding.btnNumber0Id.setOnClickListener(this)
        binding.btnNumber1Id.setOnClickListener(this)
        binding.btnNumber2Id.setOnClickListener(this)
        binding.btnNumber3Id.setOnClickListener(this)
        binding.btnNumber4Id.setOnClickListener(this)
        binding.btnNumber5Id.setOnClickListener(this)
        binding.btnNumber6Id.setOnClickListener(this)
        binding.btnNumber7Id.setOnClickListener(this)
        binding.btnNumber8Id.setOnClickListener(this)
        binding.btnNumber9Id.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var buttonPress: AppCompatButton? = v?.context?.let { AppCompatButton(it) }
        when (v?.id) {
            R.id.button_add_id -> stringToCount += "+"
            R.id.button_minus_id -> stringToCount += "-"
            R.id.button_devide_id -> stringToCount += "/"
            R.id.button_comas_id -> stringToCount += "."
            R.id.button_times_id -> stringToCount += "*"
            R.id.btn_number_0_id -> stringToCount += "0"
            R.id.btn_number_1_id -> stringToCount += "1"
            R.id.btn_number_2_id -> stringToCount += "2"
            R.id.btn_number_3_id -> stringToCount += "3"
            R.id.btn_number_4_id -> stringToCount += "4"
            R.id.btn_number_5_id -> stringToCount += "5"
            R.id.btn_number_6_id -> stringToCount += "6"
            R.id.btn_number_7_id -> stringToCount += "7"
            R.id.btn_number_8_id -> stringToCount += "8"
            R.id.btn_number_9_id -> stringToCount += "9"

            R.id.button_calculate_id -> binding.edInputNumberId.setText(Actions.calculate(stringToCount))
            R.id.button_reset_id -> reset()
        }

        if(v?.id!=R.id.button_calculate_id){
            binding.edInputNumberId.setText(stringToCount)
        }
    }

    private fun reset(){
        stringToCount=""
        binding.edInputNumberId.setText("")
    }

    private fun result(input:String){
        var finalCalculate:String = Actions.calculate(input)
        stringToCount = finalCalculate
        binding.edInputNumberId.setText(finalCalculate)
    }
}
