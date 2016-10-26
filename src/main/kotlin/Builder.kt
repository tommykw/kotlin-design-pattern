class Param() {
    private var id = 0
    private var title = ""
    private var description = ""

    fun id(id: Int): Int
        get() = this.id
        set(value) = { field = value } 

    fun title(title: String): String
        get() = this.title
        set(value) = { field = value }

    fun description(description: String): String
        get() = this.description
        set(value) = { field = value }

    inner class Builder() {
        constructor(init: Builder.() -> Unit): this() {
            init()
        }

        fun id(init: () -> Unit) {
            //
        }
    }    
}
