package standard.lib

import java.util.*

class CustomerChannel: Observer {

    override fun update(o: Observable?, arg: Any?) {
        println("Performing update in customer channel...")
    }
}