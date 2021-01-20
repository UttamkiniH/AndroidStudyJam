//the number is greater than condition is met
fun main(){
    val num = 7
    if ( num>5) { //condition is met
    println("The number is greater than 5")
    }
}

//the number is lesser than which means condition is not met
fun main(){
    val num = 5
    if(num < 3)
    {
        println(" The number is less than 3")
    }
}

//using if else
fun main(){
    val num = 6
    if(num > 5)
    {
        println("You get ${num} samosa")
    }
    else
    {
        println(" you wont get any samosa")
    }
}

//using >=
fun main(){
    val num = 5
    if(num > 5)
    {
        println("You get ${num} samosa")
    }
    else
    {
        println(" you wont get any samosa")
    }
}

//drawbak of using condition
fun main(){
    val num = 9
    if(num >= 5)
    {
        println("You get ${num} samosa")
    }
    else if(num==9)
    {
        println(" you wont get any samosa")
    }
}

fun main(){
    val num = 9
    if(num==9)
    {
        println("You wont get  samosa")
    }
    else if(num>=5)
    {
        println(" you will get ${num} samosa")
    }
}
