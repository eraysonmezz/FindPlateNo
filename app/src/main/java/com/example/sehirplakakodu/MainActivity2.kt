package com.example.sehirplakakodu

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sehirplakakodu.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            if(binding.editTextNumber2.text.isNotEmpty()){
                var plakaKodu=binding.editTextNumber2.text.toString().toInt()
                when(plakaKodu){
                    35->binding.textView2.text="İzmir"
                    34->binding.textView2.text="İstanbul"
                    6->binding.textView2.text="Ankara"
                    31->binding.textView2.text="Hatay"
                    9->binding.textView2.text="Aydın"
                    else->{
                        binding.textView2.text="Bulunamadı."
                    }
                }
            }
            else{
                binding.textView2.text= "Şehir Plaka Kodu Giriniz."
            }
            binding.editTextNumber2.text.clear()
        }
//        enableEdgeToEdge()
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}