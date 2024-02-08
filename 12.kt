fun main() {

    try {
        print("x= ")
        val x = readLine()!!.toDouble()
        print("y= ")
        val y = readLine()!!.toDouble()

        print("а.")
        if (y >= -x - 1 && y <= x + 1 && y >= x - 1 && y <= x - 1)
        {
            print("Принадлежит\n")
        }
        print("б.")
        if (y >= -x - 1 && y <= x + 1 && y >= x - 1 && y <= x - 1)
        {
            print("Принадлежит\n")
        }
        print("в.")
        if (y >= -x - 1 && y <= x + 1 && y >= x - 1 && y <= x - 1)
        {
            print("Принадлежит\n")
        }

    }catch (e:Exception){
        println("Неверный формат введенных данных")
    }
}