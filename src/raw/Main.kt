package raw

fun main() {
    val channels = listOf(StoreChannel(), CustomerChannel())

    val order = Order(channels = channels)

    order.changeStatus("CONFIRMED")
    printCurrentOrderStatus(order)
    order.changeStatus("CONCLUDED")
    printCurrentOrderStatus(order)
}

private fun printCurrentOrderStatus(order: Order) {
    println("The current order status is ${order.status}")
}