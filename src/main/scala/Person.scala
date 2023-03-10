class Person (name : String, private val age : Int)

object Person {
  def printPerson () : Unit = {
    val taro = new Person("Taro",30)
    println(taro.age)
  }
  def main(args: Array[String]): Unit = {
    Person.printPerson()
  }
}
