abstract class Responsible {
    private next: Responsible? = null
    private resposiblePerson: String? = null
    
    constructor(responsiblePerson: String) {
        this.responsiblePerson = responsiblePerson
    }

    fun setNext(next: Responsible): Responsible {
        this.next = next
        return next
    }

    fun putQuestion(question: Question) {
        if (judgeAble(question)) {
            judge(question)
        } else if (next != null) {
            next.putQuestion(question)
        } else {
            println("not found")
        }
    }

    abstract fun judgeAble(question: Question): Boolean
    abstract fun judge(question: Question)
}