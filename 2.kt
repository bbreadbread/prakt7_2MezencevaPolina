fun main() {
    try {
        print("x= ")
        val x = readLine()!!.toDouble()
        print("y= ")
        val y = readLine()!!.toDouble()
        val x2 = Math.pow(x, 2.0)
        val y2 = Math.pow(y, 2.0)
        print("1.")
        when(x < y)
        {
            true -> println("z = " + (x + 0.5) / (1 + y2))
            false -> println("z = " + (y + 0.5) / (1 + x2))
        }
        print("2.")
        when (x<0)
        {
            true -> println("z = " + y)
            false -> println("z = " + x)
        }
        print("3.")
        when (y<0)
        {
            true ->
            {
                when( x2 < y2 )
                {
                    true-> println("z = " + y2)
                    false -> println("z = " + x2)
                }
            }
            false -> println("z = " + x)
        }
    }catch (e:Exception){
        println("Неверный формат введенных данных")
    }
}