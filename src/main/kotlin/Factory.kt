interface Animal

class Lion : Animal
class Panda : Animal

abstract class AnimalFactory {
    abstract fun create(): Animal

    companion object {
        inline fun <reified T : Animal> createFactory(): AnimalFactory = when (T::class) {
            LionFactory::class -> LionFactory()
            PandaFactory::class -> PandaFactory()
            else -> throw IllegalArgumentException()
        }
    }
}

class LionFactory : AnimalFactory() {
    override fun create(): Animal = Lion()
}

class PandaFactory : AnimalFactory() {
    override fun create(): Animal = Panda()
}

fun main(args: Array<String>) {
    println(LionFactory().create())
    println(PandaFactory().create())
}