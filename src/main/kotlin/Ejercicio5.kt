package Ejercicios1_6

import kotlin.math.*

class Ejercicio5 {
}
fun moduloVector(a: Double, b: Double):Double{
    var c= sqrt(a.pow(2)+b.pow(2))
    return c
}

fun main(){
    val a=2.0
    val b=5.0
    println(moduloVector(a,b))
}