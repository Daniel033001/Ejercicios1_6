package Ejercicios1_6

class Ejercicio2 {
}

fun sumar(num: Int): Int{
    return num+20
}

fun sumarLista(num: Array<Int> , operacion:(Int)->Int): Array<Int> {
    for (posicion in 0..num.size-1){
        num.set(posicion,operacion(num.get(posicion)))
        println(num.get(posicion))
    }
    return num
}

fun main() {
    val numeros = arrayOf<Int>(10,20,30,40,50,60,70,80,90);
    sumarLista(numeros, ::sumar)
}