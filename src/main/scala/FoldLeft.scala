object Main {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    println(reverse(list))
  }
  def reverse[T](list:List[T]):List[T] = list.foldLeft(List[T]())((acc,element) => element :: acc)
}
