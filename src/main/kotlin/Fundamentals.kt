fun main() {
    val name = "Jonathan"
    val price = 100
    val amount = 10

    println("Hi $name. You must pay ${price * amount}")

    val name2 = "juan de la cruz"
    val capitalizeFirstLetter1 = name2.replaceFirst("j", "J") // must know what letter to replace

    val capitalizeFirstLetter2 = name2.replaceFirstChar { it.uppercase() }
    // no need to know the first letter

    println(capitalizeFirstLetter1)
    println(capitalizeFirstLetter2)
}