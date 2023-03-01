class Person (name : String, private val age : Int)

object Person {
  def printPerson () : Unit = {
    val taro = new Person("Taro",35)
    println(taro.age)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    Person.printPerson()
  }
}
