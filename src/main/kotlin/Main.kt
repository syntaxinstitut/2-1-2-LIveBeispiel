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

    // println: mit zeilenumbruch
    println("Bitte gib dein Geburtsdatum sein und drücke danach Enter")

    // readln ist eine Funktion, die einen in die Konsole eingegebenen String zurückgibt. Dieser String wird in birthdate gespeichert.
    var birthdate = readln()

    // print: ohne zeilenumbruch, den haben wir manuell mit \n eingefügt:
    print("Ahaa, dein Geburtstag ist also am $birthdate \n")
    println("Alles Gute!")


    // andere DATENTYPEN: Int, Double, Boolean

    var firstNumber: Double = 10.0
    var secondNumber: Int = 3

    // mit ints und doubles rechnen:
    var resultAddition: Double = firstNumber+secondNumber
    var resultMinus = firstNumber-secondNumber
    var resultMal = firstNumber*secondNumber
    var resultDivision = firstNumber/secondNumber

    println("Erste Zahl: $firstNumber")
    println("Zweite Zahl: $secondNumber")
    println("Resultat Addition: $resultAddition")
    println("Resultat Subtraktion: $resultMinus")
    println("Resultat Mal: $resultMal")
    println("Resultat Division: $resultDivision")

    // BOOLEAN
    // boolean initialisieren
    var isSunShining: Boolean = true
    println("It's $isSunShining that the sun is shining.")
    // boolean Aktualisieren:
    isSunShining = false
    println("It's $isSunShining that the sun is shining.")







}