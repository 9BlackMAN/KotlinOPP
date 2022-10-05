package com.ckc.oop

class InterfaceMain : InterfaceFirst,InterfaceTwo {
    override var name: String
        get() = "Hello"
        set(value) {}
}