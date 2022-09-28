package com.example.pr4_20012011109

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button


lateinit var btn_ref_browser: Button
lateinit var btn_ref_map:Button
lateinit var btn_ref_msg: Button
lateinit var btn_ref_call: Button
lateinit var btn_ref_alarm: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_ref_browser = findViewById(R.id.bt_browser)
        btn_ref_map = findViewById(R.id.bt_map)
        btn_ref_msg = findViewById(R.id.bt_msg)
        btn_ref_call = findViewById(R.id.bt_call)
        btn_ref_alarm = findViewById(R.id.bt_alarm)
        implicit_Intent()
    }

    fun implicit_Intent() {
        btn_ref_browser.setOnClickListener {
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/accounts/login/")).also {
                startActivity(it)

            }
        }
        btn_ref_map.setOnClickListener {
            val address_url: Uri = Uri.parse("geo:0,0?q=" + "mehsana")
            val it = Intent(Intent.ACTION_VIEW, address_url)
            startActivity(it)
        }
        btn_ref_msg.setOnClickListener {
            val msg: Uri= Uri.fromParts("sms", "Manav M Patel", null)
            val i2 = Intent(Intent.ACTION_SENDTO, msg)
            startActivity(i2)
        }
        btn_ref_call.setOnClickListener {
            val call: Uri= Uri.parse("tel:20012011109")
            val i3 = Intent(Intent.ACTION_VIEW, call)
            startActivity(i3)
        }
        btn_ref_alarm.setOnClickListener {
            val i1: Intent = Intent(AlarmClock.ACTION_SHOW_ALARMS)
            startActivity(i1)

            }
        }
    }