
// Простой класс, представляющий фрукт
data class Fruit(val name: String, var quantity: Int) {
    
    // Функция для изменения количества фруктов
    fun updateQuantity(operation: (Int) -> Int) {
        quantity = operation(quantity)
    }
}

fun main() {
    // Создание экземпляра класса Fruit
    val apple = Fruit("Яблоко", 10)
    
    // Использование универсальной функции для изменения количества фруктов
    apple.updateQuantity { it + 5 }
    println("Количество яблок: ${apple.quantity}")
    
    apple.updateQuantity { it - 3 }
    println("Количество яблок: ${apple.quantity}")
    
    apple.updateQuantity { if (it >= 20) it - 20 else it }
    println("Количество яблок: ${apple.quantity}")
}
// Мы изменили метод updateQuantity, чтобы он принимал одну операцию, а не значение.
// Это позволяет использовать лямбда-выражения для более компактного обновления количества фруктов.
