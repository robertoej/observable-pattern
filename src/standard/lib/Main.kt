package standard.lib

fun main() {
    val order = Order()
    order.addObserver(StoreChannel())
    order.addObserver(CustomerChannel())

    order.changeStatus("CONFIRMED")
    printCurrentOrderStatus(order)
    order.changeStatus("CONCLUDED")
    printCurrentOrderStatus(order)
}

private fun printCurrentOrderStatus(order: Order) {
    println("The current order status is ${order.status}")
}