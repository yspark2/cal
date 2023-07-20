package com.example.mycalculator

class SubstractOperation(num1:Double, num2:Double) : AbstractOperation(){
    var num1 = num1
    var num2 = num2
    init {
        this.num1 = num1
        this.num2 = num2
    }
    override fun operation() : Double{
        var result = num1.minus(num2)
        return result
    }
}