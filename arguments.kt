//error
fun main()
{	val smile=" :) "
    println("Hey Binoid!")
    printSymbol(smile)
    
}

fun printSymbol(){
    println(smile)
}

//without error
fun main()
{	val smile=" :) "
    println("Hey Binoid!")
    printSymbol(smile)
    
}

fun printSymbol(smile: String){
    println(smile)
}

//two arguments
fun main()
{	val smile=" :) "
    val name="Binod"
    printSymbol(smile,name)
    
}

fun printSymbol(smile: String,name: String){
    println(smile)
    println("Hey ${name}")
}
