package raw

class Order(var status: String = "CREATED",
            private val channels: List<Channel> = ArrayList()) {

    fun changeStatus(newStatus: String) {
        status = newStatus
        channels.forEach { it.update() }
    }
}