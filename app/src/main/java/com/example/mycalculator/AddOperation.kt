package com.example.mycalculator

class AddOperation(_num1:Double, _num2:Double) {
    var num1 = _num1
    var num2 = _num2
    init {
        this.num1 = _num1
        this.num2 = _num2
    }
    fun add(){
        println("결과 값 : ${num1.plus(num2)}")
    }
}