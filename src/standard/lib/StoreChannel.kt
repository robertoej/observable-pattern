package standard.lib

import java.util.*

class StoreChannel: Observer {

    override fun update(o: Observable?, arg: Any?) {
        println("Performing update in store channel...")
    }
}