import kotlin.math.PI

fun main() {
    println("Seleccione una opcion:")
    println("1. Calcular area de un cuadrado")
    println("2. Calcular area de un circulo")
    println("3. Calcular area de un triangulo")
    print("Ingrese el numero de la opcion: ")

    val opcion = readLine()!!.toInt()

    when(opcion) {
        1 -> {
            print("Ingrese el lado del cuadrado: ")
            val lado = readLine()!!.toDouble()
            val areaCuadrado = lado * lado
            println("El area del cuadrado es: $areaCuadrado")
        }
        2 -> {
            print("Ingrese el radio del círculo: ")
            val radio = readLine()!!.toDouble()
            val areaCirculo = PI * radio * radio
            println("El area del circulo es: $areaCirculo")
        }
        3 -> {
            print("Ingrese la base del triangulo: ")
            val base = readLine()!!.toDouble()
            print("Ingrese la altura del triangulo: ")
            val altura = readLine()!!.toDouble()
            val areaTriangulo = 0.5 * base * altura
            println("El área del triángulo es: $areaTriangulo")
        }
        else -> println("Opcion no valida.")
    }
}
