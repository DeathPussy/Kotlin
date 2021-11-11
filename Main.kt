fun main() {
    myFun(name="Марина", age = 12, city = "Санкт-Петербург")
    function()
    val s = numbers(5,5)
    println(s)
    func()
    funArray()
}

fun myFun(name: String, age: Int, city: String) {
    print("Имя: $name\nВозраст: $age\nГород: $city\n\n")
}

fun function() {
    val i = 1
    val p = 1
    if (i == p) {
        print("Переменная i равна $i\n\n")
    }
    else {
        print("Переменная i не равна $p\n\n")
    }
}

fun numbers(x: Int, y: Int): Int {
    return x + y
}

fun func() {
    val x: (Int, Int) -> Int = {f, d -> f + d }
    val result = x(50, 50)
    println(result)
}

fun funArray() {
    val array = arrayOf(666, 332, 825, 295, 913, 194, 780)
    println(array)
}
