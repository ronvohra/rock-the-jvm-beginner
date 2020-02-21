package lectures.part1basics

object Expressions extends App {
 val x: Int = 1 + 2
  println(x)

  val cond = if (x < 3) 5  else 7

  var aVariable = 5
  val aWeirdValue = (aVariable = 3)  // type - unit
  // side effects are expressions returning unit

  val aCodeBlock = {
    val y = 2
    val z = y - 1

    if (z > 2) "hello" else "goodbye"
  }  // code block variables (inside) aren't available outside. Type of code block is the last expression type
}
