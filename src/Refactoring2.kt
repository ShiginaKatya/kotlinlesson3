class TreeItem(val title: String) {

    fun addSubItem( subTitle: String) = 
        create("$title.$subTitle")
            .apply { print ("Added ${title}") }
    
    fun create(title: String): TreeItem? = TreeItem(title)
}

fun main(){
    val tree_item = TreeItem("item")
    tree_item.addSubItem("sub_item")
}

// рефакторинг
// class TreeItem(val title: String) {

//     fun addSubItem( subTitle: String) = 
//         create("$title.$subTitle")
//             .apply { print ("Added ${this?.title} in " + 
//             "$this@TreeItem.title") }
    
//     fun create(title: String): TreeItem? = TreeItem(title)
// }

// fun main(){
//     val tree_item = TreeItem("item")
//     tree_item.addSubItem("sub_item")
// }