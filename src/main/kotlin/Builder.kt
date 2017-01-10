data class User(
    val id: Int,
    val name: String,
    val age: Int
) {
    class Builder {
        var id: Int? = null
        var name: String? = null
        var age: Int? = null

        fun build(): User = User(
            requireNotNull(id),
            requireNotNull(name),
            requireNotNull(age)
        )
    }

    companion object {
        fun build(predicate: Builder.() -> Unit): User {
            return Builder().apply { predicate() }.build()
        }
    }
}

fun main(args: Array<String>) {
    User.build { 
        id = 1
        name = "bill"
        age = 12
    }
}
