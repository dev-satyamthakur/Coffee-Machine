// Global variables for coffee ingredients
var waterLeft = 400
var milkLeft = 540
var coffeeBeansLeft = 120
var cupsLeft = 9
var moneyCollected = 550

fun main(args: Array<String>) {

    printMachineInfo()

    println("Write action (buy, fill, take): ")
    val action = readln()

    when (action) {
        "buy" -> {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
            val coffeeType = readln()

            if (coffeeType == "1") { // espresso
                waterLeft -= 250
                coffeeBeansLeft -= 16
                moneyCollected += 4
                cupsLeft -= 1
            }
            if (coffeeType == "2") { // latte
                waterLeft -= 350
                milkLeft -= 75
                coffeeBeansLeft -= 20
                moneyCollected += 7
                cupsLeft -= 1
            }
            if (coffeeType == "3") { // cappuccino
                waterLeft -= 200
                milkLeft -= 100
                coffeeBeansLeft -= 12
                moneyCollected += 6
                cupsLeft -= 1
            }

            printMachineInfo()
        }

        "fill" -> {
            println("Write how many ml of water you want to add:")
            val waterToAdd = readln().toInt()

            println("Write how many ml of milk you want to add: ")
            val milkToAdd = readln().toInt()

            println("Write how many grams of coffee beans you want to add: ")
            val coffeeBeansToAdd = readln().toInt()

            println("Write how many disposable cups you want to add: ")
            val cupsToAdd = readln().toInt()

            waterLeft += waterToAdd
            milkLeft += milkToAdd
            coffeeBeansLeft += coffeeBeansToAdd
            cupsLeft += cupsToAdd

            printMachineInfo()
        }

        "take" -> {
            println("I gave you $moneyCollected")
            moneyCollected = 0

            printMachineInfo()
        }
    }

}

fun printMachineInfo() {
    println("The coffee machine has:")
    println("$waterLeft ml of water\n" +
            "$milkLeft ml of milk\n" +
            "$coffeeBeansLeft g of coffee beans\n" +
            "$cupsLeft disposable cups\n" +
            "\$${moneyCollected} of money")
}