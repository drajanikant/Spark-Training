object My {
  def main(args: Array[String]): Unit = {
    val point1 = new Point(2, 3)
    point1.x  // 2
    println(point1)  // prints (2, 3)

    def factorial(x: Int): Int = {
      def fact(x: Int, accumulator: Int): Int = {
        if (x <= 1) accumulator
        else fact(x - 1, x * accumulator)
      }
      fact(x, 1)
    }

    println("Factorial of 2: " + factorial(5))
    println("Factorial of 3: " + factorial(3))
  }
}

class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}
