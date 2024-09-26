//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    val Z1 = listOf((1..9).random(),(1..9).random(),(1..9).random(),(1..9).random(),(1..9).random())
    Z1.forEach { el -> print("$el ") }
    println("\n${Z1[0]} - ${Z1.first()}")

    println("\nЗадание 2")
    val Z2 = listOf((1..9).random(),(1..9).random(),(1..9).random(),(1..9).random(),(1..9).random())
    var avr =0.0
    Z2.forEach { el ->
        print("$el ")
        avr+=el }
    avr /= Z2.size
    println("\n$avr - ${Z2.average()}")

    println("\nЗадание 3")
    val Z3 = listOf((1..9).random(),(1..9).random(),(1..9).random(),(1..9).random(),(1..9).random())
    var sum =0
    Z3.forEach { el ->
        print("$el ")
        sum+=el }
    println("\n$sum - ${Z3.sum()}")

    println("\nЗадание 4")
    val Z4 = listOf((1..9).random(),(1..9).random(),(1..9).random(),(1..9).random(),(1..9).random())
    var cnt =0
    Z4.forEach { el ->
        print("$el ")
        cnt++ }
    println("\n$cnt - ${Z4.size} - ${Z4.count()}")

    println("\nЗадание 5")
    val Z5 = listOf((1..9).random(),(1..9).random(),(1..9).random(),(1..9).random(),(1..9).random())
    val lstTwo = arrayListOf<Int>()
    Z5.forEach { el -> print("$el ")}
    for (i in Z5.size-1 downTo Z5.size-2) lstTwo.add(0,Z5[i])
    println("\n${lstTwo} - ${Z5.takeLast(2)}")

    println("\nЗадание 6")
    val Z6 = listOf((1..9).random(),(1..9).random(),(1..9).random(),(1..9).random(),(1..9).random())
    var iSum = 0
    var iSum2 = 0
    Z6.forEach { el -> print("$el ")}
    for (i in 0..Z6.size-1) iSum+=i
    for (i in Z6.indices) iSum2+=i
    println("\n${iSum} - ${iSum2}")
}