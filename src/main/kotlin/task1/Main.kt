package task1/*
    Реализуйте класс Shape и подклассы Circle/Rectangle/Triangle, посчитайте
    общую площадь через полиморфизм
 */

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(34),
        Rectangle(15, 17),
        Triangle(12, 18)
    )

    val totalShape = shapes.sumOf { it.Square() }
    shapes.forEach { println("Площади фигуры: ${it.Square()}")}
    println("Общая площадь: $totalShape")
}