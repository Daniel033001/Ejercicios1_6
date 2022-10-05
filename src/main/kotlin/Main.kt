class Main {
}

fun descuento(des: Double, price: Double):Double{
    val priceDes= price-(price*des)
    return priceDes
}
fun iva(iva: Double, price: Double):Double{
    val priceIva= price+(price*iva)
    return priceIva
}
fun cesta(productos: Array<Double>, porcentaje: Double,operacion:(Double, Double)->Double): Double{
    var total=0.0
    for (pos in 0..productos.size-1){
        total+=operacion(porcentaje,productos.get(pos))
    }
    return total
}

fun main(){
    val numeros = arrayOf<Double>(15.0,25.0,33.0,6.5,3.5);
    val iva=0.10
    val des=0.20
    println("Iva " + cesta(numeros,iva,::iva))
    println("Descuento "+ cesta(numeros,des,::descuento))

}