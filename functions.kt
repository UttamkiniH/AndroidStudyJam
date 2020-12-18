fun main() {
    val num = 7+6
    val name="john"
    print("My name ")
    print("is ${name} ") // to comment
    println("and I like to eat ${num} samosa") //binod likes 10 samosa
    println("Your Samosa\n") 
    printSamosa()
    printSamosa()
    printSamosa()
 
}

fun printSamosa(){
    println("                 -/")
    println("                -/++")
    println("              --/++++")
    println("            ---/++++++ ")
    println("           ---/++++++++ ")
    println("         ----/++++++++++ ")
    println("        ----/++++++++++++ ")
    println("      -----/+++++++++++++++ ")
    println("     -----/+++++++++++++++++ ")
    println("    -----/+++++++++++++++++++ ")
    
}


//repeatfunction and calling printSamosa

fun main() {
    val num = 2
    val name="john"
    print("My name ")
    print("is ${name} ") // to comment
    println("and I like to eat ${num} samosa") //binod likes 10 samosa
    repeat(num){
        print("=")
    }
   // println("================")
    //println("===============")
    println("\nYour Samosa") //\n-newline character
    printSamosa()
    printSamosa()
    printSamosa()
 
}

fun printSamosa(){
    println("                 -/")
    println("                -/++")
    println("              --/++++")
    println("            ---/++++++ ")
    println("           ---/++++++++ ")
    println("         ----/++++++++++ ")
    println("        ----/++++++++++++ ")
    println("      -----/+++++++++++++++ ")
    println("     -----/+++++++++++++++++ ")
    println("    -----/+++++++++++++++++++ ")
    
}
