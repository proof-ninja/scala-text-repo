object Find {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(find(list) (x => x > 3):Option[Int])
  }


  def find[T](list: List[T])(f: T => Boolean): Option[T] = list match {
    case x :: xs if f(x) => Some(x):Option[T]   //x::xs は、要素 x（今回は、リストの先頭の要素） と xs（残りの要素のリスト）に分解.f(x) は、関数 f に x を適用し、結果が真かどうかを評価
    case x :: xs => find(xs)(f)                 //上記以外の場合、次以降の要素xsをfindする(再帰)
    case _ => None
  }
}
