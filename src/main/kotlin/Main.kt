fun main(args: Array<String>) {
    val amount = 1000000
    val commission = 0.75
    val minSum = 3500
    var totalCommisson = if (amount * commission / 100 > minSum) {(amount * commission)/10000} else {minSum/100}
    println("$totalCommisson  рублей составляет комиссия")
}