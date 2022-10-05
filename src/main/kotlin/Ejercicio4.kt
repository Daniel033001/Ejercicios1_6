package Ejercicios1_6
import java.util.*
class Ejercicio4 {
}

fun calificar(cali: Int):String{
    if(cali<=100&&cali>=95){
        return "Excelente"
    }else if(cali<=94&&cali>=85){
        return "Notable"
    }else if(cali<=84&&cali>=75){
        return "Bueno"
    }else if(cali<=74&&cali>=70){
        return "Suficiente"
    }else return "Desempeño insuficiente"
}

fun calificaciones(asignaturas: Array<String>,calificaciones: Array<Int>){
    for(pos in 0..asignaturas.size-1){
        println(asignaturas.get(pos).toUpperCase()+" "+calificar(calificaciones.get(pos)))
    }

}



fun main(){
    val asignaturas= arrayOf<String>("Fundamentos de Investigacion","Programacion Movil",
        "Estructura de datos","Calculo Integral","Ecuaciones Diferenciales")
    val calificaciones= arrayOf<Int>(99,70,69,71,50)
    calificaciones(asignaturas,calificaciones)
}

