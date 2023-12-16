// Простой класс, представляющий фрукт
data class Fruit(val name: String, var quantity: Int) {
    
    // Функция для изменения количества фруктов
    fun updateQuantity(operation: (Int) -> Int) {
        quantity = operation(quantity)
    }
}

// Функции для удобства работы с обновлением количества фруктов
fun addAmount(amount: Int) = { x: Int -> x + amount }
fun reduceAmount(amount: Int) = { x: Int -> if (x >= amount) x - amount else x }

fun main() {
    // Создание экземпляра класса Fruit
    val apple = Fruit("Яблоко", 10)
    
    // Использование универсальной функции для изменения количества фруктов
    apple.updateQuantity(addAmount(5))
    println("Количество яблок: ${apple.quantity}")
    
    apple.updateQuantity(reduceAmount(3))
    println("Количество яблок: ${apple.quantity}")
    
    apple.updateQuantity(reduceAmount(20))
    println("Количество яблок: ${apple.quantity}")
}

// В последнем рефакторинге мы оставили класс Fruit без изменений, но создали вспомогательные
// функции addAmount и reduceAmount, которые возвращают лямбда-выражения для увеличения и уменьшения
// количества фруктов соответственно. Затем мы использовали эти вспомогательные функции в main
// для обновления количества фруктов.
