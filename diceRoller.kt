//basic programming for dice
fun  main()
{
    val myFirstDice = Dice()
    val diceResult = myFirstDice.roll()
    println(" your 6 sided dice has rolled ${diceResult}")
    
}
class Dice(){
    fun roll() : Int
    {
        return (1..6).random()
    }
}

//with the sides
fun  main()
{
    val myFirstDice = Dice(6)
    val diceResult = myFirstDice.roll()
    println(" your ${myFirstDice.numSides} sided dice has rolled ${diceResult}")
    
}
class Dice(val numSides : Int){
    fun roll() : Int
    {
        return (1..numSides).random()
    }
}

//using condition
fun  main()
{
    val myFirstDice = Dice(6)
    val diceResult = myFirstDice.roll()
    val luckyNumber = 1
    if (diceResult == luckyNumber )
    	println(" you are lucky")
    else
    	println("your dice rolled ${diceResult} so try again to win")
    
}
class Dice(val numSides : Int){
    fun roll() : Int
    {
        return (1..numSides).random()
    }
}

//using if else condition
fun  main()
{
    val myFirstDice = Dice(6)
    val diceResult = myFirstDice.roll()
    val luckyNumber = 1
    if (diceResult == luckyNumber )
    	println(" you are lucky")
    else if(diceResult == 2)
    	println("your dice rolled ${diceResult} no luck this time")
    else if(diceResult == 3)
    	println("your dice rolled ${diceResult} no luck this time")
    else if(diceResult == 4)
    	println("your dice rolled ${diceResult} no luck this time")
     else if(diceResult == 5)
    	println("your dice rolled ${diceResult} no luck this time")
     else
    	println("your dice rolled ${diceResult} no luck this time")
    
}
class Dice(val numSides : Int){
    fun roll() : Int
    {
        return (1..numSides).random()
    }
}

//using when  condition
fun  main()
{
    val myFirstDice = Dice(6)
    val diceResult = myFirstDice.roll()
    val luckyNumber = 1
  
    when (diceResult)
    {
        luckyNumber -> println(" lucky numberrrrr!!!!")
        2 ->  println("your dice rolled ${diceResult} no luck this time")
        3 ->  println("your dice rolled ${diceResult} no luck this time")
        4 -> println("your dice rolled ${diceResult} no luck this time")
        5 -> println("your dice rolled ${diceResult} no luck this time")
        6 -> println("your dice rolled ${diceResult} no luck this time")
    }
    
}
class Dice(val numSides : Int){
    fun roll() : Int
    {
        return (1..numSides).random()
    }
}
