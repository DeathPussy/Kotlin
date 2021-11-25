fun main() {
    Person(first_name = "Марина", last_name = "Ульянова", age = 12, city = "Санкт-Петербург").setting(true)
    Leviok(name = "Мариша", age = 12, info = "Прелесть").setting(true)
    TvoyDedOnline(first_name = "Соня", last_name = "Весёлова", age = 12, city = "Санкт-Петербург").setting(true)
}

class Person(var first_name: String, var last_name: String, var age: Int, var city: String) {
    fun setting(oni: Boolean) {
        if (oni) {
            println("Имя: $first_name\nФамилия: $last_name\nВозраст: $age\nГород: $city\n")
        }
    }
}

abstract class User(var username: String) {
    abstract fun setting(oni: Boolean)

}

class Leviok(var name: String, var age: Int, var info: String):
User(username = "levio.k") {
    override fun setting(oni: Boolean) {
        if (oni) {
            println("никнэйм: $username\nИмя: $name\nВозраст: $age\nИнформация: $info\n")
        }
    }
}

class TvoyDedOnline(var first_name: String, var last_name: String, var age: Int, var city: String):
User(username = "tvoy.ded_online") {
    override fun setting(oni: Boolean) {
        println("никнэйм: $username\nИмя: $first_name\nФамилия: $last_name\nВозраст: $age\nГород: $city\n")
    }
}
