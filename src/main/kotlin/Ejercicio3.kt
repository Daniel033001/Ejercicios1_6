package Ejercicios1_6

class Ejercicio3 {
}

fun main() {
    val frase = "Me gusta mucho programar en kotlin"
    println(diccionario(frase))

}

fun diccionario(frase: String): Map<String, Int> {
    val dic: MutableMap<String, Int> = mutableMapOf()
    val partes = listOf(*frase.split(" ".toRegex()).toTypedArray())
    for (i in partes.indices) {
        dic[partes[i]] = partes[i].length
    }
    return dic
}