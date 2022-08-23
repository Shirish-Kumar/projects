// Fizz Buzz Logic 2
/**
 * `validate` takes an integer, an array of integers, and a variable number of strings. It returns true
 * if the integer is divisible by any of the integers in the array, and prints the corresponding string
 * 
 * @param num The number to be validated
 * @param divisors Array<Int> = arrayOf(3, 5)
 * @param display The strings to print if the number is divisible by the corresponding divisor.
 * @return A boolean value.
 */
fun validate(num: Int, divisors: Array<Int>, vararg display: String): Boolean {
    var satisfied: String? = null
    divisors.forEachIndexed { index, divisor ->
        if (num % divisor == 0) {print(display[index]); satisfied = "" }
    }
    satisfied ?: return false
    return true
}

fun main() {
    for (i in 1..100) {
        val divisors = arrayOf(3,5)
        val display = arrayOf("Fizz","Buzz")

        if (!validate(i,divisors,*display)) print(i)
        println()
    }
}

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