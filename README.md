# Observable Pattern Example
This Kotlin project exemplifies two simple observable pattern implementations.
## Raw implementation
In the package `raw` you will find an implementation from scratch, since the observer interface. No libraries are employed in the raw version of the implementation.
## Standard lib implementation
In the package `standard.lib` you will find an implementation that uses the `Observable` class and the `Observer` interface from the Java standard library.
## Testing the application
Each package contains a main class or running the implementations. It will print out in the console the object update and how the observers receive the events.