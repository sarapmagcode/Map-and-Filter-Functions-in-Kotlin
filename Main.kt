
fun main() {
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges["Barbara"] = 42
    peopleAges["Joe"] = 51
    peopleAges["Fred"] = 31

    // map() -> applies transformation to each item in a collection
    println(peopleAges.map { "${it.key} ${it.value}" }.joinToString(", "))

    // filter() -> items in a collection that match, based on an expression
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)
}
