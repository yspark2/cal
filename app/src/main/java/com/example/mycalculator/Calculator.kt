package com.example.mycalculator

import java.lang.Exception

class Calculator() {
    fun cal() {
        var num1 = inputInfo("num1").toString()
        var oper = inputInfo("oper").toString()
        var num2 = inputInfo("num2").toString()

        when (oper) {
            "+" -> AddOperation(num1.toDouble(), num2.toDouble()).add()
            "-" -> SubstractOperation(num1.toDouble(), num2.toDouble()).sub()
            "*" -> MultiplyOperation(num1.toDouble(), num2.toDouble()).mul()
            "/" -> DivideOperation(num1.toDouble(), num2.toDouble()).div()
            else -> println("입력 값이 올바르지 않습니다.")
        }
    }
    fun inputInfo(type: String): Any? {
        return when (type) {
            "num1" -> {
                print("첫 번째 숫자 입력 : ")
                while (true) {
                    try {
                        var number: String? = readLine()
                        // ?. 연산자를 사용하면, 앞의 변수가 null이 아닐때만 오른쪽 함수가
                        // 수행되고 null 이면 null을 반환한다.
                        return number?.toDouble() ?: -1
                    } catch (e: Exception) {
                        print("첫 번째 숫자 다시 입력 : ")
                    }
                }
            }
            "oper" -> {
                print("연산자 입력(+,-,*,/) : ")
                while (true) {
                    try {
                        var number: String? = readLine()
                        when (number) {
                            "+" -> return number?.toString() ?: -1
                            "-" -> return number?.toString() ?: -1
                            "*" -> return number?.toString() ?: -1
                            "/" -> return number?.toString() ?: -1
                            else -> print("연산자 다시 입력(+,-,*,/) : ")
                        }
                    } catch (e: Exception) {
                        //print("연산자 다시 입력(+,-,*,/) : ")
                    }
                }
            }
            "num2" -> {
                print("두 번째 숫자 입력 : ")
                while (true) {
                    try {
                        var number: String? = readLine()
                        return number?.toDouble() ?: -1
                    } catch (e: Exception) {
                        print("두 번째 숫자 다시 입력 : ")
                    }
                }
            }
            else -> {
            }
        }
    }
}