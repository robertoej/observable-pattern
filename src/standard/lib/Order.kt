package standard.lib

import java.util.*

class Order(var status: String = "CREATED"): Observable() {

    fun changeStatus(newStatus: String) {
        status = newStatus
        setChanged()
        notifyObservers(status)
    }
}