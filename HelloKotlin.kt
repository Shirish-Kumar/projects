// Fizz Buzz Logic 1
fun main() {
   for (i in 1..100) {
       var satisfied: String? = null

       if (i % 3 == 0) {print("Fizz"); satisfied = ""}
       if (i % 5 == 0) {print("Buzz"); satisfied = ""}

       satisfied ?: print(i)
       println()
   }
}