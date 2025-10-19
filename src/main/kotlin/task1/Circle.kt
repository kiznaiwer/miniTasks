package task1

import kotlin.math.PI

class Circle(val radius: Int): Shape() {
    override fun Square(): Double{
        return (PI * (radius * radius)).toDouble()
    }

}