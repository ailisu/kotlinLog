package jp.techacademy.syouya.ueki.kotlinlog

import android.util.Log

open class Human: Animal {
    val hobby = String() + "${"String"}"

    //引数付きコンストラクタ

    constructor(name: String, age: Int): super(name, age){

        this.name = ""
        this.age = 0

    }
    //Animalクラスのメソッドをオーバーライド
       override  fun say() {
        Log.d("kotlintest", this.name + "("+ this.age +"歳)" +"「私の名前は～～です。年は～～歳です。」"+ "(～～はメンバ変数から取得)")
    }
    //thinkbleインターフェースのメソッドをオーバーライド
        fun think() {
        Log.d("kotlintest", this.name + "("+ this.age +"歳)" +"「私は～～について考える。」"+ "(～～はhobbyから取得)")

    }

}