package com.example.kotlindemo

open class Person1(age: Int,name: String) {
    init {
        println("My name is $name")
        println("My age is $age")
    }
}
class MathTeacher(age:Int, name: String ): Person1(age,name){

    fun teachMaths() {
        println("I teach in primary school")
    }
}

class Footballer(age: Int, name: String): Person1(age,name){

    fun playFootball() {
        println("I play for LA Galaxy")
    }
}

class Businessman(age: Int, name: String): Person1(age,name){
    fun runBusiness() {
        println("I run stock brokerage business")
    }
}