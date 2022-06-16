package com.jane.calculatingactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class calculatorActivity : AppCompatActivity() {
    lateinit var tilnumone:TextInputLayout
    lateinit var etnumber:TextInputEditText
    lateinit var tilnumtwo:TextInputLayout
    lateinit var etnumbertwo:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnsub:Button
    lateinit var btnModule:Button
    lateinit var btndividing:Button
    lateinit var tvResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        tilnumone=findViewById(R.id.tilnumone)
        etnumber=findViewById(R.id.etnumber)
        tilnumtwo=findViewById(R.id.tilnumtwo)
        etnumbertwo=findViewById(R.id.etnumbertwo)
        btnAdd=findViewById(R.id.btnadd)
        btnsub=findViewById(R.id.btnsub)
        btnModule=findViewById(R.id.btnModule)
        btndividing=findViewById(R.id.btndividing)
        tvResult=findViewById(R.id.tvResult)


        btnAdd.setOnClickListener {

            var number = etnumber.text.toString().toInt()
            var numbers= etnumbertwo.text.toString().toInt()
            addition(number,numbers)


            btnsub.setOnClickListener {
                var numbers=etnumber.text.toString().toInt()
                var Number = etnumbertwo.text.toString().toInt()
                subtract(numbers,Number)

                btnModule.setOnClickListener {
                    var num = etnumber.text.toString().toInt()
                    var nums = etnumbertwo.text.toString().toInt()
                    module(num,nums)

                    btndividing.setOnClickListener {
                        var Nums=etnumber.text.toString().toInt()
                        var numms=etnumbertwo.text.toString().toInt()
                        division(Nums,numms)
                    }
                }

            }
        }

        }
    fun addition(number: Int, numbers: Int) {
        var addnum= (number+numbers)
            tvResult.text= addnum.toString()
    }
    fun subtract(numbers: Int,Number:Int){
        var subtractnumber= (numbers-Number)
        tvResult.text=subtractnumber.toString()
    }
    fun module(num:Int,nums:Int){
        var modulus=(num%nums)
        tvResult.text=modulus.toString()
    }
    fun division(Nums:Int,numms:Int){
        var divide = (Nums/numms)
        tvResult.text=divide.toString()

        }
    }

