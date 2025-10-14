fun main() {
    println("Send an input and i will divide it by two!")
    var input = readln().toIntOrNull() ?: 0
    if(input != null) {
        println("The output is ${input / 2}")
    } else {
        println("Your input wasn't valid.")
    }

}