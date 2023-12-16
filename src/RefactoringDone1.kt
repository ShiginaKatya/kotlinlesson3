
// Простой класс, представляющий фрукт
class Fruit(val name: String, var quantity: Int) {
    
    // Функция для изменения количества фруктов
    fun updateQuantity(amount: Int, operation: (Int, Int) -> Int) {
        quantity = operation(quantity, amount)
    }
}

fun main() {
    // Создание экземпляра класса Fruit
    val apple = Fruit("Яблоко", 10)
    
    // Использование универсальной функции для изменения количества фруктов
    apple.updateQuantity(5) { old, new -> old + new }
    println("Количество яблок: ${apple.quantity}")
    
    apple.updateQuantity(3) { old, new -> old - new }
    println("Количество яблок: ${apple.quantity}")
    
    apple.updateQuantity(20) { old, new -> if (old >= new) old - new else old }
    println("Количество яблок: ${apple.quantity}")
}
// В первом рефакторинге мы изменили методы класса Fruit
// на более универсальную функцию updateQuantity, которая принимает операцию в качестве параметра.
// Это позволяет обновлять количество фруктов с помощью различных операций,
// таких как увеличение, уменьшение и другие. В main мы используем эту универсальную функцию
// для обновления количества фруктов.
