package com.example.btintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btintent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Nhận Bundle từ Intent
        val bundle = intent.extras

        // Lấy dữ liệu từ Bundle
        val hoTen = bundle?.getString("hoTen")
        val mssv = bundle?.getString("mssv")
        val tuoi = bundle?.getInt("tuoi")

        // Hiển thị dữ liệu
        binding.tvNhanHoTen.text = "Họ tên: $hoTen"
        binding.tvNhanMssv.text = "MSSV: $mssv"
        binding.tvNhanTuoi.text = "Tuổi: $tuoi"

        // Quay lại màn hình 1
        binding.btnQuayLai.setOnClickListener {
            finish()
        }
    }
}