fun main(args: Array<String>) {
    Singleton.p()
}

object Singleton {
    init { println("Initialize object") }
    fun p() = println("echo object: $this")
}