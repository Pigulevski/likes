fun main() {
    while (true) {
        val people: String
        print("Введите количество лайков или end для завершения:")
        val likes = readln()
        if (likes == "end") {
            break
        } else {
            val numberLikes = likes.toCharArray()
            val number1 = numberLikes[numberLikes.size - 1]
            if (numberLikes.size > 1) {
                val number2 = numberLikes[numberLikes.size - 2]
                if (number1 == '1' && number2 != '1') {
                    people = "человеку"
                } else people = "людям"
            } else if (number1 == '1') {
                people = "человеку"
            } else people = "людям"
            println("Нравится $likes $people")
        }
    }
}