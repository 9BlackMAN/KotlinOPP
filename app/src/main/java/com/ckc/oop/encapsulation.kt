package com.ckc.oop

import android.widget.Toast

open class encapsulation(age : Int, name : String) {


    init {
        //consturactor gibi...
    }


    var name : String? = name
        get
        private set

    var age : Int? = age
        private set
        get


    fun testPaswordFun(pasword:Int):String{
        if (pasword==1907){
            return "asdkjab"
        }else{
            return "errorrrrr"
        }
    }


}