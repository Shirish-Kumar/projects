// Fizz Buzz Logic 1

/**
 * It prints the numbers from 1 to 100, but for multiples of three it prints "Fizz" instead of the
 * number and for the multiples of five it prints "Buzz". For numbers which are multiples of both three
 * and five it prints "FizzBuzz".
 */
fun main() {
   for (i in 1..100) {
       var satisfied: String? = null

       if (i % 3 == 0) {print("Fizz"); satisfied = ""}
       if (i % 5 == 0) {print("Buzz"); satisfied = ""}

       satisfied ?: print(i)
       println()
   }
}