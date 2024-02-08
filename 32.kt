import kotlin.math.sqrt
import kotlin.math.pow
import kotlin.math.round

fun main() {

    try {
        println("M1")
        print("x1 = ")
        val x1 = readLine()!!.toDouble()
        print("y1 = ")
        val y1 = readLine()!!.toDouble()

        println("M2")
        print("x1 = ")
        val x2 = readLine()!!.toDouble()
        print("y1 = ")
        val y2 = readLine()!!.toDouble()

        println("N1")
        print("x1 = ")
        val x3 = readLine()!!.toDouble()
        print("y1 = ")
        val y3 = readLine()!!.toDouble()

        println("N2")
        print("x1 = ")
        val x4 = readLine()!!.toDouble()
        print("y1 = ")
        val y4 = readLine()!!.toDouble()

        val left = maxOf(x1,x3)
        val top = minOf(y2,y4)
        val right = minOf(x2,x4)
        val bottom = maxOf(y1,y3)

        val w = right - left
        val h = top - bottom

        when(w< 0||h<0)
        {
            true-> println("Ошибка")
            false-> println("Площадь пересечения прямоугольников: " + (w * h))
        }
    }catch (e:Exception){
        println("Неверный формат введенных данных")
    }
}