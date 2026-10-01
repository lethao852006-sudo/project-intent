package com.example.intent_2415141122120

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intent_2415141122120.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGuiThongTin.setOnClickListener {

            // Tạo Bundle
            val bundle = Bundle()

            // Đưa dữ liệu vào Bundle
            bundle.putString("hoTen", "Lê Thị Minh Thảo")
            bundle.putString("mssv", "2415141122120")
            bundle.putInt("tuoi", 20)

            // Tạo Intent
            val intent = Intent(this, SecondActivity::class.java)

            // Gửi Bundle qua Intent
            intent.putExtras(bundle)

            // Chuyển sang màn hình 2
            startActivity(intent)
        }
    }
}