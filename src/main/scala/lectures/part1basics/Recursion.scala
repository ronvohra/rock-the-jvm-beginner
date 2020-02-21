package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial_stack(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
  }
  println(factorial_stack(5))

  def factorial(n: Int): Int = {
    @tailrec
    def factHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }

  def concat(s: String, n: Int): String = {
    @tailrec
    def concatHelper(m: Int, accumulator: String): String =
      if (m <= 0) accumulator
      else concatHelper(m - 1, accumulator + s)

    concatHelper(n, "")
  }
  println(concat("hello", 3))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeHelper(t - 1, (n % t != 0) && isStillPrime)

    isPrimeHelper(n / 2, true)
  }

  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciHelper(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fibonacciHelper(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fibonacciHelper(2, 1, 1)
  }
}
