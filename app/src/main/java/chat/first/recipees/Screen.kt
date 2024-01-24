package chat.first.recipees

sealed class Screen (val route : String){
    object RecipeScreen:Screen("reciprescreen")
    object DetailScreen:Screen("detailscreen")

}