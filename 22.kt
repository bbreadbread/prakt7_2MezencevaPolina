import kotlin.math.*

fun main() {
    try {
        print("k= ")
        val k = readln()!!.toInt()
        print("l= ")
        val l = readln()!!.toInt()
        print("m= ")
        val m = readln()!!.toInt()
        print("x= ")
        val x = readln()!!.toDouble()
        var min = minOf(k, l)
        var max = maxOf(k, l)
        if (m == min){
            var y = sin(abs(x)) / sqrt(x.pow(2.0) + 1)
            var z = y.pow(4.0) - y.pow(2.0) + 5
            println("y(x) = ${y}\nz(y) = ${z}")
        }
        else if (m == max){
            var y = abs(x) * ln(1 + x)
            var z = y.pow(4.0) - y.pow(2.0) + 5
            println("y(x) = ${y}\nz(y) = ${z}")
        }
        else if(min <= m && m <= max){
            var y = x.pow(3.0) + x + Math.pow(10.0, -2.0)
            var z = y.pow(4.0) - y.pow(2.0) + 5
            println("y(x) = ${y}\nz(y) = ${z}")
        }
        else {
            var y = -1.0
            var z = y.pow(4.0) - y.pow(2.0) + 5
            println("y(x) = ${y}\nz(y) = ${z}")
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат введенных данных")
    }
}