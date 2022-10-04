package com.ckc.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Encapsulation
        //Kısaca erişebilirlik diyebiliriz

        var encap = encapsulation(23,"can")
        encap.age
        encap.testPaswordFun(1907)


        //Inheritance
        //miras alma " : " ile miras alma yapılır miras alınan sınıfın özelliklerini kullanabilir

        val a = Inheritance(10,"kalem")

        a.age
        a.name
        a.inheritanceFunTest()
        a.testPaswordFun(156)

        //polymorphism

        //static polymorphism

        var t = staticPoly()
        t.test()
        t.test(5)
        t.test(53,5,"can")
        t.test(5,9)


        //dynamic polymorphism

        var v = dynamicPoly()
        v.test()
        v.test2()












    }
}