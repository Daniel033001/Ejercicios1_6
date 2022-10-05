package Ejercicios1_6

import kotlin.math.pow
import kotlin.math.sqrt

class Ejercicio6 {
}

fun media(numeros: Array<Int>):Double{
    var media=0.0
    for (pos in 0..numeros.size-1){
        media+=numeros.get(pos)
    }
    return media/numeros.size
}

fun valoresAtipicos(numeros: Array<Int>){
    var x=0.0
    val media=media(numeros)
    val tipica= desTipica(numeros)
    for (pos in 0..numeros.size-1){
        x=(numeros.get(pos)-media)/tipica
        println(x)
    }
}

fun desTipica(numeros: Array<Int>): Double{
    var suma=0.0
    var tipica=0.0
    val media=media(numeros)
    var aux=0.0
    for (pos in 0..numeros.size-1){
        aux=numeros.get(pos)-media
        suma+=aux.pow(2)
    }
    tipica= sqrt(suma/numeros.size)
    return tipica
}



fun main(){
    val numeros = arrayOf<Int>(1, 2, 3, 4, 5)
    valoresAtipicos(numeros)
}