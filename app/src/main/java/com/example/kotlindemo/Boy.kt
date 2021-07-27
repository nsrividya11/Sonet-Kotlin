package com.example.kotlindemo

class Boy :Person2(){
    override fun displayAge(age: Int) {              //extensibility
        super.displayAge(age)
        println("My fake age is ${age-5}")
    }
}