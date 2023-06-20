fun main() {

    // Initialisierung: Variable, camelCase: fullName, firstAndLastName, isUserLoggedIn, etc.
    var firstName = "Harry"
    println("Alter Name bei Initialisierung: $firstName")

    // Aktualisierung:
    firstName = "Ron"
    println("Neuer Name bei Aktualisierung: $firstName")

    // Konstante, in SNAKE_CASE, DAYS_OF_THE_WEEK, DAY_OF_BIRTH, etc.
    val LAST_NAME = "Weasley"
    // LAST_NAME = "Potter"
    println(LAST_NAME)

    val PI = 3.14
    val WEEK_DAYS = 7

    println("Zusammengesetzter Name: " + firstName+ " " + LAST_NAME)

    // variable, die aus mehreren anderen zusammengesetzten Variablen besteht:
    var fullName = firstName + " " + LAST_NAME
    println("fullName Variable: $fullName")





}