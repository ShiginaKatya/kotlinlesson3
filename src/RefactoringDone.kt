import java.sql.DriverManager.println

// Простой класс, представляющий фрукт
class Fruit(val name: String, var quantity: Int) {

    // Функция для увеличения количества фруктов
    fun addQuantity(amount: Int) {
        quantity += amount
    }

    // Функция для уменьшения количества фруктов
    fun reduceQuantity(amount: Int) {
        if (quantity >= amount) {
            quantity -= amount
        } else {
            println("Недостаточно фруктов")
        }
    }
}

fun main() {
    // Создание экземпляра класса Fruit
    val apple = Fruit("Яблоко", 10)

    // Использование методов для изменения количества фруктов
    apple.addQuantity(5)
    println("Количество яблок: ${apple.quantity}")

    apple.reduceQuantity(3)
    println("Количество яблок: ${apple.quantity}")

    apple.reduceQuantity(20) // Недостаточно фруктов
    println("Количество яблок: ${apple.quantity}")
}

// В этом коде мы создаем простой класс Fruit, 
// который представляет фрукт с указанием названия и текущего количества.
// У класса есть два метода: addQuantity, который увеличивает количество фруктов,
// и reduceQuantity, который уменьшает количество фруктов на указанное значение.

// Затем в функции main мы создаем экземпляр класса Fruit,
// и с помощью методов этого класса изменяем количество фруктов и выводим результаты в консоль.
