import kotlin.math.pow
fun main() {

    try {
        print("a= ")
        val a = readLine()!!.toDouble()
        print("b= ")
        val b = readLine()!!.toDouble()
        print("c= ")
        val c = readLine()!!.toDouble()
        var D = b.pow(2.0) - 4 * a * c
        if(D < 0.0) println("Нет действительных корней")
        else if (D == 0.0) println("Один действительный корней")
        else println("Два действительных корня")
    }
    catch (e:Exception)
    {
        println("Неверный формат введенных данных")
    }
}