package com.example.simplequiz

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1) viewを取得 + カウント用の変数iを用意
        val tvCount:TextView = findViewById(R.id.tvCount)
        val tvQuestion:TextView = findViewById(R.id.tvQuestion)
        val btn0:Button = findViewById(R.id.btn0)
        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)
        val btn3:Button = findViewById(R.id.btn3)
        var  i = 0

        // 2) 配列を用意
        val  quizData = arrayOf("A0","A1","A2","A3")

        // 4) 0~3までのリストを用意→シャッフル
        val  list = listOf(0,1,2,3)
        val  num = list.shuffled()

        // 3) ボタンにquizDataの0~3を表示させてみる
        btn0.text = quizData[num[0]]
        btn1.text = quizData[num[1]]
        btn2.text = quizData[num[2]]
        btn3.text = quizData[num[3]]


    }
}