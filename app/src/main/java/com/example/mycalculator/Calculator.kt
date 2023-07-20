package com.example.mycalculator

import java.lang.Exception

class Calculator() {
    fun cal() {
        var num1 = inputInfo("num1").toString()
        var oper1 = inputInfo("oper1").toString()
        var num2 = inputInfo("num2").toString()
        var oper2 = inputInfo("oper2").toString()
        var num3 = inputInfo("num3").toString()
        var brac = inputInfo("brac").toString()
        var temp = arrayListOf<String>(num1, num2, num3, oper1, oper2, num2)
        var sum: Double = 0.0

        if (temp[3] == "+" || temp[3] == "-") {
            for(idx in 2 downTo 1){
                when(temp[idx+2]){  // num2 oper2 num3  ||  num1 oper1 sum
                    "+" -> sum = AddOperation(temp[idx-1].toDouble(), temp[idx].toDouble()).operation()
                    "-" -> sum = SubstractOperation(temp[idx-1].toDouble(), temp[idx].toDouble()).operation()
                    "*" -> sum = MultiplyOperation(temp[idx-1].toDouble(), temp[idx].toDouble()).operation()
                    "/" -> sum = DivideOperation(temp[idx-1].toDouble(), temp[idx].toDouble()).operation()
                    else -> println("입력 값이 올바르지 않습니다.")
                }
                temp[1] = sum.toString()
            }
            println("결과 값 : ${temp[0]} ${temp[3]} (${temp[5]} ${temp[4]} ${temp[2]}) = ${sum}")
        } else {
            for(idx in 0 until 2){
                when(temp[idx+3]){  // num1 oper1 num2 || sum oper2 num3
                    "+" -> sum = AddOperation(temp[idx].toDouble(), temp[idx+1].toDouble()).operation()
                    "-" -> sum = SubstractOperation(temp[idx].toDouble(), temp[idx+1].toDouble()).operation()
                    "*" -> sum = MultiplyOperation(temp[idx].toDouble(), temp[idx+1].toDouble()).operation()
                    "/" -> sum = DivideOperation(temp[idx].toDouble(), temp[idx+1].toDouble()).operation()
                    else -> println("입력 값이 올바르지 않습니다.")
                }
                temp[1] = sum.toString()
            }
            println("결과 값 : (${temp[0]} ${temp[3]} ${temp[5]}) ${temp[4]} ${temp[2]} = ${sum}")
        }
    }

    fun inputInfo(type: String): Any? {
        return when (type) {
            "num1" -> {
                print("첫 번째 숫자 입력 : ")
                while (true) {
                    try {
                        var number: String? = readLine()
                        return number?.toDouble() ?: -1
                    } catch (e: Exception) {
                        print("첫 번째 숫자 다시 입력 : ")
                    }
                }
            }

            "oper1" -> {
                print("첫 번째 연산자 입력(+,-,*,/) : ")
                while (true) {
                    try {
                        var number: String? = readLine()
                        when (number) {
                            "+" -> return number?.toString() ?: -1
                            "-" -> return number?.toString() ?: -1
                            "*" -> return number?.toString() ?: -1
                            "/" -> return number?.toString() ?: -1
                            else -> print("첫 번째 연산자 다시 입력(+,-,*,/) : ")
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

            "oper2" -> {
                print("두 번째 연산자 입력(+,-,*,/) : ")
                while (true) {
                    try {
                        var number: String? = readLine()
                        when (number) {
                            "+" -> return number?.toString() ?: -1
                            "-" -> return number?.toString() ?: -1
                            "*" -> return number?.toString() ?: -1
                            "/" -> return number?.toString() ?: -1
                            else -> print("두 번째 연산자 다시 입력(+,-,*,/) : ")
                        }
                    } catch (e: Exception) {
                        //print("연산자 다시 입력(+,-,*,/) : ")
                    }
                }
            }

            "num3" -> {
                print("세 번째 숫자 입력 : ")
                while (true) {
                    try {
                        var number: String? = readLine()
                        return number?.toDouble() ?: -1
                    } catch (e: Exception) {
                        print("세 번째 숫자 다시 입력 : ")
                    }
                }
            }
            else -> {
            }

        }
    }
}