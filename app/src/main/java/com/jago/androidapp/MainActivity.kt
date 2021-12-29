package com.jago.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main(args: Array<String>) {
        val range: Byte = 123
        val username = "jbjsbdfjk"
        val password = "bkdnfklansd"
        println("jfddbgjksdbfbjs;adbfjsdabfjsadbfbsd : ${range}")
        println("usernamedgnkzsngkjdsn : ${username}")
        println("passwordsbzfkjszdbjfz : ${password}")
    }
}