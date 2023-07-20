package com.example.myCalculator

import com.example.mycalculator.Calculator
import java.lang.Exception

fun main() {
    var value1 = Calculator()
    value1.cal()
}

// Lv3 : AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기)
// DivideOperation(나누기) 연산 클래스들을 만든 후 클래스간의 관계를 고려하여
// Calculator 클래스와 관계를 맺기
// 관계를 맺은 후 필요하다면 Calculator 클래스의 내부코드를 변경하기
// 나머지 연산자(%) 기능은 제외
// Lv2와 비교하여 어떠한 점이 개선 되었는지 스스로 생각해 보기
// hint. 클래스의 책임(단일책임원칙)

    /*- Lv4 : AddOperation(더하기), SubtractOperation(빼기), MultiplyOperation(곱하기),
    DivideOperation(나누기) 연산 클래스들을 AbstractOperation라는 클래스명으로 만들어 사용하여
    추상화하고 Calculator 클래스의 내부 코드를 변경합니다.
    - Lv3 와 비교해서 어떠한 점이 개선 되었는지 스스로 생각해 봅니다.
    - hint. 클래스간의 결합도, 의존성(의존성역전원칙)*/