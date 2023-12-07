package com.example.paisesapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.RadioButton
import android.widget.Toast
import com.example.paisesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),OnClickListener {

    private lateinit var binding : ActivityMainBinding
    private var banderaSeleccionada: Int  = R.drawable.espana

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rbEspaA.setOnClickListener(this)
        binding.rbItalia.setOnClickListener(this)
        binding.rbFrancia.setOnClickListener(this)
        binding.rbColombia.setOnClickListener(this)
        binding.rbPortugal.setOnClickListener(this)
        binding.rbEcuador.setOnClickListener(this)
        binding.rbPolonia.setOnClickListener(this)
        binding.rbPeru.setOnClickListener(this)
        binding.rbGrecia.setOnClickListener(this)
        binding.rbSuiza.setOnClickListener(this)

        if (savedInstanceState != null) {
            banderaSeleccionada = savedInstanceState.getInt("selectedImageResource", R.drawable.espana)
            binding.ivBandera.setImageResource(banderaSeleccionada)
        }
    }

    override fun onClick(v: View?) {
        if (v is RadioButton){
            var checked =v.isChecked
            when(v?.id){
                binding.rbEspaA.id ->{
                    if(checked){
                        banderaSeleccionada = R.drawable.espana
                        binding.ivBandera.setImageResource(R.drawable.espana)
                    }
                }
                binding.rbColombia.id ->{
                    if(checked){
                        banderaSeleccionada = R.drawable.colombia
                        binding.ivBandera.setImageResource(R.drawable.colombia)
                    }
                }
                binding.rbItalia.id ->{
                    if(checked){
                        banderaSeleccionada = R.drawable.italia
                        binding.ivBandera.setImageResource(R.drawable.italia)
                    }
                }
                binding.rbFrancia.id ->{
                    if(checked){
                        banderaSeleccionada = R.drawable.francia
                        binding.ivBandera.setImageResource(R.drawable.francia)
                    }
                }
                binding.rbPortugal.id ->{
                    if(checked){
                        banderaSeleccionada = R.drawable.portugal
                        binding.ivBandera.setImageResource(R.drawable.portugal)
                    }
                }
                binding.rbEcuador.id ->{
                    if(checked){
                        banderaSeleccionada = R.drawable.ecuador
                        binding.ivBandera.setImageResource(R.drawable.ecuador)
                    }
                }
                binding.rbPolonia.id ->{
                    if(checked){
                        banderaSeleccionada = R.drawable.polonia
                        binding.ivBandera.setImageResource(R.drawable.polonia)
                    }
                }
                binding.rbPeru.id ->{
                    if(checked){
                        banderaSeleccionada = R.drawable.peru
                        binding.ivBandera.setImageResource(R.drawable.peru)
                    }
                }
                binding.rbGrecia.id ->{
                    if(checked){
                        banderaSeleccionada = R.drawable.grecia
                        binding.ivBandera.setImageResource(R.drawable.grecia)
                    }
                }
                binding.rbSuiza.id ->{
                    if(checked){
                        banderaSeleccionada = R.drawable.suiza
                        binding.ivBandera.setImageResource(R.drawable.suiza)
                    }
                }
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("selectedImageResource", banderaSeleccionada)
    }
}



