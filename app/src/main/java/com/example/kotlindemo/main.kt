package com.example.kotlindemo

fun main() {
    /*arithmetic operators*/
    val n1 = 10.8
    val n2 = 16.5
    var result : Double

    result = n1 + n2
    println("addition : $result")
    result = n1 - n2
    println("subtraction : $result")
    result = n1 * n2
    println("multiplication : $result")
    result = n1/n2
    println("quotient : $result")
    result = n1%n2
    println("remainder : $result")

    /*assignment operator*/
    var num = 15
    num *= 2
    println("number = $num")

    /*comparison*/
    val a = 20
    val b = -5
    val c = 10
    println(a>b)
    var res : Boolean
    res = (a>b)&&(c<b)     //logical operator
    println("$res")

    /* in operator*/
    val numbers = 1..20
    if(7 in numbers) {
        println("numbers array contains 7")
    }

    /* as operator*/
    val s1:Any=7
    val s2:String?= s1 as? String
    println(s2)







}