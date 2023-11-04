package com.example.raqamterish

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.raqamterish.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dialogButton.setOnClickListener{
            val num=binding.edtPhone.text.toString()
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:$num")))

        }

    }


}