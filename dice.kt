//without class
fun main() {
    val diceRange = 1..6
    val randomNumber=diceRange.random()//or you can write it as 1..6.random()
    println("number is ${randomNumber}")
}

//with class
fun main(){
    val myFirstDice=Dice()
    println(myFirstDice.sides)
    myFirstDice.roll()
}
  class Dice {
        val sides = 6
      
      fun roll(){
		val randomNumber=(1..6).random()
        println(randomNumber)
      }
        
        
    }
    
    //using a lot
    fun main(){
    val myFirstDice=Dice() //myFirstDice has Dice properties
    val diceRoll=myFirstDice.roll() //roll action has to be implemented in myFirestDice
    println("The ${myFirstDice.sides} has rolled the number ${diceRoll}") //
    
}
  class Dice {
        val sides = 6
      
      fun roll(): Int{ //for function to send int type we use funName():spaceDatatype - roll(): Int
		val randomNumber=(1..6).random()
        return randomNumber //instead of sending the println(string type) we are returning the int value
      }
        
        
    }
    
    //with some changes
    fun main(){
    val myFirstDice=Dice(6) //first dice with 6 sides and with arguments 6
    val mySecondDice=Dice(20) //second dice with 20 sides and with arguments 20
   val diceRoll=myFirstDice.roll()
   
    println("The ${myFirstDice.numSides} has rolled the number ${diceRoll}")
    println("The ${mySecondDice.numSides} has rolled the number ${mySecondDice.roll()}")
    
}
  class Dice(val numSides: Int) { //kotlin accepts the argument 6 and stores it for first dice

      fun roll(): Int{
		val randomNumber=(1..numSides).random()
        return randomNumber
      }
        
        
    }
    
    //final code
    
    fun main(){
    val myFirstDice=Dice(6) //first dice with 6 sides and with arguments 6
    val mySecondDice=Dice(20) //second dice with 20 sides and with arguments 20
    println("The ${myFirstDice.numSides} has rolled the number ${myFirstDice.roll()}")
    println("The ${mySecondDice.numSides} has rolled the number ${mySecondDice.roll()}")
    
}
  class Dice(val numSides: Int) { //kotlin accepts the argument 6 and stores it for first dice
      fun roll(): Int{
		return (1..numSides).random()
        }   
    }
