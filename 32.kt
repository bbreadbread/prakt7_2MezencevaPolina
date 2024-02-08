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

        val one = maxOf(x1,x2)
        val one_2 = minOf(x1,x2)
        val two = minOf(x3,x4)

        val three = maxOf(y1,y2)
        val four = minOf(y3,y4)

        val five = minOf(y1,y2)
        val six = maxOf(y3,y4)

        var prov = true
        if (one < two || three < four || five > six)
        {
            prov = false
        }
        else {prov = true}

            var x = one - two
            var y = three - four
            var s = x * y

        println(prov)
        if (prov == true){
            println("Площадь пересечения прямоугольников: " + s)
        }

    }catch (e:Exception){
        println("Неверный формат введенных данных")
    }
}