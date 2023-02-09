abstract class Animal(
   val name: String,
   val legCount: Int = 4
) {
   init{
      println("Hello, my name is $name")
   }
   abstract fun makeSound()
}

class Dog(name: String): Animal(
  name
) {
   fun bark(){
      println("WUFF!!")
   }
   override fun makeSound(){
      println("WOOFF!!")
   }
}
fun main(){
   // anonymous class - temporary object
   var bear = object: Animal("Camembear"){
      override fun makeSound(){
         println("Roooar!!")
      }
   }
   val dog = Dog("Fluffy")
   println("$dog.name")
   dog.bark()
   dog.makeSound()

   // Exceptions
   // val number = readLine() ?: "0"
   val number = "HELLO"
   val parseNumber = try {
      number.toInt()
   } catch(e: Exception) {
      0
   }
   println(parseNumber)

   fun List<String>.customCount(function: (String) -> Boolean): Int {
      var counter = 0
      for (string in this) {
         if (function(string)) counter++
      }
      return counter
   }
   // Lamba functions - functions that we pass to other functions
   val list = listOf("Kotlin", "is", "fun")
   val count = list.customCount {
      currentString -> currentString.length >= 3
   }
   println(count)

   
}