package jp.techacademy.syouya.ueki.kotlinlog

import android.util.Log


    open class Human:Animal, Thinkble{
    //プロパティ
        var hobby :String

    //引数付きコンストラクタ

    constructor(name: String, age: Int) : super(name, age) {
     this.hobby = "メソッド"
    }
    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest",   "「私の名前は " + this.name + "です。" + "年は"  + this.age + "歳です。」")
    }

    //thinkbleインターフェースのメソッドをオーバーライド
      override fun think() {
        Log.d("kotlintest",  "「私は" +  this.hobby + "について考える。" )




    }
    }








