import kotlin.math.*

fun main() {
    try {
        print("k= ")
        val k = readLine()!!.toInt()
        print("l= ")
        val l = readLine()!!.toInt()
        print("m= ")
        val m = readLine()!!.toInt()
        print("x= ")
        val x = readLine()!!.toDouble()
        when (k < l)
        {
            true ->
            {
                when (m == k)
                {
                    true ->
                    {
                        var y = sin(abs(x))/ sqrt(x.pow(2.0)+1)
                        var z = y.pow(4.0) - y.pow(2.0) + 5
                        println("y(x) = ${y}\nz(y) = ${z}")
                    }
                    false ->
                    {
                        var y = x.pow(3.0) + x + Math.pow(10.0, -2.0)
                        var z = y.pow(4.0) - y.pow(2.0) + 5
                        println("y(x) = ${y}\nz(y) = ${z}")
                    }
                }
            }
            false ->
            {
                when (m == l)
                {
                    true ->
                    {
                        var y = abs(x)* ln(1+x)
                        var z = y.pow(4.0) - y.pow(2.0) + 5
                        println("y(x) = ${y}\nz(y) = ${z}")
                    }
                    false ->
                    {
                        var y = abs(x)* ln(1+x)
                        var z = y.pow(4.0) - y.pow(2.0) + 5
                        println("y(x) = ${y}\nz(y) = ${z}")
                    }
                }
            }
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат введенных данных")
    }
}