package jp.techacademy.syouya.ueki.kotlinlog

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   //ここを追加
import java.security.acl.LastOwnerException
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val human = Human(".",0)


        human.think()
        human.say()
}
        }
