package jp.techacademy.syouya.ueki.kotlinlog

import android.util.Log

class Dog {
    //プロパティ
    var name: String
    var age: Int

    //引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age

    }
    //メソッド
    fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}


