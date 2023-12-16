
fun getTestResult(mark: Int): String = if (mark < 50) {
    "you failed the test"
} else if (mark >= 50 && mark <= 75 ) {
    "you passed the test"
} else {
    "сongratulations, you passed the test with a high score"
}

// рефакторинг
// fun getTestResult(mark: Int): String = when {
//     mark < 50 -> "you failed the test"
//     mark >= 50 && mark <= 75 -> "you failed the test"
//     else-> "you failed the test"
// }
